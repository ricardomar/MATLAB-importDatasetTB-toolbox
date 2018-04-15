function datasetKineticDepth= importDatasetKineticDepth(path)
    
    import jParserToolbox.*;
    extractedPath=extractPath(path);
       
    jParser=jKineticDepthParser(path);
    parsedFile=jParser.parseFile();
    
    sizeDataset=size(parsedFile,1); 
    
    datasetKineticDepth=struct;

    datasetKineticDepth.rawdata(sizeDataset).timestamp=0;
    datasetKineticDepth.rawdata(sizeDataset).image=zeros(480,640,'uint16');
    
    for i=1:sizeDataset          
        image_Path=[extractedPath,char(parsedFile(i).getPath())];             
        datasetKineticDepth.rawdata(i).timestamp=parsedFile(i).getTimestamp();               
        datasetKineticDepth.rawdata(i).image=imread(image_Path);
    end