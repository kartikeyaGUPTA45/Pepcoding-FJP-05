
  public static void removeLeaves(Node node) {
    // write your code here
    
    
    
    for(Node child:node.children){
        removeLeaves(child);
    }
    
    for(int i=0;i<node.children.size();i++){
        
        Node child=node.children.get(i);
        
        if(child.children.size()==0){
            node.children.set(i,null);
            // i--;
        }
    }
    
    
  }
