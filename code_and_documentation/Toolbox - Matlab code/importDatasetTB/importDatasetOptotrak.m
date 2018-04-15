function datasetOptotrak= importDatasetOptotrak(path)

    import jParserToolbox.*;
    jParser=jOptotrakParser(path);
    parsedFile=jParser.parseFile();
    
    datasetOptotrak=struct;        
    sizeDataset=size(parsedFile,1);       
    
    datasetOptotrak.rawdata(sizeDataset).timestamp=0;
    datasetOptotrak.rawdata(sizeDataset).X=0;
    datasetOptotrak.rawdata(sizeDataset).Y=0;
    datasetOptotrak.rawdata(sizeDataset).Z=0;
     
    for i=1:sizeDataset
        datasetOptotrak.rawdata(i).timestamp=parsedFile(i).getTimestamp();

        temp=parsedFile(i).getPosition();        
        datasetOptotrak.rawdata(i).X=temp(1);
        datasetOptotrak.rawdata(i).Y=temp(2);
        datasetOptotrak.rawdata(i).Z=temp(3);

    end