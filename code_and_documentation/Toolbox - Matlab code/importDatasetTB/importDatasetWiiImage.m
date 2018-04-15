function datasetWiiImage= importDatasetWiiImage(path)
    
    import jParserToolbox.*;
    extractedPath=extractPath(path);
       
    jParser=jWiiImageParser(path);
    parsedFile=jParser.parseFile();
    
    sizeDataset=size(parsedFile,1); 
    
    datasetWiiImage=struct;

    datasetWiiImage.rawdata(sizeDataset).timestamp=0;
    datasetWiiImage.rawdata(sizeDataset).image=zeros(480,640,'uint16');
    
    for i=1:sizeDataset          
        image_Path=[extractedPath,char(parsedFile(i).getPath())];             
        datasetWiiImage.rawdata(i).timestamp=parsedFile(i).getTimestamp();               
        datasetWiiImage.rawdata(i).image=imread(image_Path);
    end