
  public static int max(Node node) {
    // write your code here
    int maximum=Integer.MIN_VALUE;
    
    for(Node child:node.children){
        int cm=max(child);
        maximum=Math.max(maximum,cm);
    }
    maximum=Math.max(maximum,node.data);
    
    return maximum;
  }
