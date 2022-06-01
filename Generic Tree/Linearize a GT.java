
  public static void linearize(Node node) {
    for (Node child : node.children) {
      linearize(child);
    }

    for (int i = node.children.size() - 2; i >= 0; i--) {
      Node ip1 = node.children.remove(i + 1);
      Node itail = getTail(node.children.get(i));
      itail.children.add(ip1);
    }
  }

  private static Node getTail(Node node) {
    while (node.children.size() == 1) {
      node = node.children.get(0);
    }

    return node;
  }
