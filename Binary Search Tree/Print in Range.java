
  public static void pir(Node node, int d1, int d2) {
    // write your code here
    if(node==null){
        return;
    }
    
    if(d1<node.data && d2<node.data){
        pir(node.left,d1,d2);
    }else if(d1>node.data && d2>node.data) {
        pir(node.right,d1,d2);
    }else{
        pir(node.left,d1,d2);
        System.out.println(node.data);
        pir(node.right,d1,d2);
    }
  }
