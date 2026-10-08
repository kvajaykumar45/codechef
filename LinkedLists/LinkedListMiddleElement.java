/*
​ FIND MIDDLE ELEMENT OF LINKED LIST

You are given the head of a singly linked list A of length N. The values in the list are A1,A2,…,AN respectively. You need to find the value of the middle element of the linked list. The middle element of a linked list of length N is the (⌊N/2⌋+1)-th element from the head of the list.
​
 Input Format
    • The first line of the input contains a single integer T - the number of test cases. The description of T test cases follows.
    • The first line of each test case contains a single integer N.
    • The second line of each test case contains N space-separated integers A1,A2,…,AN.

Output Format
    • For each test case, the function you complete should return the value of the middle element of the list. 
Note: You need to complete the function getMiddleElement to solve the problem.
​
 Constraints
    • 1≤T≤100 
    • 1≤N≤10^5 
    • 1≤Ai≤10^9 for each valid i 
    • the sum of N over all test cases does not exceed 2⋅10^5 

Input
3
5
1 2 3 4 5
6
1 2 3 4 5 6
4
10 1 6 12

Output
3
4
6


//Two-Pointer technique (often called the Tortoise and Hare algorithm).

/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static int getMiddleElement(Node head){
     
     Node fast = head;
     Node slow = head;
     
     while(fast != null && fast.next != null)
     {
         slow = slow.next;
         fast = fast.next.next;
     }
     return slow.val;
}


