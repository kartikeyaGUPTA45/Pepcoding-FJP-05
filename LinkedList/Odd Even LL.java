public void oddEven(){
      LinkedList odd = new LinkedList();
      LinkedList even = new LinkedList();

      while(size > 0){
        int val = getFirst();
        removeFirst();

        if(val % 2 == 0){
          even.addLast(val);
        } else {
          odd.addLast(val);
        }
      }

      if(odd.size > 0 && even.size > 0){
        odd.tail.next = even.head;

        head = odd.head;
        tail = even.tail;
        size = odd.size + even.size;
      } else if(odd.size > 0){
        head = odd.head;
        tail = odd.tail;
        size = odd.size;
      } else if(even.size > 0){
        head = even.head;
        tail = even.tail;
        size = even.size;
      } 
    }
