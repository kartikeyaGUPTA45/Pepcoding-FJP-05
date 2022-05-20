public void addAt(int idx, int val){
      // write your code here
      if(idx<0 || idx>size){
          System.out.println("Invalid arguments");
      }else if(idx==0){
          addFirst(val);
      }else if(idx==size){
        addLast(val);   
      }else{
          Node temp=head;
          for(int i=1;i<=idx-1;i++){
              temp=temp.next;
          }
          
          Node nn=new Node();
          nn.data=val;
          
        //    IMPORTANT STEP
        nn.next=temp.next;
        temp.next=nn;
        size++;
      }
    }
