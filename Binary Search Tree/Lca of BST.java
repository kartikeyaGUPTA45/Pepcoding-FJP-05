
  public static int lca(Node node, int d1, int d2) {
    // write your code here
    if(node.data>d1 && node.data>d2){
        return lca(node.left,d1,d2);
        
    }else if(node.data<d1 && node.data<d2){
        return lca(node.right,d1,d2);
    }
    else{
        return node.data;
    }
  }
