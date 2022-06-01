 public static int lca(Node node, int d1, int d2) {
    // write your code here
    ArrayList<Integer>a1=nodeToRootPath(node,d1);
    ArrayList<Integer>a2=nodeToRootPath(node,d2);
    
    int i=a1.size()-1;
    int j=a2.size()-1;
    
    while(i>=0 && j>=0 && a1.get(i)==a2.get(j)){
        i--;
        j--;
    }
    
    return a1.get(i+1);
    
  }
