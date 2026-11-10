/*
INFIX TO POSTFIX
You are given an Infix expression. Use the stack data structure to convert it to a Postfix expression.
Stack is already implemented for your convenience in the code editor.
You can use the stack using the following functions-
    • createStack(capacity) - This function is used to create a stack. 
    • isEmpty() - This function returns 1 if the stack is empty, otherwise it returns 0. 
    • peek() - This function returns the top element in the stack. 
    • push(stack, item) - This function is used to push items into the stack. 
    • pop() - This function is used to pop the top element of the stack. 

Task
Write a program in C to convert an infix expression to postfix expression using stack data structure.
Note:
    • You need to take the infix expression as input from the user inside main() 
    • Complete the required logic in main() using the given stack functions 

Input Format
    • The first line contains a variable N, the length of the expression 
    • The second line contains a string S containing an infix expression 

Output Format
In a single line output the postfix expression

Constraints
    • 1≤N≤100000 

Input 1 
7 
A+B*C+D

Output 1
ABC*+D+

Input 2
17
((A+B)-C*(D/E))+F

Output 2
AB+CDE/*-F+

*/

//Source Code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int getPrecedence(char op)
    {
        if (op == '^') return 3;
        else if (op == '*' || op == '/' || op == '%') return 2;
        else if (op == '+' || op == '-') return 1;
        return -1;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = sc.next();
		StringBuilder output = new StringBuilder();
		Deque<Character> stack = new ArrayDeque<>();
		for(int i=0; i<n; i++)
		{
		    char ch = input.charAt(i); 
		    if(Character.isLetterOrDigit(ch))
		    {
		        output.append(ch);
		    }
		    else if(ch == '(')
		    {
		        stack.push(ch);
		    }
		    else if(ch == ')')
		    {
		        while(!stack.isEmpty() && stack.peek() != '(')
		        {
		            output.append(stack.pop());
		        }
		        stack.pop();
		    }
		    else 
		    {
		        while(!stack.isEmpty() && stack.peek() != '(' &&
		            getPrecedence(stack.peek()) >= getPrecedence(ch))
		            {
		                output.append(stack.pop());
		            }
		            stack.push(ch);
		    }
		}
        while(!stack.isEmpty())
        {
            output.append(stack.pop());
        }
        System.out.println(output.toString());
}
}

/*
Time Complexity: O(N)
Each character is processed once. Every operator is pushed and popped at most once.
Auxiliary Space Complexity: O(N)
Stack can store up to N operators/parentheses, and StringBuilder can store N characters.
*/


