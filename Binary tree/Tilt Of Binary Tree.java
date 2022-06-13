static int tilt = 0;
  public static int tilt(Node node){
    // write your code here to set the tilt data member
    
    if(node==null) return 0;
    
    int ls=tilt(node.left);
    int rs=tilt(node.right);
    
    tilt+=Math.abs(ls-rs);
    
    return ls+rs+node.data;
    
  }
