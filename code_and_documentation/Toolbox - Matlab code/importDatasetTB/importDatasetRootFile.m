function  dataset=importDatasetRootFile(path)

        extractedPath = extractPath(path);

        import jParserToolbox.*;
        jParser=jRootParser(path);
        parsedFile=jParser.parseFile();
    
        numPolhemus=0;
        numVidereStereo=0;
        numTekscanTactile=0;
        numRubikCube=0;
        numCybergloveii=0;
		numUnibrainMono=0;
        
        for i=1:size(parsedFile,1)            
            if strcmp(char(parsedFile(i).getDeviceAliasName()),'polhemus')
                numPolhemus=numPolhemus+1;
                dataset.datasetPolhemus(numPolhemus)=importDatasetTB([extractedPath,char(parsedFile(i).getDataPath())],'polhemus');                
            elseif strcmp(char(parsedFile(i).getDeviceAliasName()),'viderestereo')
                numVidereStereo=numVidereStereo+1;
                dataset.datasetVidereStereo(numVidereStereo)=importDatasetTB([extractedPath,char(parsedFile(i).getDataPath())],'viderestereo');                
            elseif strcmp(char(parsedFile(i).getDeviceAliasName()),'teckscantactile')
                numTekscanTactile=numTekscanTactile+1;
                dataset.datasetTekscan(numTekscanTactile)=importDatasetTB([extractedPath,char(parsedFile(i).getDataPath())],'tekscantactileXML2MATLAB');
            elseif strcmp(char(parsedFile(i).getDeviceAliasName()),'rubikcube')
                numRubikCube=numRubikCube+1;
                dataset.datasetRubikCube(numRubikCube)=importDatasetTB([extractedPath,char(parsedFile(i).getDataPath())],'rubikcube');
            elseif strcmp(char(parsedFile(i).getDeviceAliasName()),'cybergloveii')
                numCybergloveii=numCybergloveii+1;
                dataset.datasetCyberglove(numCybergloveii)=importDatasetTB([extractedPath,char(parsedFile(i).getDataPath())],'cybergloveii');           
			elseif strcmp(char(parsedFile(i).getDeviceAliasName()),'unibrainmono')
                numUnibrainMono=numUnibrainMono+1;
                dataset.datasetUnibrainMono(numUnibrainMono)=importDatasetTB([extractedPath,char(parsedFile(i).getDataPath())],'unibrainmono');
            end
        end