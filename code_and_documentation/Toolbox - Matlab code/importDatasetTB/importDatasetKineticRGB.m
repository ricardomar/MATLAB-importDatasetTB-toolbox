function datasetKineticRGB= importDatasetKineticRGB(path)
    
    import jParserToolbox.*;
    extractedPath=extractPath(path);
       
    jParser=jKineticRGBParser(path);
    parsedFile=jParser.parseFile();
    
    sizeDataset=size(parsedFile,1); 
    
    datasetKineticRGB=struct;

    datasetKineticRGB.rawdata(sizeDataset).timestamp=0;
    datasetKineticRGB.rawdata(sizeDataset).image=zeros(480,640,3,'uint8');
    
    for i=1:sizeDataset          
        image_Path=[extractedPath,char(parsedFile(i).getPath())];             
        datasetKineticRGB.rawdata(i).timestamp=parsedFile(i).getTimestamp();               
        datasetKineticRGB.rawdata(i).image=imread(image_Path);
    end