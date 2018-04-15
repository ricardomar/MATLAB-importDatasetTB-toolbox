function datasetVidereStereo= importDatasetVidereStereo(path)
    import jParserToolbox.*;
    extractedPath=extractPath(path);
       
    jParser=jVidereParser(path);
    parsedFile=jParser.parseFile();
    
    sizeDataset=size(parsedFile,1); 
    
    datasetVidereStereo=struct;

    datasetVidereStereo.rawdata(sizeDataset).timestamp=0;
    datasetVidereStereo.rawdata(sizeDataset).image_left=zeros(240,320,'uint8');
    datasetVidereStereo.rawdata(sizeDataset).image_right=zeros(240,320,'uint8');
    
    for i=1:sizeDataset          
        image_rightPath=[extractedPath,char(parsedFile(i).getPathRight())];
        image_leftPath=[extractedPath,char(parsedFile(i).getPathLeft())];               
        datasetVidereStereo.rawdata(i).timestamp=parsedFile(i).getTimestamp();               
        datasetVidereStereo.rawdata(i).image_right=imread(image_rightPath);
        datasetVidereStereo.rawdata(i).image_left=imread(image_leftPath);
    end