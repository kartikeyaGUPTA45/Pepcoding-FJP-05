
  public static ArrayList<Node> nodeToRootPath(Node node, int data){
    // write your code here
    if(node==null){
        return new ArrayList<>();
    }
    
    if(node.data==data){
        ArrayList<Node>base=new ArrayList<>();
        base.add(node);
        
        return base;
    }
    
    ArrayList<Node>leftSide=nodeToRootPath(node.left,data);
    if(leftSide.size()>0){
        leftSide.add(node);
        
        return leftSide;
    }
    
    ArrayList<Node>rightSide=nodeToRootPath(node.right,data);
    if(rightSide.size()>0){
        rightSide.add(node);
        
        return rightSide;
    }
    
    return new ArrayList<>();
    
    
  }

    public static void printKLevelsDown(Node node, int k,Node blocker){
    // write your code here
    
    if(node==null || node==blocker){
        return ;
    }
    
    if(k==0){
        System.out.println(node.data);
    }
    
    
    printKLevelsDown(node.left,k-1,blocker);
    printKLevelsDown(node.right,k-1,blocker);
  }

  public static void printKNodesFar(Node node, int data, int k) {
    // write your code here
    ArrayList<Node>al=nodeToRootPath(node,data);
    
    for(int i=0;i<al.size();i++){
        Node cr=al.get(i);
        Node blocker=i==0?null:al.get(i-1);
        printKLevelsDown(cr,k-i,blocker);
        
    }
  }
