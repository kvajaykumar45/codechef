/*
FIND Kth CHARACTER POSITION
Given a string s1, a character c1, and an integer k, find and print the position of the kth occurrence of the character c1 in the string s1. If the kth occurrence does not exist, print -1.

Input Format
    • The first line contains the string s1, the character c1, and the integer k separated by spaces. 

Output Format
    • An integer representing the position of the kth occurrence of c1 in s1. 
    • If the kth occurrence does not exist, print -1. 
Constraints
    • 1 ≤ Length of string S1 ≤ 100000 
    • s1 consists of lowercase and uppercase English letters. 
    • c1 is a single English alphabet character. 
    • 1 ≤ k ≤ 100000. 

Sample 1:
Input HelloHowyoudoing H 2
Output 5

Sample 2:
Input  funny n 3
Output -1
*/

//Java Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char c1 = sc.next().charAt(0);
		int k = sc.nextInt();
		int n = s1.length();
		int count = 0;
		int i;
		for(i=0; i<n; i++)
		{
		    if(s1.charAt(i) == c1)
		        count++;
		    if(count == k)
		    {
		        System.out.println(i);
		        break;
		    }
		}
		if(i == n)
		    System.out.println(-1);
	}
}

/*
Time: O(n)
Space: O(1)
*/
