    public void removeDuplicates(){
      // write your code here
      
      if(head==null || head.next==null) return ;
      
      Node prev=head;
      Node curr=head.next;
      int count=1;
      while(curr!=null){
         
        if(prev.data!=curr.data){
            prev.next=curr;
            prev=curr;
            count++;
        }
        
        curr=curr.next;
        tail=prev;
        tail.next=null;
        size=count;
      }
    }
