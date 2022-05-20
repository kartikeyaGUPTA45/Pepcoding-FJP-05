public void addFirst(int val) {
      // write your code here
      Node nn=new Node();
      nn.data=val;
      if(size==0){
          head=tail=nn;
      }else {
          nn.next=head;
          head=nn;
      }
      size++;
    }
