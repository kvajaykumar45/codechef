/*

​ REVERSE A LINKED LIST

The Chef gives you a singly linked list A integers and ask you to help him reverse the list. Complete the function "listReverse" in the code snippet that takes a single argument: head of the linked list.
​
Input Format
    • The first line contains an integer N - representing the number of elements of the linked list. 
    • The second line contains N integers - representing the elements of the linked list. 

Output Format
For each testcase, output will be in a single line containing a list returned by the function listReverse.
​
Constraints
    • 1 ≤ N ≤ 10^5 
    • −10^9 ≤ Node->value ≤ 10^9 

Input
5
1 2 3 4 5

Output
5 4 3 2 1
*/

//Solution

/*
public class Main {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }*/
public static Node listReverse(Node head) {
    Node temp = head;
    Node rhead = null;

    while (temp != null)
    {
        int data = temp.data;
        Node newnode = new Node(data);

        if (rhead == null)
        {
            rhead = newnode;
        }
        else
        {
            newnode.next = rhead;
            rhead = newnode;
        }
        temp = temp.next;
    }
    return rhead;
}

