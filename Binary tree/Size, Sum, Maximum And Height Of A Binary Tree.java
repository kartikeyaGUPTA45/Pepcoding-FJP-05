
  public static int size(Node node) {
    // write your code here
    
    //  Base case ->if node is pointing to null
    if(node==null){
        return 0;
    }
    
    //  faith
    // leftside-> give the size of left side
    int leftside=size(node.left);
    
    //  rightside ->give the size of right side
    int rightside=size(node.right);
    
    // final answer/ my work 
    return leftside+rightside+1;
    
  }

  public static int sum(Node node) {
    // write your code here
    if(node==null){
        return 0;
    }
    
    int leftsum=sum(node.left);
    int rightsum=sum(node.right);
    
    return leftsum+rightsum+node.data;
  }

  public static int max(Node node) {
    // write your code here
    
    if(node==null){
        return Integer.MIN_VALUE;
    }
    
    int leftmax=max(node.left);
    int rightmax=max(node.right);
    int ans=Math.max(node.data,Math.max(leftmax,rightmax));
    
    return ans;
  }

  public static int height(Node node) {
    // write your code here
    
    if(node==null){
        return -1;
    }
    
    int leftHeight=height(node.left);
    int rightHeight=height(node.right);
    
    int myHeight=Math.max(leftHeight,rightHeight)+1;
    
    return myHeight;
  }
