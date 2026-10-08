/**

​ CYCLE IN A LINKED LIST
You are given a linked list A of size N. Return the node where the cycle begins in the linked list. If there is no cycle, return NULL.
​
 Input:
    • First line will contain T, number of test cases. Then the test cases follow. 
    • Each test case contains three lines of input. 
    • First line contains an integer N, length of the linked list A. 
    • Second line contains A1,A2,…AN the value of the linked list nodes starting from the head for the linked list. 
    • Third line contains an integer denoting the index of the node where the cycle starts. 
​
 Output:
The function you complete should return the required answer.
​
 Constraints
    • 1 ≤ T ≤ 10 
    • 1 ≤ N ≤ 10^5 
    • 1 ≤ Ai ≤ 10^9 

Input
3
2
8 5
1
2
5 9
1
3
5 6 8
2

Output
8
5
6
*/

//Solution

/* Node is defined as
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/
class Solution {
    public static Node detectCycle(Node head){
        if(head == null || head.next == null)
            return null;
        
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)
            {
                flag = true;
                break;
            }
        }
        
        if(!flag)
            return null;
            
        slow = head;
        while(fast != slow)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        }
}


