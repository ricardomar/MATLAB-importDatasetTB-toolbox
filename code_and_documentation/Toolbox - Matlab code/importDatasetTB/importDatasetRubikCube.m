function datasetRubikCube=importDatasetRubikCube(path)

    import jParserToolbox.*;
    jParser=jRubikParser(path);
    parsedFile=jParser.parseFile();
    
    
    datasetRubikCube=struct; 
    
    sizeDataset=size(parsedFile,1);
    
    datasetRubikCube.rawdata(sizeDataset).timestamp=0;
    
    datasetRubikCube.rawdata(sizeDataset).G(1,1:9)=zeros(1,9);
    datasetRubikCube.rawdata(sizeDataset).Gx=0;
    datasetRubikCube.rawdata(sizeDataset).Gy=0;
    datasetRubikCube.rawdata(sizeDataset).Gz=0;

    datasetRubikCube.rawdata(sizeDataset).W(1,1:9)=zeros(1,9);
    datasetRubikCube.rawdata(sizeDataset).Wx=0;
    datasetRubikCube.rawdata(sizeDataset).Wy=0;
    datasetRubikCube.rawdata(sizeDataset).Wz=0;

    datasetRubikCube.rawdata(sizeDataset).O(1,1:9)=zeros(1,9);
    datasetRubikCube.rawdata(sizeDataset).Ox=0;
    datasetRubikCube.rawdata(sizeDataset).Oy=0;
    datasetRubikCube.rawdata(sizeDataset).Oz=0;

    datasetRubikCube.rawdata(sizeDataset).B(1,1:9)=zeros(1,9);
    datasetRubikCube.rawdata(sizeDataset).Bx=0;
    datasetRubikCube.rawdata(sizeDataset).By=0;
    datasetRubikCube.rawdata(sizeDataset).Bz=0;

    datasetRubikCube.rawdata(sizeDataset).R(1,1:9)=zeros(1,9);
    datasetRubikCube.rawdata(sizeDataset).Rx=0;
    datasetRubikCube.rawdata(sizeDataset).Ry=0;
    datasetRubikCube.rawdata(sizeDataset).Rz=0;

    datasetRubikCube.rawdata(sizeDataset).Y(1,1:9)=zeros(1,9);
    datasetRubikCube.rawdata(sizeDataset).Yx=0;
    datasetRubikCube.rawdata(sizeDataset).Yy=0;
    datasetRubikCube.rawdata(sizeDataset).Yz=0;    
    
    
    for i=1:sizeDataset

                                                     
        datasetRubikCube.rawdata(i).timestamp=parsedFile(i).getTimestamp();
        
        
        data=parsedFile(i).getDataGreen();
        datasetRubikCube.rawdata(i).G(1,1:9)=data(1:9);
        datasetRubikCube.rawdata(i).Gx=data(10);
        datasetRubikCube.rawdata(i).Gy=data(11);
        datasetRubikCube.rawdata(i).Gz=data(12);
        
        data=parsedFile(i).getDataWhite();
        datasetRubikCube.rawdata(i).W(1,1:9)=data(1:9);
        datasetRubikCube.rawdata(i).Wx=data(10);
        datasetRubikCube.rawdata(i).Wy=data(11);
        datasetRubikCube.rawdata(i).Wz=data(12);

        data=parsedFile(i).getDataOrange();
        datasetRubikCube.rawdata(i).O(1,1:9)=data(1:9);
        datasetRubikCube.rawdata(i).Ox=data(10);
        datasetRubikCube.rawdata(i).Oy=data(11);
        datasetRubikCube.rawdata(i).Oz=data(12);
        
        data=parsedFile(i).getDataBlue();
        datasetRubikCube.rawdata(i).B(1,1:9)=data(1:9);
        datasetRubikCube.rawdata(i).Bx=data(10);
        datasetRubikCube.rawdata(i).By=data(11);
        datasetRubikCube.rawdata(i).Bz=data(12);
        
        data=parsedFile(i).getDataRed();
        datasetRubikCube.rawdata(i).R(1,1:9)=data(1:9);
        datasetRubikCube.rawdata(i).Rx=data(10);
        datasetRubikCube.rawdata(i).Ry=data(11);
        datasetRubikCube.rawdata(i).Rz=data(12);
        
        data=parsedFile(i).getDataYellow();
        datasetRubikCube.rawdata(i).Y(1,1:9)=data(1:9);
        datasetRubikCube.rawdata(i).Yx=data(10);
        datasetRubikCube.rawdata(i).Yy=data(11);
        datasetRubikCube.rawdata(i).Yz=data(12);
    end
