static int getNode(SinglyLinkedListNode head, int positionFromTail) { 
      int count=0;
      SinglyLinkedListNode lateStart = head;
      while(head!=null){
        head = head.next;                
        if(count>positionFromTail)
          lateStart = lateStart.next;
        count++;
        }
        return lateStart.data;
    }
