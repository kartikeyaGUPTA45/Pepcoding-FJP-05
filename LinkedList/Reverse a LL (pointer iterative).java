public void reversePI(){
      // write your code here
      if(size<=1) return ;
      
      Node prev=null;
      Node curr=head;
      
      while(curr!=null){
        //   Backup
        Node fowd=curr.next;
        
        // Pointer update
        curr.next=prev;
        
        
        //  Move prev and curr
        prev=curr;
        curr=fowd;
      }
      
      tail=head;
      head=prev;
      
    }
