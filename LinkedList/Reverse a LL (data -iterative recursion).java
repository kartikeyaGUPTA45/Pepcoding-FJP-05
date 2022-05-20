Node left;
    private void reversePRHelper(Node right,int counter){
      
      if(right==null){
        return ;
      }

      reversePRHelper(right.next,counter+1);
      if(counter>=size/2){
        int temp=left.data;
        left.data=right.data;
        right.data=temp;

        left=left.next;
      }
      

    }
    
    public void reversePR(){
    
      left=head;
      reversePRHelper(head,0);
      
    }
