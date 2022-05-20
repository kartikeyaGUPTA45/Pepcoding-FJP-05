 public int getFirst(){
      // write your code here
      if(size==0) {
          System.out.println("List is empty");
          return -1;
      }
      return head.data;
    }

    public int getLast(){
      // write your code here
      if(size==0){
          System.out.println("List is empty");
          return -1;
      }
      
      return tail.data;
    }

    public int getAt(int idx){
      // write your code here
      if(idx<0 || idx>=size){
          System.out.println("Invalid arguments");
          return -1;
      }else if(size==0){
          System.out.println("List is empty");
          return -1;
      }else if(idx==0){
          return getFirst();
      }else if(idx==size-1){
          return getLast();
      }else{
          Node temp=head;
          for(int i=1;i<=idx;i++){
              temp=temp.next;
          }
          
          return temp.data;
      }
    }
