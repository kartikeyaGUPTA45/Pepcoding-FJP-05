static boolean balance=true;
  
  public static int isBalance(Node node){
      
      if(node==null) return -1;
      
      int lh=isBalance(node.left);
      int rh=isBalance(node.right);
      
      if(Math.abs(lh-rh)>1){
          balance=false;
      }
      
      return Math.max(lh,rh)+1;
      
      
  }
