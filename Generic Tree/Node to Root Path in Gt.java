
 public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node.data==data){
        ArrayList<Integer>base=new ArrayList<>();
        base.add(data);
        
        return base;
    }
    
    for(Node child:node.children){
        ArrayList<Integer>res=nodeToRootPath(child,data);
        if(res.size()>0){
            res.add(node.data);
            return res;
        }
    }
    
    
    return new ArrayList<>();
    
    
    
    
 }
