/*
INSERTION AT END IN CIRCULAR LINKED LIST
Let's learn how to insert an element at the end of circular linked list.
Whenever inserting a new node, there can be two cases:
    1. The list is empty (head = null) - Simply assign both head and tail as the new node and update the next pointer of tail.
    2. The list is not empty
    • The new node is supposed to be added after tail, thus set next of tail to new node. 
    • Update the tail to new node because now it is the last element. 
    • Update the next of new tail to existing head. 
Complete the insertAtEnd function

Input
5
1 2 3 4 5

Output
1 2 3 4 5
*/

//Solution

import java.util.Scanner;

class Main {

    private static class MyCircularList {
        
        // Notice there are no changes in the node class
        private class node {
            int value;
            node next;

            public node(int val) {
                this.value = val;
                this.next = null;
            }
        }
        
        // Additional pointer tail also maintained
        node head;
        node tail;

        public MyCircularList(){
            // Initialising both head and tail as null when list is created.
            head=null;
            tail=null;
        }

        public void insertAtEnd(int val){
            node newnode = new node(val);
            if(this.head==null){
                // When the list is empty
                // Note that even though there is not really a head in the list (you can traverse the list starting at any point), we maintain the first node we insert as the head
                this.head = newnode;
                this.tail = newnode;
            }
            else{
                // When the list is not empty
                // Add a new element towards the end of list
                tail.next = newnode.next;
                tail.next = newnode;
                tail = newnode;
            }
        }

        public void print(){
            node temp = this.head;
            while(temp!=null){
                System.out.printf("%d ",temp.value);
                if(temp==this.tail) break;
                temp=temp.next;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCircularList list = new MyCircularList();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        list.print();
    }
}

