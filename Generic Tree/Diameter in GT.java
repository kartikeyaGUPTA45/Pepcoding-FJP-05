    static int diameter;
    public static int height(Node node){
        
        int maxh=-1;
        int secMaxH=-1;
        
        for(Node child:node.children){
            int ch=height(child);
            
            if(ch>maxh){
                secMaxH=maxh;
                maxh=ch;
            }else if(secMaxH<ch){
                secMaxH=ch;
            }
        }
        
        diameter=Math.max(diameter,maxh+secMaxH+2);
        
        return maxh+1;
        
    }
  
