import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
      int length1 = calculateLengthofLinkedList(head1);
      int length2 = calculateLengthofLinkedList(head2);
      SinglyLinkedListNode shortNode, longNode;
      longNode = length1-length2 > 0 ? head1 : head2;
      shortNode = length1-length2 <= 0 ? head1 : head2;
      for(int i=0; i< (length1-length2 > 0 ? length1-length2:length2-length1);i++)
        longNode = longNode.next;
      while(shortNode!=null && longNode!=null){
        if(longNode == shortNode)
          return longNode.data;
        shortNode = shortNode.next;
        longNode = longNode.next;
      }
      return -1; 
    }

    static int calculateLengthofLinkedList(SinglyLinkedListNode head){
      int length = 0;
      while(head!=null){
      head = head.next;
      length++;
      }
      return length;
    }
    private static final Scanner scanner = new Scanner(System.in);