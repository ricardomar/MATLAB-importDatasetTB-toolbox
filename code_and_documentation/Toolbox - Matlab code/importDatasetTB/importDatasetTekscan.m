function datasetTekscan=importDatasetTekscan(path,idSessionType,msStartTime,hzFrequency)


    if strcmp(idSessionType,'tekscantactileXML2MATLAB')
        import jParserToolbox.*;
        jParser=jTekscanParser(path);
        parsedFile=jParser.parseFile();
    
    
        datasetTekscan=struct; 
    
        sizeDataset=size(parsedFile,1);

        datasetTekscan.rawdata(sizeDataset).timestamp=0;
        datasetTekscan.rawdata(sizeDataset).tDistal=zeros(1,16);
        datasetTekscan.rawdata(sizeDataset).tProximal=zeros(1,12);
        
        datasetTekscan.rawdata(sizeDataset).iDistal=zeros(1,16)
        datasetTekscan.rawdata(sizeDataset).iMedial=zeros(1,12);
        datasetTekscan.rawdata(sizeDataset).iProximal=zeros(1,12);
        
        datasetTekscan.rawdata(sizeDataset).mDistal=zeros(1,16);
        datasetTekscan.rawdata(sizeDataset).mMedial=zeros(1,12);
        datasetTekscan.rawdata(sizeDataset).mProximal=zeros(1,12);
        
        datasetTekscan.rawdata(sizeDataset).rDistal=zeros(1,16);
        datasetTekscan.rawdata(sizeDataset).rMedial=zeros(1,12);
        datasetTekscan.rawdata(sizeDataset).rProximal=zeros(1,12);
        
        datasetTekscan.rawdata(sizeDataset).lDistal=zeros(1,16);
        datasetTekscan.rawdata(sizeDataset).lMedial=zeros(1,12);
        datasetTekscan.rawdata(sizeDataset).lProximal=zeros(1,12);
        
        datasetTekscan.rawdata(sizeDataset).pFingers=zeros(1,76);
        datasetTekscan.rawdata(sizeDataset).pInternal=zeros(1,45);
        datasetTekscan.rawdata(sizeDataset).pExternal=zeros(1,52);
       

        for i=1:sizeDataset

            datasetTekscan.rawdata(i).timestamp=parsedFile(i).getTimestamp();
            
            datasetTekscan.rawdata(i).tDistal(1:16)=parsedFile(i).getDatatDistal();
            datasetTekscan.rawdata(i).tProximal(1:12)=parsedFile(i).getDatatProximal();
            
            datasetTekscan.rawdata(i).iDistal(1:16)=parsedFile(i).getDataiDistal();
            datasetTekscan.rawdata(i).iMedial(1:12)=parsedFile(i).getDataiMedial();
            datasetTekscan.rawdata(i).iProximal(1:12)=parsedFile(i).getDataiProximal();
            
            datasetTekscan.rawdata(i).mDistal(1:16)=parsedFile(i).getDatamDistal();
            datasetTekscan.rawdata(i).mMedial(1:12)=parsedFile(i).getDatamMedial();
            datasetTekscan.rawdata(i).mProximal(1:12)=parsedFile(i).getDatamProximal();
            
            datasetTekscan.rawdata(i).rDistal(1:16)=parsedFile(i).getDatarDistal();
            datasetTekscan.rawdata(i).rMedial(1:12)=parsedFile(i).getDatarMedial();
            datasetTekscan.rawdata(i).rProximal(1:12)=parsedFile(i).getDatarProximal();
            
            datasetTekscan.rawdata(i).lDistal(1:16)=parsedFile(i).getDatalDistal();
            datasetTekscan.rawdata(i).lMedial(1:12)=parsedFile(i).getDatalMedial();
            datasetTekscan.rawdata(i).lProximal(1:12)=parsedFile(i).getDatalProximal();
            
            datasetTekscan.rawdata(i).pFingers(1:76)=parsedFile(i).getDatapFingers();
            datasetTekscan.rawdata(i).pInternal(1:45)=parsedFile(i).getDatapInternal();
            datasetTekscan.rawdata(i).pExternal(1:52)=parsedFile(i).getDatapExternal();
        end
		
	
    elseif strcmp(idSessionType,'tekscantactileRAW2MATLAB') || strcmp(idSessionType,'tekscantactileRAW2XML')

        fileInput= fileread(path);
        [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(fileInput, '\n');

        dataRawFile=splits;

        [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(6)), ' ');
        sensorType=char(splits(2));

        [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(12)), ' ');
        noiseThreshold=char(splits(2));

        [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(16)), ' ');
        sensitivity=char(splits(2));

        [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(19)), ' ');
        units=char(splits(2));

        [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(18)), ' ');
        nSamples=str2double(char(splits(2)));

        %msStartTime
        %hzFrequency
        %%hzFrequency=500;
        %%msStartTime=1000;
        msTimeStep=(1/hzFrequency)*1000;

        units=strcat(units,'_',sensorType,'_',sensitivity);

        datasetTekscan.metadata.tDistal(1:16)={units};
        datasetTekscan.metadata.tProximal(1:12)={units};

        datasetTekscan.metadata.iDistal(1:16)={units};
        datasetTekscan.metadata.iMedial(1:12)={units};
        datasetTekscan.metadata.iProximal(1:12)={units};

        datasetTekscan.metadata.mDistal(1:16)={units};
        datasetTekscan.metadata.mMedial(1:12)={units};
        datasetTekscan.metadata.mProximal(1:12)={units};

        datasetTekscan.metadata.rDistal(1:16)={units};
        datasetTekscan.metadata.rMedial(1:12)={units};
        datasetTekscan.metadata.rProximal(1:12)={units};

        datasetTekscan.metadata.lDistal(1:16)={units};
        datasetTekscan.metadata.lMedial(1:12)={units};
        datasetTekscan.metadata.lProximal(1:12)={units};

        datasetTekscan.metadata.pFingers(1:76)={units};
        datasetTekscan.metadata.pInternal(1:45)={units};
        datasetTekscan.metadata.pExternal(1:52)={units};


        for i=1:nSamples
            datasetTekscan.rawdata(i).timestamp=msStartTime+(i-1)*msTimeStep;

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+0+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).iDistal(1:4)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mDistal(1:4)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rDistal(1:4)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lDistal(1:4)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];    

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+1+((i-1)*31))), ',');    
            datasetTekscan.rawdata(i).iDistal(5:8)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mDistal(5:8)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rDistal(5:8)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lDistal(5:8)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];    

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+2+((i-1)*31))), ',');    
            datasetTekscan.rawdata(i).iDistal(9:12)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mDistal(9:12)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rDistal(9:12)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lDistal(9:12)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];    

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+3+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).iDistal(13:16)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mDistal(13:16)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rDistal(13:16)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lDistal(13:16)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];    

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+5+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).iMedial(1:4)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mMedial(1:4)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rMedial(1:4)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lMedial(1:4)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+6+((i-1)*31))), ',');  
            datasetTekscan.rawdata(i).iMedial(5:8)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mMedial(5:8)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rMedial(5:8)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lMedial(5:8)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+7+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).iMedial(9:12)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mMedial(9:12)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rMedial(9:12)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lMedial(9:12)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+9+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).iProximal(1:4)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mProximal(1:4)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rProximal(1:4)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lProximal(1:4)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+10+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).iProximal(5:8)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mProximal(5:8)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rProximal(5:8)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lProximal(5:8)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+11+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).iProximal(9:12)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10))];
            datasetTekscan.rawdata(i).mProximal(9:12)=[str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15))];
            datasetTekscan.rawdata(i).rProximal(9:12)=[str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20))];
            datasetTekscan.rawdata(i).lProximal(9:12)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+13+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pFingers(1:19)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15)),str2double(splits(16)),str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+14+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pFingers(20:38)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15)),str2double(splits(16)),str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+15+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).tDistal(1:4)=[str2double(splits(1)),str2double(splits(2)),str2double(splits(3)),str2double(splits(4))];
            datasetTekscan.rawdata(i).pFingers(39:57)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15)),str2double(splits(16)),str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+16+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).tDistal(5:8)=[str2double(splits(1)),str2double(splits(2)),str2double(splits(3)),str2double(splits(4))];
            datasetTekscan.rawdata(i).pFingers(58:76)=[str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14)),str2double(splits(15)),str2double(splits(16)),str2double(splits(17)),str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+17+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).tDistal(9:12)=[str2double(splits(1)),str2double(splits(2)),str2double(splits(3)),str2double(splits(4))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+18+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).tDistal(13:16)=[str2double(splits(1)),str2double(splits(2)),str2double(splits(3)),str2double(splits(4))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+20+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).tProximal(1:4)=[str2double(splits(1)),str2double(splits(2)),str2double(splits(3)),str2double(splits(4))];
            datasetTekscan.rawdata(i).pExternal(1:4)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+21+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).tProximal(5:8)=[str2double(splits(1)),str2double(splits(2)),str2double(splits(3)),str2double(splits(4))];
            datasetTekscan.rawdata(i).pExternal(5:8)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+22+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).tProximal(9:12)=[str2double(splits(1)),str2double(splits(2)),str2double(splits(3)),str2double(splits(4))];
            datasetTekscan.rawdata(i).pExternal(9:12)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+23+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pExternal(13:16)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+24+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pInternal(1:9)=[str2double(splits(6)),str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14))];
            datasetTekscan.rawdata(i).pExternal(17:20)=[str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+25+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pInternal(10:18)=[str2double(splits(6)),str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14))];
            datasetTekscan.rawdata(i).pExternal(21:28)=[str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+26+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pInternal(19:27)=[str2double(splits(6)),str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14))];
            datasetTekscan.rawdata(i).pExternal(29:36)=[str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+27+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pInternal(28:36)=[str2double(splits(6)),str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14))];
            datasetTekscan.rawdata(i).pExternal(37:44)=[str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];

            [start_idx, end_idx, extents, matches, tokens,names, splits] = regexp(char(dataRawFile(25+28+((i-1)*31))), ',');
            datasetTekscan.rawdata(i).pInternal(37:45)=[str2double(splits(6)),str2double(splits(7)),str2double(splits(8)),str2double(splits(9)),str2double(splits(10)),str2double(splits(11)),str2double(splits(12)),str2double(splits(13)),str2double(splits(14))];
            datasetTekscan.rawdata(i).pExternal(45:52)=[str2double(splits(18)),str2double(splits(19)),str2double(splits(20)),str2double(splits(21)),str2double(splits(22)),str2double(splits(23)),str2double(splits(24)),str2double(splits(25))];
        end   

        
        clear dataRawFile end_idx extents fileInput hzFrequency i matches msStartTime msTimeStep nSamples names noiseThreshold sensitivity sensorType splits start_idx tokens units

        
        if strcmp(idSessionType,'tekscantactileRAW2XML')
            
            control=0;
            fileOutput = fopen('outputDataset.xml','wt');
            outputXML='<?xml version="1.0" encoding="UTF-8" ?>\n<dataset>\n';
            fprintf(fileOutput,outputXML);
            outputXML='<units>\n';
            fprintf(fileOutput,outputXML);
            
            for i=1:16 
                outputXML=['<tDistal',num2str(i),'>',datasetTekscan.metadata.tDistal{1,i},'</tDistal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<tProximal',num2str(i),'>',datasetTekscan.metadata.tProximal{1,i},'</tProximal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end

            for i=1:16
                outputXML=['<iDistal',num2str(i),'>',datasetTekscan.metadata.iDistal{1,i},'</iDistal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<iMedial',num2str(i),'>',datasetTekscan.metadata.iMedial{1,i},'</iMedial',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<iProximal',num2str(i),'>',datasetTekscan.metadata.iProximal{1,i},'</iProximal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end

            for i=1:16
                outputXML=['<mDistal',num2str(i),'>',datasetTekscan.metadata.mDistal{1,i},'</mDistal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<mMedial',num2str(i),'>',datasetTekscan.metadata.mMedial{1,i},'</mMedial',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<mProximal',num2str(i),'>',datasetTekscan.metadata.mProximal{1,i},'</mProximal',num2str(i),'>\n'];    
                fprintf(fileOutput,outputXML);
            end

            for i=1:16
                outputXML=['<rDistal',num2str(i),'>',datasetTekscan.metadata.rDistal{1,i},'</rDistal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<rMedial',num2str(i),'>',datasetTekscan.metadata.rMedial{1,i},'</rMedial',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<rProximal',num2str(i),'>',datasetTekscan.metadata.rProximal{1,i},'</rProximal',num2str(i),'>\n'];    
                fprintf(fileOutput,outputXML);
            end

            for i=1:16
                outputXML=['<lDistal',num2str(i),'>',datasetTekscan.metadata.lDistal{1,i},'</lDistal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<lMedial',num2str(i),'>',datasetTekscan.metadata.lMedial{1,i},'</lMedial',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:12
                outputXML=['<lProximal',num2str(i),'>',datasetTekscan.metadata.lProximal{1,i},'</lProximal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end

            for i=1:76
                outputXML=['<pFingers',num2str(i),'>',datasetTekscan.metadata.pFingers{1,i},'</pFingers',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:45
                outputXML=['<pInternal',num2str(i),'>',datasetTekscan.metadata.pInternal{1,i},'</pInternal',num2str(i),'>\n'];
                fprintf(fileOutput,outputXML);
            end
            for i=1:52
                outputXML=['<pExternal',num2str(i),'>',datasetTekscan.metadata.pExternal{1,i},'</pExternal',num2str(i),'>\n'];    
                fprintf(fileOutput,outputXML);
            end


            outputXML='</units>\n<data>\n';
            fprintf(fileOutput,outputXML);


            for j=1:size(datasetTekscan.rawdata,2)
                outputXML=['<rawdata timestamp="',num2str(datasetTekscan.rawdata(j).timestamp),'">\n'];
                fprintf(fileOutput,outputXML);
                
                for i=1:16 
                    outputXML=['<tDistal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).tDistal(i)),'</tDistal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<tProximal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).tProximal(i)),'</tProximal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end

                for i=1:16
                    outputXML=['<iDistal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).iDistal(i)),'</iDistal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<iMedial',num2str(i),'>',num2str(datasetTekscan.rawdata(j).iMedial(i)),'</iMedial',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<iProximal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).iProximal(i)),'</iProximal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end

                for i=1:16
                    outputXML=['<mDistal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).mDistal(i)),'</mDistal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<mMedial',num2str(i),'>',num2str(datasetTekscan.rawdata(j).mMedial(i)),'</mMedial',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<mProximal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).mProximal(i)),'</mProximal',num2str(i),'>\n'];    
                    fprintf(fileOutput,outputXML);
                end

                for i=1:16
                    outputXML=['<rDistal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).rDistal(i)),'</rDistal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<rMedial',num2str(i),'>',num2str(datasetTekscan.rawdata(j).rMedial(i)),'</rMedial',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<rProximal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).rProximal(i)),'</rProximal',num2str(i),'>\n'];    
                    fprintf(fileOutput,outputXML);
                end

                for i=1:16
                    outputXML=['<lDistal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).lDistal(i)),'</lDistal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<lMedial',num2str(i),'>',num2str(datasetTekscan.rawdata(j).lMedial(i)),'</lMedial',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:12
                    outputXML=['<lProximal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).lProximal(i)),'</lProximal',num2str(i),'>\n'];    
                    fprintf(fileOutput,outputXML);
                end

                for i=1:76
                    outputXML=['<pFingers',num2str(i),'>',num2str(datasetTekscan.rawdata(j).pFingers(i)),'</pFingers',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:45
                    outputXML=['<pInternal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).pInternal(i)),'</pInternal',num2str(i),'>\n'];
                    fprintf(fileOutput,outputXML);
                end
                for i=1:52
                    outputXML=['<pExternal',num2str(i),'>',num2str(datasetTekscan.rawdata(j).pExternal(i)),'</pExternal',num2str(i),'>\n'];    
                    fprintf(fileOutput,outputXML);
                end    

                outputXML='</rawdata>\n';
                fprintf(fileOutput,outputXML);
            end


            outputXML='</data>\n</dataset>';
            fprintf(fileOutput,outputXML);


            fclose(fileOutput);
            control=1;
            
            datasetTekscan=control;
        end		
    end


        
        
        
        