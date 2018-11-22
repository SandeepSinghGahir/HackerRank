    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
      if(head==null || head.next == null)
        return head;     
      else{      
        DoublyLinkedListNode current = head;    
        DoublyLinkedListNode temp=null; 
        while(current!=null){                    
          temp = current.prev;
          current.prev = current.next;
          current.next = temp;
          current = current.prev;    
        }              
        return temp.prev;
      }
    }

