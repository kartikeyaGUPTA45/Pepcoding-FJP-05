
  public static int size(Node node) {
    // write your code here
    if(node==null) return 0;
    
    int ls=size(node.left);
    int rs=size(node.right);
    
    return ls+rs+1;
  }

  public static int sum(Node node) {
    // write your code here
    if(node==null) {
        return 0;
    }
    
    int lsum=sum(node.left);
    int rsum=sum(node.right);
    
    return lsum+rsum+node.data;
  }

  public static int max(Node node) {
    // write your code here
    
    if(node.right==null){
        return node.data;
    }
    
    return max(node.right);
  }

  public static int min(Node node) {
    // write your code here
    if(node.left==null){
        return node.data;
    }
    
    return min(node.left);
  }

  public static boolean find(Node node, int data){
    // write your code here
    
    if(node==null){
        return false;
    }
    
    if(node.data==data) return true;
    
    else if(node.data>data){
        return find(node.left,data);
    }else {
        return find(node.right,data);
    }
  }  
