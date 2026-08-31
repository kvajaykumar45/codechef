/*
Backtracking - Find Valid Parenthesis

Given N pairs of parentheses. Find all valid parentheses string of length 2⋅N.

Note: A valid parentheses string is defined as:

    Empty string is valid.
    If P is valid, (P) is also valid.
    If P and Q are valid, PQ is also valid.

Input Format

    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of a single line of input, containing integer N.

Output Format

For each test case, output M+1 lines, where M is the number of valid parentheses:

    The first line contains a single integer M.
    The next M lines contain string of length 2⋅N.

Note: The valid parentheses strings must be printed in lexicographically increasing order. String SS is said to be lexicographically smaller than string T if there exists a position i where Si​<Ti​ and Sj​=Tj​ for all j<i.
Constraints

    1≤T≤10
    1≤N≤11
   */
// Java Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static StringBuilder result = new StringBuilder();
    public static int count = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); 
		while(t-- > 0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    generate(n, n, new StringBuilder() );
		    System.out.println(count);
            result.append("\n");
            System.out.println(result);
            result = new StringBuilder();
            count = 0;
		    
		}
	}
		
		public static void generate(int open, int close, StringBuilder s)
		{
		    if(open == 0 && close == 0)
		    {
		        result.append(s).append("\n");
		        count++;
		    }
		    if(open > 0)
		    {
		        generate(open-1, close, s.append("(") );
		        s.deleteCharAt(s.length()-1);
		    }
		    
		    if(close > open)
		    {
		        generate(open, close-1, s.append(")") );
		        s.deleteCharAt(s.length()-1);
		    }
		        
		}
}

/*
| Complexity                 | Value         |
| -------------------------- | ------------- |
|   Time Complexity          | O(Cₙ × n)     |
|   Auxiliary Space          | O(n)          |
|   Space including output   | O(Cₙ × n)     |




*/


