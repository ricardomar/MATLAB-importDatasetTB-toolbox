function datasetUnibrainMono= importDatasetUnibrainMono(path)
    
    import jParserToolbox.*;
    extractedPath=extractPath(path);
       
    jParser=jUnibrainParser(path);
    parsedFile=jParser.parseFile();
    
    sizeDataset=size(parsedFile,1); 
    
    datasetUnibrainMono=struct;

    datasetUnibrainMono.rawdata(sizeDataset).timestamp=0;
    datasetUnibrainMono.rawdata(sizeDataset).image=zeros(240,320,'uint8');
    
    for i=1:sizeDataset          
        image_Path=[extractedPath,char(parsedFile(i).getPath())];             
        datasetUnibrainMono.rawdata(i).timestamp=parsedFile(i).getTimestamp();               
        datasetUnibrainMono.rawdata(i).image=imread(image_Path);
    end