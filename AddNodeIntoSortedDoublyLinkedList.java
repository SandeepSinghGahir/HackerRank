    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
      DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
      //Return new node when head is null
      if(head == null)
        return newNode;
      //Check if first node of sorted list is > than new node? add at head if true
      if(head.data>data){
        newNode.next = head;
        head.prev = newNode;
        return newNode;
      }      
      //Check linked list is single node. If yes, then add new node to left if head > than new node or right if head < new node
      if(head.next == null){
        if(head.data>data){
          newNode.next = head;
          head.prev = newNode;
          return newNode;
        }
        else{
          head.next = newNode;
          newNode.prev = head;
          return head;
        }
      }      
      else{
        DoublyLinkedListNode temp = head;
        //Check for ideal position in the list and keep on moving the pointer
        while(temp.next!=null && data >= temp.data)
            temp = temp.next;         
          //Add new node at the end if all the nodes are greater than new node
          if(temp.next==null && data > temp.data){
            newNode.prev = temp;
            temp.next = newNode;
          }
          //Else add in the middle
          else{            
              newNode.prev = temp.prev.next;
              temp.prev.next = newNode;
              newNode.next = temp;
              temp.prev = newNode;                       
          }
          return head;        
      }
    }
