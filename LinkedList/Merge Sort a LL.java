  public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
      LinkedList ml = new LinkedList();

      Node one = l1.head;
      Node two = l2.head;
      while (one != null && two != null) {
        if (one.data < two.data) {
          ml.addLast(one.data);
          one = one.next;
        } else {
          ml.addLast(two.data);
          two = two.next;
        }
      }

      while (one != null) {
        ml.addLast(one.data);
        one = one.next;
      }

      while (two != null) {
        ml.addLast(two.data);
        two = two.next;
      }

      return ml;
    }
    
    public static Node getMidNode(Node head ,Node tail){
        Node fast=head;
        Node slow=head;
        
        while(fast!=tail && fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
    }

    public static LinkedList mergeSort(Node head, Node tail){
      // write your code here
      if(head==tail){
          LinkedList base=new LinkedList ();
          base.addLast(head.data);
          return base;
      }
      
      
      Node mid=getMidNode(head,tail);
      
      LinkedList fsh=mergeSort(head,mid);
      LinkedList ssh=mergeSort(mid.next,tail);
      
      LinkedList ans =mergeTwoSortedLists(fsh,ssh);
      
      return ans;
    }
