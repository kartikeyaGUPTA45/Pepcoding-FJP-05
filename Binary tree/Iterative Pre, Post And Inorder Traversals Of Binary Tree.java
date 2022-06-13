
  public static void iterativePrePostInTraversal(Node node) {
    // write your code here
    Stack<Pair>st=new Stack<>();
    
    st.push(new Pair(node,0));
    
    String pre="";
    String in="";
    String post="";
    
    while(st.size()>0){
        Pair tos=st.peek();
        
        if(tos.state==0){
            pre+=tos.node.data+" ";
            tos.state++;
            if(tos.node.left!=null){
                st.push(new Pair(tos.node.left,0));
            }
            
        }else if(tos.state==1){
            in+=tos.node.data+" ";
            tos.state++;
            if(tos.node.right!=null){
                st.push(new Pair(tos.node.right,0));
            }
            
        }else {
            post+=tos.node.data+" ";
            st.pop();
        }
    }
    
    System.out.println(pre);
    System.out.println(in);
    System.out.println(post);
  }
