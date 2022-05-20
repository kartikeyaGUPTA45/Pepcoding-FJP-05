 public int size(){
      // write code here
      return size;
    }

    public void display(){
      // write code here
      if(size==0) return ;
      Node temp=head;
      while(temp!=null){
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
      
      System.out.println();
    }
