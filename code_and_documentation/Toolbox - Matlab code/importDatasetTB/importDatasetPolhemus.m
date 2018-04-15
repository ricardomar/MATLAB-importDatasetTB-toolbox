function datasetPolhemus= importDatasetPolhemus(path)

    import jParserToolbox.*;
    jParser=jPolhemusParser(path);
    parsedFile=jParser.parseFile();
    
    datasetPolhemus=struct;        
    sizeDataset=size(parsedFile,1);       
    
    datasetPolhemus.rawdata(sizeDataset).timestamp=0;
    datasetPolhemus.rawdata(sizeDataset).X=0;
    datasetPolhemus.rawdata(sizeDataset).Y=0;
    datasetPolhemus.rawdata(sizeDataset).Z=0;
    datasetPolhemus.rawdata(sizeDataset).YAW=0;
    datasetPolhemus.rawdata(sizeDataset).PITCH=0;
    datasetPolhemus.rawdata(sizeDataset).ROLL=0;
     
    for i=1:sizeDataset
        datasetPolhemus.rawdata(i).timestamp=parsedFile(i).getTimestamp();
        temp=parsedFile(i).getPosition();
        
        datasetPolhemus.rawdata(i).X=temp(1);
        datasetPolhemus.rawdata(i).Y=temp(2);
        datasetPolhemus.rawdata(i).Z=temp(3);
        temp=parsedFile(i).getOrientation();
        datasetPolhemus.rawdata(i).YAW=temp(1);
        datasetPolhemus.rawdata(i).PITCH=temp(2);
        datasetPolhemus.rawdata(i).ROLL=temp(3);
    end