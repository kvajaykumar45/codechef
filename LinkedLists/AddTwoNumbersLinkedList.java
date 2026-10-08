/*
​ ADD TWO NUMBERS (LINKED LIST)

You are given two linked lists that represent two non-negative numbers.Each number’s digits are stored in reverse order, and every node contains a single digit. You need to add both numbers and print the resulting linked list (also in reverse order). Leading zeros are considered as the nodes because the node's data value can be 0.
​
 Function Name
addTwoNumbers – This function adds two non-negative integers represented by two singly linked lists. Each linked list stores digits in reverse order, where each node contains a single digit (0–9). The function must compute the sum and return the resulting linked list, also in reverse order.
​
 Parameters
    • l1 : A pointer to the head of the first linked list. 
    • l2 : A pointer to the head of the second linked list. 

Return Value
    • Returns the head of a new linked list representing the sum of the two numbers. 
    • Each node contains a single digit. 
    • If there is a carry after the last digit, an extra node is appended. 

Constraints
    • The number of nodes in each linked list is in the range [1,100]. 
    • 0≤Node.data≤9 

Input Format
    • The first line contains an integer N1 — the number of nodes in the first linked list. 
    • The second line contains N1 space-separated integers representing the digits of the first number (in reverse order). 
    • The third line contains an integer N2 — the number of nodes in the second linked list. 
    • The fourth line contains N2 space-separated integers representing the digits of the second number (in reverse order). 

Output Format
    • Print the resulting linked list representing the sum, with digits separated by spaces. 
    • The output list must also be in reverse order. 

Input
4
5 9 9 9
3
5 0 0

Output
0 0 0 0 1
*/

//Solution

//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public static Node addTwoNumbers(Node l1, Node l2) {
 //write your code here...
 Node head = null;
 Node temp = head;
 int carry = 0;
 
 while(l1 != null || l2 != null || carry != 0)
 {
     int sum = carry;
     if(l1 != null)
     {
         sum += l1.data;
         l1 = l1.next;
     }
     
     if(l2 != null)
     {
         sum += l2.data;
         l2 = l2.next;
     }
     
     carry = sum/10;
     Node newnode = new Node(sum%10);
     if(head == null)
     {
         head = newnode;
         temp = newnode;
     }
     else
     {
     temp.next = newnode;
     temp = newnode;
     }
 }
 return head;
}


