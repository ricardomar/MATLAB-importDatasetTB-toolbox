function datasetXsens= importDatasetXsens(path)

    import jParserToolbox.*;
    jParser=jXSensParser(path);
    parsedFile=jParser.parseFile();
    
    datasetXsens=struct;        
    sizeDataset=size(parsedFile,1);       
    
    datasetXsens.rawdata(sizeDataset).timestamp=0;
    datasetXsens.rawdata(sizeDataset).accX=0;
    datasetXsens.rawdata(sizeDataset).accY=0;
    datasetXsens.rawdata(sizeDataset).accZ=0;
    
    datasetXsens.rawdata(sizeDataset).gyrX=0;
    datasetXsens.rawdata(sizeDataset).gyrY=0;
    datasetXsens.rawdata(sizeDataset).gyrZ=0;
    
    datasetXsens.rawdata(sizeDataset).magX=0;
    datasetXsens.rawdata(sizeDataset).magY=0;
    datasetXsens.rawdata(sizeDataset).magZ=0;
    
    datasetXsens.rawdata(sizeDataset).quat1=0;
    datasetXsens.rawdata(sizeDataset).quat2=0;
    datasetXsens.rawdata(sizeDataset).quat3=0;
    datasetXsens.rawdata(sizeDataset).quat4=0;
    
    for i=1:sizeDataset
        datasetXsens.rawdata(i).timestamp=parsedFile(i).getTimestamp();

        temp=parsedFile(i).getAcc();        
        datasetXsens.rawdata(i).accX=temp(1);
        datasetXsens.rawdata(i).accY=temp(2);
        datasetXsens.rawdata(i).accZ=temp(3);
        
        temp=parsedFile(i).getGyr();        
        datasetXsens.rawdata(i).gyrX=temp(1);
        datasetXsens.rawdata(i).gyrY=temp(2);
        datasetXsens.rawdata(i).gyrZ=temp(3);
        
        temp=parsedFile(i).getMag();        
        datasetXsens.rawdata(i).magX=temp(1);
        datasetXsens.rawdata(i).magY=temp(2);
        datasetXsens.rawdata(i).magZ=temp(3);
        
        temp=parsedFile(i).getQuat();        
        datasetXsens.rawdata(i).quat1=temp(1);
        datasetXsens.rawdata(i).quat2=temp(2);
        datasetXsens.rawdata(i).quat3=temp(3);
        datasetXsens.rawdata(i).quat4=temp(4);

    end