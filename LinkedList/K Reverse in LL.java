public void kReverse(int k) {
      // write your code here
      LinkedList ans=new LinkedList();
      LinkedList l1=new LinkedList(); // as a helper
      
      while(size()>0){
          if(size()>=k){
              for(int i=1;i<=k;i++){
                  l1.addFirst(getFirst());
                  removeFirst();
              }
          }else {
              while(size()>0){
                  l1.addLast(getFirst());
                  removeFirst();
              }
          }
          if(ans.size()==0){
              ans=l1;
          }else {
              ans.tail.next=l1.head;
              ans.tail=l1.tail;
              ans.size+=l1.size;
          }
          l1=new LinkedList();
      }
        head=ans.head;
        tail=ans.tail;
        size=ans.size;
    }
