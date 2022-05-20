 public static int findIntersection(LinkedList one, LinkedList two) {
      Node on = one.head;
      Node tn = two.head;

      if (one.size > two.size) {
        for (int i = 0; i < one.size - two.size; i++) {
          on = on.next;
        }
      } else {
        for (int i = 0; i < two.size - one.size; i++) {
          tn = tn.next;
        }
      }

      while (on != tn) {
        on = on.next;
        tn = tn.next;
      }

      return on.data;
    }
