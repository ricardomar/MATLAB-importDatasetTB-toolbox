function dataset=importDatasetTB(varargin)

    dataset=struct;

    
    if strcmp(varargin{1,2},'root')
        if size(varargin,2)==2
            dataset=importDatasetRootFile(varargin{1,1});
        else
            disp('ERROR: 2 arguments required'); 
            dataset=0;
        end            
    elseif strcmp(varargin{1,2},'polhemus')
        if size(varargin,2)==2
            dataset=importDatasetPolhemus(varargin{1,1});
        else
            disp('ERROR:2 arguments required');
            dataset=0;
        end
    elseif strcmp(varargin{1,2},'viderestereo')
        if size(varargin,2)==2
            dataset=importDatasetVidereStereo(varargin{1,1});           
        else
            disp('ERROR:2 arguments required');
            dataset=0;
        end
    elseif  strcmp(varargin{1,2},'tekscantactileRAW2MATLAB') || strcmp(varargin{1,2},'tekscantactileRAW2XML')
        if size(varargin,2)==4
            dataset=importDatasetTekscan(varargin{1,1},varargin{1,2},varargin{1,3},varargin{1,4});
        else
            disp('ERROR:4 arguments required');
            dataset=0;
        end
    elseif strcmp(varargin{1,2},'tekscantactileXML2MATLAB') 
        if size(varargin,2)==2
            dataset=importDatasetTekscan(varargin{1,1},varargin{1,2},0,0);
        else
            disp('ERROR:2 arguments required');
            dataset=0;
        end
    elseif strcmp(varargin{1,2},'rubikcube')
        if size(varargin,2)==2
            dataset=importDatasetRubikCube(varargin{1,1});
        else
            disp('ERROR:2 arguments required');
            dataset=0;
        end        
    elseif strcmp(varargin{1,2},'cybergloveii') 
        if size(varargin,2)==2
            dataset=importDatasetCyberglove(varargin{1,1});
        else
            disp('ERROR:2 arguments required');
            dataset=0;
        end          
    elseif strcmp(varargin{1,2},'unibrainmono') 
        if size(varargin,2)==2
            dataset=importDatasetUnibrainMono(varargin{1,1});
        else
            disp('ERROR:2 arguments required');
            dataset=0;
        end          
    end	

   
    
