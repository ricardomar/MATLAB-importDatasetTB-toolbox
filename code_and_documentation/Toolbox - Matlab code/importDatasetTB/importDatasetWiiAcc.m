function datasetWiiAcc= importDatasetWiiAcc(path)

    import jParserToolbox.*;
    jParser=jWiiAccParser(path);
    parsedFile=jParser.parseFile();
    
    datasetWiiAcc=struct;        
    sizeDataset=size(parsedFile,1);       
    
    datasetWiiAcc.rawdata(sizeDataset).timestamp=0;

    datasetWiiAcc.rawdata(sizeDataset).accX=0;
    datasetWiiAcc.rawdata(sizeDataset).accY=0;
    datasetWiiAcc.rawdata(sizeDataset).accZ=0;
     
    for i=1:sizeDataset
        datasetWiiAcc.rawdata(i).timestamp=parsedFile(i).getTimestamp();
       
        temp=parsedFile(i).getAcc();
        datasetWiiAcc.rawdata(i).accX=temp(1);
        datasetWiiAcc.rawdata(i).accY=temp(2);
        datasetWiiAcc.rawdata(i).accZ=temp(3);
    end