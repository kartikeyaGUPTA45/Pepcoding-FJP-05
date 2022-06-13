  static int dia=0;
  public static int diameter1(Node node) {
    // write your code here
    if(node==null){
        return -1;
    }
    
    int lh=diameter1(node.left);
    int rh=diameter1(node.right);
    
    dia=Math.max(dia,lh+rh+2);
    
    return Math.max(lh,rh)+1;
  }
