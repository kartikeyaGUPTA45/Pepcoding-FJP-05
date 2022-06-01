  public static void ceilAndFloor(Node node, int data) {
    // Write your code here
    
    if(node.data<data && node.data>floor){
        floor=node.data;
    }
    
    if(node.data>data && node.data<ceil){
        ceil=node.data;
    }
    
    
    for(Node child:node.children){
        ceilAndFloor(child,data);
    }
  }
