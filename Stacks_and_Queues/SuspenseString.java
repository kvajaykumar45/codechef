/*
SUSPENSE STRING
Alice and Bob are playing a game with a binary string S of length N and an empty string T.
They both take turns and Alice plays first.
    • In Alice's turn, she picks the first character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. 
    • In Bob's turn, he picks the last character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. 
The game stops when S becomes empty. Alice wants the resultant string T to be lexicographically smallest, while Bob wants the resultant string T to be lexicographically largest possible.
Find the resultant string T, if both of them play optimally.

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of multiple lines of input. 
        ◦ The first line of each test case contains a single integer N - the length of the string S. 
        ◦ The next line is the binary string S. 

Output Format
For each test case, print the the resultant string T, if both of them play optimally.

Constraints
    • 1≤T≤100 
    • 1≤N≤1000 
    • S can only contain the characters 0 or 1. 
    
Input
4
2
10
4
0001
6
010111
10
1110000010

Output
10
0100
101101
0011011000

*/
Source Code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0)
		{
		    int n = sc.nextInt();
		    String s = sc.next();
		    int alice = 0;
		    int bob = n-1;
		    Deque<Character> t = new ArrayDeque<>();
		    while(alice < bob)
		    {
		        char ch1 = s.charAt(alice);
		        char ch2 = s.charAt(bob);
		        
		        if(ch1 == '0')
		            t.addFirst(ch1);
		        else 
		            t.addLast(ch1);
		            
		        if(ch2 == '0')
		            t.addLast(ch2);
		        else 
		            t.addFirst(ch2);
		  
		        alice++;
		        bob--;
		    }
		    if(alice == bob)
		    {
		        char ch = s.charAt(alice);
		        if(ch == '0') t.addFirst(ch);
		        else t.addLast(ch);
		    }
		    StringBuilder sb = new StringBuilder();
		    for(char ch: t)
		        sb.append(ch);
		    
		    System.out.println(sb.toString());
		}
	}
}
/*
For your Suspense String solution using Deque<Character>:
Time Complexity
    1. Processing the string using two pointers: O(N)
        ◦ Each character is processed exactly once.
        ◦ addFirst() and addLast() take O(1) amortized time.
    2. Handling the middle character: O(1).
    3. Converting Deque into String using StringBuilder: O(N).
        ◦ Each character is visited once.
Overall Time Complexity: O(N)
Space Complexity
    1. Deque stores N characters: O(N).
    2. StringBuilder stores N characters: O(N).
Overall Auxiliary Space Complexity: O(N)
*/


