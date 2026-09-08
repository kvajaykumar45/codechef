/*
​ COUNT SET BITS USING RECURSION

​ Problem Statement
Given a non-negative integer N, count the number of set bits (1s) in its binary representation. You must solve the problem using recursion. A set bit is a bit whose value is 1.

For example:
    • 13 in binary is 1101
    • Number of set bits = 3

Input Format
    • The first line contains an integer N.

Output Format
    • Print the number of set bits (1s) in the binary representation of N.

Sample Input
13
​
Sample Output
3
​
            ​ Constraints
    • 0 ≤ N ≤ 10^18
    • The solution must use recursion.
    • For N = 0, the number of set bits is 0.
Another Example
Input
7
Output
3
Explanation: 7 in binary is 111, so it contains 3 set bits.
*/
//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long count = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    long n = sc.nextLong();
		findCount(n);
		System.out.println(count);

	}
	public static void findCount(long n)
	{
	    if(n == 0)
	        return;
	    
	    if ((n & 1L) == 1L)
	        count++;
	     
	     findCount(n>>1L);
	}
}

/*
| Complexity | Value                          |
| ---------- | ------------------------------ |
| Time       | **O(log N)**                   |
| Space      | **O(log N)** — recursion stack |
*/



