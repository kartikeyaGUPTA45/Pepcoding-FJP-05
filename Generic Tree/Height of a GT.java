 public static int height(Node node) {
    // write your code here
    int ht=-1;
    
    for(Node child:node.children){
        ht=Math.max(ht,height(child));
    }
    
    return ht+1;
  }
