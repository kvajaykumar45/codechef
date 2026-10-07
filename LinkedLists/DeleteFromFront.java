DELETE FROM FRONT
Before deleting a node, we will need to find it by value. To find a value, we can traverse the linked list and see if node of any value matches the value we want to delete. Once the targetNode is found, we can then delete it.
Task Complete the function deleteNode to delete an element from the front of the linked list.
Constraints
    • 1 ≤ N ≤ 10^5 
    • 1 ≤ NodeValue ≤ 10^9 
Input
5 1
1 2 3 4 5
Output
2 3 4 5 
Solution
void deleteNode(int value) {
    if (head.value == value) {
        Node targetNode = head;
        // Set head to the next of the current node
        head = targetNode.next;
    }
}

