static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);        
        if(head==null)
            return newNode;
        else{
            SinglyLinkedListNode ptr = head;
            while(ptr.next!=null)
                ptr = ptr.next;
            ptr.next = newNode;        
            return head;
        }
    }
