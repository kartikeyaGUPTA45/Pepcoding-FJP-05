public void removeAt(int idx) {
      // write your code here
      if(idx<0 || idx>=size){
          System.out.println("Invalid arguments");
      }else if(idx==0){
          removeFirst();
      }else if(idx==size-1){
          removeLast();
      }else {
          Node temp=head;
          for(int i=1;i<=idx-1;i++){
              temp=temp.next;
          }
          
          temp.next=temp.next.next;
          size--;
      }
    }
