  public static Node add(Node node, int data) {
    // write your code here
    if(node==null){
        Node nn=new Node(data,null,null);
        return nn;
    }
    
    if(node.data>data){
        node.left=add(node.left,data);
    }else if(node.data<data){
        node.right= add(node.right,data);
    }
    
    return node;
  }
