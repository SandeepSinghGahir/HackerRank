// Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */ 
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
      SinglyLinkedListNode temp = head;
      int cnt = 0;
      //When only 1 node is present in the linked list
      if(head.next==null)
        return null;
      //Delete node at position 0 or head
      if(position==0)
        return head.next;
      //Iterate pointer to the node before the node to be deleted
      while(temp.next.next != null && cnt++<position-1)
          temp = temp.next;
      //Delete if its the last node
      if(temp.next.next==null)
        temp.next=null;
      //Delete when the node to be deleted is in the middle
      else
        temp.next = temp.next.next;
      return head;
    }
