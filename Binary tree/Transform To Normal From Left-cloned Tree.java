  public static void transBackFromLeftClonedTree(Node node){
    // write your code here
    if(node==null) return ;
    
    transBackFromLeftClonedTree(node.left.left);
    transBackFromLeftClonedTree(node.right);
    
    node.left=node.left.left;
  }
