


/*
Check if Linked List is Palindrome

Chef has been given a singly linked list containing integers.
He wants to check whether the given linked list forms a palindrome — i.e., it reads the same forwards and backwards.Your task is to help Chef determine if the linked list is a palindrome.

Function Declaration
Function Name
isPalindromeisPalindrome – This function checks whether a singly linked list is a palindrome.
Parameters
headhead : A pointer to the head node of the singly linked list.

Return Value
Returns truetrue if the linked list is a palindrome.
Returns falsefalse otherwise.

Constraints
1≤N≤105, where N is the number of nodes in the linked list.
0≤ Value stored in each node ≤9
The linked list is singly linked

The input and output formats provided below are only for testing with custom inputs. You only need to complete the core logic function.

Input Format
    The first line contains a single integer NN — the number of nodes in the linked list.
    The second line contains NN space-separated integers representing the values of the linked list nodes in order.

Output Format
    Print YES if the linked list is a palindrome.
    Otherwise, print NO

Input 1
5
1 2 3 2 1

Output 1
YES

Explanation:
In the first case, the list 1 -> 2 -> 3 -> 2 -> 1 reads the same backward.

Input 2
4
1 2 3 4

Output
NO

Explanation:
In the second case, 1 -> 2 -> 3 -> 4 does not read the same backward.
*/

// Node structure used:
// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }
class Solution {
    public boolean isPalindrome(Node head) {
        //write your code here...
        
        Node temp = head;
        Node rhead = null;
        while(temp != null)
        {
            Node newnode = new Node(temp.val);
            newnode.next = rhead;
            rhead = newnode;
            temp = temp.next;
        }
        boolean flag = true;
        while(head != null)
        {
            if(head.val != rhead.val)
            {
                flag = false;
                break;
            }
            head = head.next;
            rhead = rhead.next;
        }
        return flag;
    }
}


