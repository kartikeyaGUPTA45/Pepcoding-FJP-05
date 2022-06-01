 public static boolean find(Node node, int data) {
    // write your code here
    
    if(node.data==data){
        return true;
    }
    
    for(Node child:node.children){
        boolean ans=find(child,data);
        if(ans==true){
            return true;
        }
    }
    
    return false;
  }
