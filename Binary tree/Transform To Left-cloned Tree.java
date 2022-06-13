public static void createLeftCloneTree(Node node){
    // write your code here
    if(node==null){
        return ;
    }
    
    createLeftCloneTree(node.left);
    createLeftCloneTree(node.right);
    
    Node clone=new Node(node.data,node.left,null);
    node.left=clone;
    
  }
