public static void levelOrder(Node root) {
    ArrayDeque queue = new ArrayDeque();
    queue.add(root);
    while(!queue.isEmpty()){
      Node node = (Node) queue.poll();
      System.out.print(node.data+" ");    
      if(node.left!=null)
        queue.add(node.left);
      if(node.right!=null)
        queue.add(node.right);
    }
  }

