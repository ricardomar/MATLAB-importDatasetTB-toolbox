function datasetKineticAcc= importDatasetKineticAcc(path)

    import jParserToolbox.*;
    jParser=jKineticAccParser(path);
    parsedFile=jParser.parseFile();
    
    datasetKineticAcc=struct;        
    sizeDataset=size(parsedFile,1);       
    
    datasetKineticAcc.rawdata(sizeDataset).timestamp=0;
    datasetKineticAcc.rawdata(sizeDataset).accXraw=0;
    datasetKineticAcc.rawdata(sizeDataset).accYraw=0;
    datasetKineticAcc.rawdata(sizeDataset).accZraw=0;
    datasetKineticAcc.rawdata(sizeDataset).accX=0;
    datasetKineticAcc.rawdata(sizeDataset).accY=0;
    datasetKineticAcc.rawdata(sizeDataset).accZ=0;
     
    for i=1:sizeDataset
        datasetKineticAcc.rawdata(i).timestamp=parsedFile(i).getTimestamp();
        temp=parsedFile(i).getAccRaw();
        
        datasetKineticAcc.rawdata(i).accXraw=temp(1);
        datasetKineticAcc.rawdata(i).accYraw=temp(2);
        datasetKineticAcc.rawdata(i).accZraw=temp(3);
        
        temp=parsedFile(i).getAcc();
        datasetKineticAcc.rawdata(i).accX=temp(1);
        datasetKineticAcc.rawdata(i).accY=temp(2);
        datasetKineticAcc.rawdata(i).accZ=temp(3);
    end