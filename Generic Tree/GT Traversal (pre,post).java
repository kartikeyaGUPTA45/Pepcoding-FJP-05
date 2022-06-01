
  public static void traversals(Node node){
    // write your code here
    System.out.println("Node Pre "+ node.data);
    
    for(Node child:node.children){
        System.out.println("Edge Pre "+node.data +"--" + child.data);
        traversals(child);
        System.out.println("Edge Post "+node.data +"--" + child.data);
    }
    
    
    System.out.println("Node Post "+node.data);
  }
