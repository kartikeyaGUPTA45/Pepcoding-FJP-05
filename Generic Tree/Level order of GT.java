
  public static void levelOrder(Node node){
    // write your code here
    //  Create Queue
    Queue<Node>q=new ArrayDeque<>();
    //   Add root to the queue
    q.add(node);
    
    
    //  Run a loop until queue is not empty
    while(q.size()>0){
        
        // Remove and Print
        Node nn=q.remove();
        
        System.out.print(nn.data+ " ");
        
        //  Adding children
        for(Node child:nn.children){
            q.add(child);
        }
        
    }
    System.out.println(".");
  }
