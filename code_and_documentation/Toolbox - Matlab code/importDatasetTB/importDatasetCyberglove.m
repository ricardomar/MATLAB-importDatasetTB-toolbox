function datasetCyberglove=importDatasetCyberglove(path)
    
    import jParserToolbox.*;
    jParser=jCybergloveParser(path);
    parsedFile=jParser.parseFile();
    
    
    datasetCyberglove=struct;        
    sizeDataset=size(parsedFile,1);  
    datasetCyberglove.rawdata(sizeDataset).timestamp=0;    
    datasetCyberglove.rawdata(sizeDataset).tTMJ=0;
    datasetCyberglove.rawdata(sizeDataset).tMPJ=0;
    datasetCyberglove.rawdata(sizeDataset).tIJ=0;
    datasetCyberglove.rawdata(sizeDataset).tAbd=0;
    datasetCyberglove.rawdata(sizeDataset).iMPJ=0;
    datasetCyberglove.rawdata(sizeDataset).iPIJ=0;
    datasetCyberglove.rawdata(sizeDataset).iDIJ=0;
    datasetCyberglove.rawdata(sizeDataset).mMPJ=0;
    datasetCyberglove.rawdata(sizeDataset).mPIJ=0;    
    datasetCyberglove.rawdata(sizeDataset).mDIJ=0;
    datasetCyberglove.rawdata(sizeDataset).miAbd=0;
    datasetCyberglove.rawdata(sizeDataset).rMPJ=0;
    datasetCyberglove.rawdata(sizeDataset).rPIJ=0;
    datasetCyberglove.rawdata(sizeDataset).rDIJ=0;
    datasetCyberglove.rawdata(sizeDataset).rmAbd=0;
    datasetCyberglove.rawdata(sizeDataset).lMPJ=0;
    datasetCyberglove.rawdata(sizeDataset).lPIJ=0;
    datasetCyberglove.rawdata(sizeDataset).lDIJ=0;
    datasetCyberglove.rawdata(sizeDataset).lrAbd=0;
    datasetCyberglove.rawdata(sizeDataset).pArch=0;
    datasetCyberglove.rawdata(sizeDataset).wPitch=0;
    datasetCyberglove.rawdata(sizeDataset).wYaw=0;    
    

    for i=1:sizeDataset
        datasetCyberglove.rawdata(i).timestamp=parsedFile(i).getTimestamp();
        
        data=parsedFile(i).getData();
        
        datasetCyberglove.rawdata(i).tTMJ=data(1);
        datasetCyberglove.rawdata(i).tMPJ=data(2);
        datasetCyberglove.rawdata(i).tIJ=data(3);
        datasetCyberglove.rawdata(i).tAbd=data(4);
        datasetCyberglove.rawdata(i).iMPJ=data(5);
        datasetCyberglove.rawdata(i).iPIJ=data(6);
        datasetCyberglove.rawdata(i).iDIJ=data(7);
        datasetCyberglove.rawdata(i).mMPJ=data(8);
        datasetCyberglove.rawdata(i).mPIJ=data(9);    
        datasetCyberglove.rawdata(i).mDIJ=data(10);
        datasetCyberglove.rawdata(i).miAbd=data(11);
        datasetCyberglove.rawdata(i).rMPJ=data(12);
        datasetCyberglove.rawdata(i).rPIJ=data(13);
        datasetCyberglove.rawdata(i).rDIJ=data(14);
        datasetCyberglove.rawdata(i).rmAbd=data(15);
        datasetCyberglove.rawdata(i).lMPJ=data(16);
        datasetCyberglove.rawdata(i).lPIJ=data(17);
        datasetCyberglove.rawdata(i).lDIJ=data(18);
        datasetCyberglove.rawdata(i).lrAbd=data(19);
        datasetCyberglove.rawdata(i).pArch=data(20);
        datasetCyberglove.rawdata(i).wPitch=data(21);
        datasetCyberglove.rawdata(i).wYaw=data(22);
    end