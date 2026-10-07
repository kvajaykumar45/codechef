/*
Insertion in Doubly Linked List

In this section, we will learn how to do the insertion operation in a doubly linked list.

Let's suppose you need to insert a node newNode between node A and node B, the pointers we need to update are:

    next pointer of A
    prev pointer of B
    next and prev pointer of newNode

Complete the function insertAtIndex(int index, int value) where index denotes that you need to insert a new node after the index-1th element, i.e., at the indexth position.

Note: In case of index, 0-based indexing is used, i.e., for insertAtIndex(0, k) node with value k is to be inserted in the beginning.

Constraints
1 ≤ N ≤ 1000
0 ≤ Index ≤ N−1
−10^9 ≤ Value ≤ 10^9
−10^9 ≤ NodeValue ≤ 10^9

Input
5 2 99
1 2 3 4 5

Output
1 2 99 3 4 5

Explanation:

Original linkedlist if lenght 5: 1 2 3 4 5
Inserting 99 at the index 2 results in linkedlist: 1 2 99 3 4 5

*/

//Solution

/*
class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
*/

class LinkedList {
    Node head;

    public void insertAtIndex(int index, int value) {
      // Comlete this method 
      Node newnode = new Node(value);
      if(index == 0)
      {
          if(head != null)
          {
              newnode.next = head;
              head.prev = newnode;
          }
          head = newnode;
          return;
      }
      Node current = head;
      int count = 0;
      
      
      while(current != null && count < index-1)
      {
          current = current.next;
          count++;
      }
    // if(current == null) return;
      newnode.next = current.next;
      newnode.prev = current;
      
      if(current.next != null)
        current.next.prev = newnode;
    
    current.next = newnode;
    }
    
    // Do not modify this method
    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}





