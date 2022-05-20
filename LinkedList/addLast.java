 void addLast(int val) {
      // Create a new node and set its data
      Node nn=new Node();
      nn.data=val;
      
        //check for head and tail points to null
        if(size==0){
            head=tail=nn;
        }else{
            tail.next=nn;
            //  Update tail pointer 
            tail=nn;
        }
        
        //  Update size
        size++;
    }
  }
