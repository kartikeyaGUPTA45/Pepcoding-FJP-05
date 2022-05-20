  public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            // write your code hered
            LinkedList ans=new LinkedList();
            
            Node t1=l1.head;
            Node t2=l2.head;
            
            while(t1!=null &&t2!=null){
                
                if(t1.data<t2.data){
                    ans.addLast(t1.data);
                    t1=t1.next;
                    
                }else{
                    
                    ans.addLast(t2.data);
                    t2=t2.next;
                }
            }
            
            while(t1!=null){
                ans.addLast(t1.data);
                t1=t1.next;
            }
            
            while(t2!=null){
                ans.addLast(t2.data);
                t2=t2.next;
            }
            
            return ans;
        }
    }
