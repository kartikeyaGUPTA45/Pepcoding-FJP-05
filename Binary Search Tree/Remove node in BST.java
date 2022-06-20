
  public static Node remove(Node node, int data) {
    // write your code here
    if(node==null){
        return null;
    }
    
    if(node.data>data){
        node.left=remove(node.left,data);
    }else if(node.data<data){
        node.right=remove(node.right,data);
    }else{
        //  zero child
        if(node.left==null && node.right==null){
            return null;
        }
        
        //  One child
        else if(node.left==null){
            return node.right;
        }
        
        else if(node.right==null){
            return node.left;
        }
        
        //  Two children
        else {
            //  Find max value node in Left Subtree
            int maxinLeftSubtree=max(node.left);
            //  Replace node.data with maxinLeftSubtree
            node.data=maxinLeftSubtree;
            //  Now remove node with data = maxinLeftSubtree
            node.left=remove(node.left,maxinLeftSubtree);
            
            // int mininRightSubtree=min(node.right);
            // node.data=mininRightSubtree;
            // node.right=remove(node.right,mininRightSubtree);
        }
        
    }
    
    return node;
  }
  
  public static int min(Node node){
      if(node.left==null){
          return node.data;
      }
      
      return min(node.left);
  }
  
  public static int max(Node node){
      if(node.right==null){
          return node.data;
      }
      
      return max(node.right);
  }
