  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      return list.size();
    }

    void push(int val) {
      list.addFirst(val);
    }

    int pop() {
      if(size() == 0){
        System.out.println("Stack underflow");
        return -1;
      } else {
        int val = list.getFirst();
        list.removeFirst();
        return val;
      }
    }

    int top() {
      if(size() == 0){
        System.out.println("Stack underflow");
        return -1;
      } else {
        int val = list.getFirst();
        return val;
      }
    }
  }
