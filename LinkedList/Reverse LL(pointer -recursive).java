private void reversePRHelper(Node node){
      // write your code here
      if(node==tail){
        return ;
      }

      reversePRHelper(node.next);
      node.next.next=node;

    }

    public void reversePR(){
      // write your code here
      reversePRHelper(head);

      // Swap head and tail
      Node temp=head;
      head=tail;
      tail=temp;

      // Update the first node
      tail.next=null;
    }
