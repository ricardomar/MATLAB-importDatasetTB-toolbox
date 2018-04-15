function datasetSensingCan=importDatasetSensingCan(path)

    import jParserToolbox.*;
    jParser=jSensingCanParser(path);
    parsedFile=jParser.parseFile();
    

    
    datasetSensingCan=struct; 
    
    sizeDataset=size(parsedFile,1);
    
    datasetSensingCan.rawdata(sizeDataset).timestamp=0;
    
    datasetSensingCan.rawdata(sizeDataset).B01(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B01x=0;
    datasetSensingCan.rawdata(sizeDataset).B01y=0;
    datasetSensingCan.rawdata(sizeDataset).B01z=0;

  
    datasetSensingCan.rawdata(sizeDataset).B02(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B02x=0;
    datasetSensingCan.rawdata(sizeDataset).B02y=0;
    datasetSensingCan.rawdata(sizeDataset).B02z=0;

    datasetSensingCan.rawdata(sizeDataset).B03(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B03x=0;
    datasetSensingCan.rawdata(sizeDataset).B03y=0;
    datasetSensingCan.rawdata(sizeDataset).B03z=0;

    datasetSensingCan.rawdata(sizeDataset).B03(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B03x=0;
    datasetSensingCan.rawdata(sizeDataset).B03y=0;
    datasetSensingCan.rawdata(sizeDataset).B03z=0;

    datasetSensingCan.rawdata(sizeDataset).B04(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B04x=0;
    datasetSensingCan.rawdata(sizeDataset).B04y=0;
    datasetSensingCan.rawdata(sizeDataset).B04z=0;

    datasetSensingCan.rawdata(sizeDataset).B05(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B05x=0;
    datasetSensingCan.rawdata(sizeDataset).B05y=0;
    datasetSensingCan.rawdata(sizeDataset).B05z=0;

    datasetSensingCan.rawdata(sizeDataset).B06(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B06x=0;
    datasetSensingCan.rawdata(sizeDataset).B06y=0;
    datasetSensingCan.rawdata(sizeDataset).B06z=0;

    datasetSensingCan.rawdata(sizeDataset).B07(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B07x=0;
    datasetSensingCan.rawdata(sizeDataset).B07y=0;
    datasetSensingCan.rawdata(sizeDataset).B07z=0;

    datasetSensingCan.rawdata(sizeDataset).B08(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B08x=0;
    datasetSensingCan.rawdata(sizeDataset).B08y=0;
    datasetSensingCan.rawdata(sizeDataset).B08z=0;

    datasetSensingCan.rawdata(sizeDataset).B09(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B09x=0;
    datasetSensingCan.rawdata(sizeDataset).B09y=0;
    datasetSensingCan.rawdata(sizeDataset).B09z=0;

  
    datasetSensingCan.rawdata(sizeDataset).B10(1,1:4)=zeros(1,4);
    datasetSensingCan.rawdata(sizeDataset).B10x=0;
    datasetSensingCan.rawdata(sizeDataset).B10y=0;
    datasetSensingCan.rawdata(sizeDataset).B10z=0;
    
    for i=1:sizeDataset

                                                     
        datasetSensingCan.rawdata(i).timestamp=parsedFile(i).getTimestamp();
        
        data=parsedFile(i).getDataBone();
        datasetSensingCan.rawdata(i).B01(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B01x=data(5);
        datasetSensingCan.rawdata(i).B01y=data(6);
        datasetSensingCan.rawdata(i).B01z=data(7);
        
        
        data=parsedFile(i).getDataBtwo();
        datasetSensingCan.rawdata(i).B02(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B02x=data(5);
        datasetSensingCan.rawdata(i).B02y=data(6);
        datasetSensingCan.rawdata(i).B02z=data(7);
        
        
        data=parsedFile(i).getDataBthree();
        datasetSensingCan.rawdata(i).B03(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B03x=data(5);
        datasetSensingCan.rawdata(i).B03y=data(6);
        datasetSensingCan.rawdata(i).B03z=data(7);

        
        data=parsedFile(i).getDataBfour();
        datasetSensingCan.rawdata(i).B04(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B04x=data(5);
        datasetSensingCan.rawdata(i).B04y=data(6);
        datasetSensingCan.rawdata(i).B04z=data(7);


        data=parsedFile(i).getDataBfive();
        datasetSensingCan.rawdata(i).B05(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B05x=data(5);
        datasetSensingCan.rawdata(i).B05y=data(6);
        datasetSensingCan.rawdata(i).B05z=data(7);

        
        data=parsedFile(i).getDataBsix();
        datasetSensingCan.rawdata(i).B06(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B06x=data(5);
        datasetSensingCan.rawdata(i).B06y=data(6);
        datasetSensingCan.rawdata(i).B06z=data(7);


        data=parsedFile(i).getDataBseven();
        datasetSensingCan.rawdata(i).B07(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B07x=data(5);
        datasetSensingCan.rawdata(i).B07y=data(6);
        datasetSensingCan.rawdata(i).B07z=data(7);

        
        data=parsedFile(i).getDataBeight();
        datasetSensingCan.rawdata(i).B08(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B08x=data(5);
        datasetSensingCan.rawdata(i).B08y=data(6);
        datasetSensingCan.rawdata(i).B08z=data(7);


        data=parsedFile(i).getDataBnine();
        datasetSensingCan.rawdata(i).B09(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B09x=data(5);
        datasetSensingCan.rawdata(i).B09y=data(6);
        datasetSensingCan.rawdata(i).B09z=data(7);

        data=parsedFile(i).getDataBten();
        datasetSensingCan.rawdata(i).B10(1,1:4)=data(1:4);
        datasetSensingCan.rawdata(i).B10x=data(5);
        datasetSensingCan.rawdata(i).B10y=data(6);
        datasetSensingCan.rawdata(i).B10z=data(7);
        
    end
