
  public static boolean find(Node node, int data){
    // write your code here
    
    if(node==null){
        return false;
    }
    
    if(node.data==data){
        return true;
    }
    
    boolean leftSide=find(node.left,data);
    if(leftSide==true){
        return true;
    }
    
    boolean rightSide=find(node.right,data);
    if(rightSide==true){
        return true;
    }
    
    return false;
    
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node==null){
        return new ArrayList<>();
    }
    
    if(node.data==data){
        ArrayList<Integer>base=new ArrayList<>();
        base.add(node.data);
        
        return base;
    }
    
    ArrayList<Integer>leftSide=nodeToRootPath(node.left,data);
    if(leftSide.size()>0){
        leftSide.add(node.data);
        
        return leftSide;
    }
    
    ArrayList<Integer>rightSide=nodeToRootPath(node.right,data);
    if(rightSide.size()>0){
        rightSide.add(node.data);
        
        return rightSide;
    }
    
    return new ArrayList<>();
    
    
  }
