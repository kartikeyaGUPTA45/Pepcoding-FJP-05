  public static void printKLevelsDown(Node node, int k){
    // write your code here
    
    if(node==null){
        return ;
    }
    
    if(k==0){
        System.out.println(node.data);
    }
    
    
    printKLevelsDown(node.left,k-1);
    printKLevelsDown(node.right,k-1);
  }
