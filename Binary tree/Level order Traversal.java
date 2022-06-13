
  public static void levelOrder(Node node) {
    // write your code here
    
    Queue<Node>q=new ArrayDeque<>();
    q.add(node);
    
    while(q.size()>0){
        int sz=q.size();
        while(sz>0){
            node=q.remove();
            System.out.print(node.data+" ");
            
            if(node.left!=null){
                q.add(node.left);
            }
            
            if(node.right!=null){
                q.add(node.right);
            }
            sz--;
        }
        
        System.out.println();
    }
    
    
    
  }
