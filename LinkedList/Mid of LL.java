 public int mid(){
      // write your code here
      Node fast=head;
      Node slow=head;
      
      while(fast.next!=null && fast.next.next!=null){
          fast=fast.next.next;
          slow=slow.next;
      }
      
      return slow.data;
    }
