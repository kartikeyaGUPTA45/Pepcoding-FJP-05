  public static void targetSum(Node root,Node node,int target){
      if(node==null){
          return ;
      }
      
      targetSum(root,node.left,target);
      
      int remainingPart=target-node.data;
      if(node.data-remainingPart<0){
          if(find(root,remainingPart)){
              System.out.println(node.data+" "+remainingPart);
          }
      }
      
      
      targetSum(root,node.right,target);
      
  }
