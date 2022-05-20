public void removeLast(){
      // write your code here
      if(size==0){
          System.out.println("List is empty");
      }else if(size==1){
          head=tail=null;
          size=0;
      }else {
          Node temp=head;
          
          for(int i=1;i<size-1;i++){
              temp=temp.next;
          }
          
          temp.next=null;
          tail=temp;
          size--;
          
      }
    }
