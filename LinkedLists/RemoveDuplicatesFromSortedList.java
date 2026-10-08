/*

​ REMOVE DUPLICATES FROM SORTED LIST
You are given head of the non-empty sorted linked list where the value of the ith node will be Ai. Your task is to delete all duplicates such that each element appears only once and return the linked list sorted.
​
 Input:
    • First line will contain T, number of test cases. Then the test cases follow. 
    • The first line contains one integer N — the length of the linked list. 
    • The second line contains N space separated integers A1,A2,…AN — the value of the linked list nodes starting from the head for the linked list. 
​
 Output:
The function you complete should return the required answer.
​
 Constraints
    • 1≤T≤10 
    • 1≤N,Ai≤10^5 

Input
3
5
1 1 6 8 8
5
1 2 3 4 5
4
5 5 5 5

Output
1 6 8 
1 2 3 4 5 
5 
*/

//Solution

/* Linked List Node
struct Node {
    int data;
    struct Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}; */

class Solution {
    Node removeDuplicates(Node head) {
        if(head == null || head.next == null)
            return head;
            
        Node temp = head;
        while(temp.next != null )
        {
            if(temp.data == temp.next.data)
            {
                temp.next = temp.next.next;
                //temp = temp.next;
            }
            else
            {
                temp = temp.next;
            }
        }
        return head;
    }
};

