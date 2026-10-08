/*
​ FIND INTERSECTION OF TWO LINKED LISTS

Given two linked lists , find the point of intersection of both the lists from where the values are common in both the lists. The length of linkedlist1 will be N and of linkedlist2 will be M.

The task is to complete the function intersectPoint() which takes the pointer to the head of linklist1(head1) and linklist2(head2) as input parameters and returns the data value of a node where two linked lists intersect. If the linked list does not merge at any point, then 
it should return −1.
​
Input Format
    • First line contains three numbers, x (number of nodes before merge point in 1st list), y (number of nodes before merge point in 2nd list) and z (number of nodes after merge point). 
    • Next three lines contain x, y and z numbers respectively. 
    • N will be equal to the sum of x and z. 
    • M will be equal to the sum of y and z. 

Output Format
    • Print the value of a node that intersect and if it does not intersect print −1. 

Constraints
    • 1 ≤ n, m ≤ 100000 

Input
3 1 2
3 6 9
10
15 30

Output
15
*/

//Solution
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Link list Node
class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    // Function to find intersection point in Y shaped Linked Lists
    public static int intersectPoint(Node head1, Node head2) {
        // Write your code here
        
        Node first = head1;
        Node second = head2;
        
        while(first != second)
        {
            if(first != null)
                first = first.next;
            else
                first = head2;
            if(second != null)
                 second = second.next;
            else
                second = head1;
        }
            if(first == null)
                return -1;
        return first.data;
    }

    // Function to take input and create a linked list
    public static Node inputList(int size, int[] v) {
        if (size == 0) return null;
        Node head = new Node(v[0]);
        Node tail = head;
        for (int i = 1; i < size; i++) {
            tail.next = new Node(v[i]);
            tail = tail.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = 1; // Number of test cases
        while (T-- > 0) {
            int n1 = scanner.nextInt(); // Size of the first list
            int n2 = scanner.nextInt(); // Size of the second list
            int n3 = scanner.nextInt(); // Size of the common list
            
            int p = (int) (Math.random() * 3); // Randomly decide which list contains the common part
            
            int[] v1 = new int[n1];
            int[] v2 = new int[n2];
            int[] v3 = new int[n3];
            
            for (int i = 0; i < n1; i++) v1[i] = scanner.nextInt();
            for (int i = 0; i < n2; i++) v2[i] = scanner.nextInt();
            for (int i = 0; i < n3; i++) v3[i] = scanner.nextInt();
            
            Node head1 = null;
            Node head2 = null;
            Node common = null;
            
            if (p == 0) {
                common = inputList(n3, v3);
                head1 = inputList(n1, v1);
                head2 = inputList(n2, v2);
            } else if (p == 1) {
                head1 = inputList(n1, v1);
                common = inputList(n3, v3);
                head2 = inputList(n2, v2);
            } else {
                head1 = inputList(n1, v1);
                head2 = inputList(n2, v2);
                common = inputList(n3, v3);
            }
            
            Node temp = head1;
            while (temp != null && temp.next != null)
                temp = temp.next;
            if (temp != null) temp.next = common;
            
            temp = head2;
            while (temp != null && temp.next != null)
                temp = temp.next;
            if (temp != null) temp.next = common;
            
            System.out.println(intersectPoint(head1, head2));
        }
        scanner.close();
    }
}
