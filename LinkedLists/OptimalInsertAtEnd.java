/*
Optimal insertion at the end

The way we are doing insertion at the end is not really optimal. Every time we want to add an item at the end, we iterate through the complete list to reach the end.

The time complexity of insertion at end is thus O(N) where N is the size of the linked list. But we can make it O(1).

How?

By maintaining a tail pointer, which will point to the last element of the linked list. Thus whenever we want to insert at the end, we can use tail for that.
Task

Add a new tail pointer and update the current insertAtEnd to pass this exercise.

Input
4
2 32 23 53

Output
2 32 23 53

Explanation:

Initially we have an empty linked list. After each step:

1.2
2.2->32
3.2->32->23
4.2->32->23->53
*/
//Solution


class LinkedList {
    public Node head;

    // Create the Node tail
    public Node tail;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        // If there are no nodes in the linked list
        // Set the new node as head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Set next of tail to the new Node
        tail.next = newNode;
        

        // Set new Node as the new tail
        tail = newNode;
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}




