 public Node getNode(int idx){
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        
        return temp;
    }

    public void reverseDI() {
      // write your code here
      int leftIndex=0;
      int rightIndex=size-1;
      
      while(leftIndex<rightIndex){
          Node leftNode=getNode(leftIndex);
          Node rightNode=getNode(rightIndex);
          
        //   Swap data
        int temp=leftNode.data;
        leftNode.data=rightNode.data;
        rightNode.data=temp;
        
        leftIndex++;
        rightIndex--;
      }
    }
