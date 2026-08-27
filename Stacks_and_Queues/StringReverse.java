/*
IMPLEMENT STACK USING ARRAYS
Here's a simple exercise that involves implementing a stack. 
In this exercise, you'll implement a basic stack to reverse a string using the stack's LIFO property.
Task
Update the functions push() and pop() within the class stack to output the reverses string.
Input Hello, World!
Output !dlroW ,olleH
*/
//Java Solution
import java.util.Scanner;

class Stack {
    private static final int STACK_CAPACITY = 101;
    private char[] stackArray = new char[STACK_CAPACITY];
    private int topIndex = -1;

    void push(char character) {
        // If stack is full (check using isFull function)
        // Then print "Stack is full"
        // Otherwise add the next element at topIndex + 1 and update topIndex
        if(topIndex == STACK_CAPACITY)
            System.out.println("Stack is full");
        else
        {
            topIndex++;
            stackArray[topIndex] = character;
        }
        
    }

    char pop() {
        // If the stack is empty (check using isEmpty function)
        // Then print "Stack is empty" and return '-1'
        // Otherwise return the element at the topIndex
        // But reduce topIndex before returning the element
        if(topIndex == -1)
        {
            System.out.println("Stack is empty");
            return '-' ;
        }
        return stackArray[topIndex--];
    }

    boolean isEmpty() {
        return topIndex == -1;
    }

    boolean isFull() {
        return topIndex >= STACK_CAPACITY - 1;
    }
}

class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int inputLength = inputString.length();

        Stack charStack = new Stack();

        // Push each character onto the stack
        for (int i = 0; i < inputLength; i++) {
            char currentChar = inputString.charAt(i);
            charStack.push(currentChar);
        }

        // Pop the characters from the stack to construct the reversed string
        StringBuilder reversedString = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedString.append(charStack.pop());
        }

        System.out.println(reversedString.toString());
    }
}
/*
For your program, let n = length of the input string.
Time Complexity: O(n)
There are two main operations:
1. Push all characters
	This runs n times, and each push() is O(1). So → O(n)
2. Pop all characters
	Again, pop() runs n times, and each pop is O(1). So → O(n)
Therefore:
O(n) + O(n) = O(n)
Time Complexity = O(n)
Space Complexity: O(n)
Your stack stores all n characters:
private char[] stackArray = new char[STACK_CAPACITY];
The StringBuilder also stores the reversed string of length n.
So the additional space is proportional to n.
Space Complexity = O(n)
*/
