public static int size(Node node){
    // write your code here
    
    int sz=0;
    
    // Faith 
    for(Node child:node.children){
        sz+=size(child);
    }
    // My work
    return sz+1;
  }
