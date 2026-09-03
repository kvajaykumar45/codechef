
/*
​ GENERATE ALL BINARY STRINGS OF LENGTH N

Problem Statement
Given an integer N, generate and print all possible binary strings of length N.
A binary string consists only of the characters 0 and 1. Each position in the string can independently contain either 0 or 1.
The strings can be printed in any order.
​
Input Format
    • The first line contains an integer N, representing the length of each binary string.
Output Format
    • Print all possible binary strings of length N, one string per line.
Sample Input
3
​
Sample Output
000
001
010
011
100
101
110
111
​
Constraints
    • 1 ≤ N ≤ 20
    • Each generated string must contain exactly N characters.
    • Each character must be either 0 or 1.

Example
For N = 2, the possible binary strings are:
00
01
10
11
*/

//Solution

import java.util.Scanner;

public class BinaryStrings
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	generate("", n);
	}
	
	public static void generate(String s, int n)
	{
		if(n==0)
		{
			System.out.println(s);
			return;
		}
		generate(s+"0", n-1);
		generate(s+"1", n-1);
	}
}

/*
| Complexity        | Value      |
| ----------------- | ---------- |
| Recursive calls   | (2^(N+1)-1)|
| Number of outputs | (2^N)      |
| Time Complexity   | O(N × 2^N) |
| Auxiliary Space   | O(N)       |
*/

	
