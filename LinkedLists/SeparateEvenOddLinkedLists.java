/*
Separate Even and Odd values in a linked list

Chef has a linked list. He wants to modify the linked list such that all the even values appear before the odd values without changing their relative order. But he's too busy now and asked you to do the job for him.
Can you do it?

Input Format
    First-line will contain T, the number of test cases. Then the test cases follow.
    Each test case contains two lines of input.
    The first line of every test case contains an integer N - the length of array.
    The second line of every test case contains N integers - A1​,A2​,..,AN​ denoting the integers in the linked list.
    You don't need to read or print anything. Just complete the function rearrange() which takes the head of the linked list as input.

Output Format
Return the head of the linked list after rearrangement.

Constraints
1 ≤ T ≤ 10^3
1 ≤ N ≤ 10^5
1 ≤ Ai ​≤ 10^9
∑N ≤ 5⋅10^5

Input 1
3
3
1 2 3
4 
1 7 6 8
4
2 1 4 3

Output 1
2 1 3
6 8 1 7
2 4 1 3

*/


class Solution {
    public Node rearrange(Node head) {
        if(head == null || head.next == null)
            return head;
        Node even = null;
        Node odd = null;
        Node temp = head;
        
        Node eventemp = null;
        Node oddtemp = null;
        while(temp != null)
        {
            Node next = temp.next;
            temp.next = null;
            if(temp.val % 2 == 0)
            {
                if(even == null)
                {
                    even = temp;
                    eventemp = temp;
                }
                else 
                {
                    eventemp.next = temp;
                    eventemp = temp;
                }
            }
            else 
            {
                if(odd == null)
                {
                    odd = temp;
                    oddtemp = temp;
                }
                else 
                {
                    oddtemp.next = temp;
                    oddtemp = temp;
                }
            }
            temp = next;
        }
        if(even == null) return odd;
        eventemp.next = odd;
        return even;
    }
}






