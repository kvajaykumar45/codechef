/*
​ CRITICAL POINTS IN A LINKED LIST
Given the head of a linked list, Find the number of critical points. (The starting and end are not considered critical points). Local minima or maxima are called critical points. A Node is called a local minima if both next and previous elements are greater than the current element. A Node is called a local maxima if both next and previous elements are smaller than the current element.

​ Constraints
    • 1≤ Number of elements in the linked list , N ≤10^5 
    • 1 ≤ Node.data ≤ 10^9 
Input
8
1 2 3 3 3 5 1 3

Output
2 

Explanation:
1 is a minima and 5 is a maxima hence there are 2 critical points
*/
//Solution
// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        int points = 0;
        boolean ismax = false;
        boolean ismin = false;
        
        if(root == null || root.next == null || root.next.next == null)
            return 0;
        
        int prevdata = root.val;
        Node current = root.next;
        while(current != null && current.next != null)
        {
            Node nextnode = current.next;

            ismax = (current.val > nextnode.val) && (current.val > prevdata);
            ismin = (current.val < nextnode.val) && (current.val < prevdata);
            
            if(ismax) points++;
            if(ismin) points++;
            
            prevdata = current.val;
            current = current.next;
        }
        return points;
    }
}
