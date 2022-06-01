  public static void levelOrderLinewiseZZ(Node node){
    // write your code here
    Stack<Node>c1=new Stack<>();
    Stack<Node>c2=new Stack<>();
    
    c1.push(node);
    
    int level=0;
    
    while(c1.size()>0){
        
        node=c1.pop();
        
        System.out.print(node.data+" ");
        
        if(level%2==0){
            for(int i=0;i<node.children.size();i++){
                Node child=node.children.get(i);
                c2.push(child);
            }
        }else{
            for(int i=node.children.size()-1;i>=0;i--){
                Node child=node.children.get(i);
                c2.push(child);
            }
        }
        
        if(c1.size()==0){
            c1=c2;
            c2=new Stack<>();
            level++;
            System.out.println();
        }
    }
    
