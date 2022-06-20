
  static int sum = 0;
  public static void rwsol(Node node){
    // write your code here
    if(node==null){
        return ;
    }
    
    rwsol(node.right);
    int data=node.data;
    node.data=sum;
    sum+=data;
    rwsol(node.left);
  }
