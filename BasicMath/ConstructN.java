/*

Construct N

You are given an integer N. Find if it is possible to represent N as the sum of several(possibly zero) 2's and several(possibly zero) 7's.

Formally, find if there exist two integers X,Y (X,Y≥0) such that 2⋅X+7⋅Y=N.

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of a single line containing an integer N.

Output Format
For each test case, print on a new line YES if it is possible to represent N as the sum of several(possibly zero) 2's and several(possibly zero) 7's and NO otherwise.

You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

Constraints

1≤T≤1000
1≤N≤10^8

Input
4
2
5
7
11


Output
YES
NO
YES
YES
*/

//Source Code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
		    int n = sc.nextInt();
		    if(n%2 == 0)
		        System.out.println("YES");
		    else if(n>=7 && (n-7)%2==0)
		        System.out.println("YES");
		    else 
		        System.out.println("NO");
		    
		}

	}
}
	
