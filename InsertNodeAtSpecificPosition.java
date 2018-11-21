    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        int cnt=0;
        if(position==0){
            if(head==null){
                head=newNode;
                return head;
            }
            else{
                newNode.next=head;
                return newNode;
            }
        }
        while(temp.next!=null && cnt<position-1){
            temp = temp.next;
            cnt++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

