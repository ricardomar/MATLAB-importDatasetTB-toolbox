function extractedPath = extractPath(path)
    
    index=-1;
    
    for i=1:length(path)
        if path(i)=='\' || path(i)=='/'
            index=i;
        end
    end
    
   extractedPath=path(1:index); 