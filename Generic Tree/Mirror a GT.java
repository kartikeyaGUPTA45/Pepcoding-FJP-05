  public static void mirror(Node node){
    // write your code here
    
    // Faith
    for(Node child:node.children){
        mirror(child);
    }
    
    // My work -> reverse the ArrayList
    
    int left=0;
    int right=node.children.size()-1;
    
    while(left<right){
        Node ln=node.children.get(left);
        Node rn=node.children.get(right);
        
        node.children.set(left,rn);
        node.children.set(right,ln);
        
        left++;
        right--;
    }
    
    
  }
