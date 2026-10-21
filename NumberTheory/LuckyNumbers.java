/**
Lucky Numbers

Chef calls a number lucky if it contains the digit 7 at least once. Given a number X, determine if it is a lucky number or not.

Input Format
    The first line contains a single integer T — the number of test cases. Then the test cases follow.
    The first and only line of each test case contains an integer X — the number mentioned in the problem statement.

Output Format
For each test case, output YES if X is a lucky number. Otherwise, output NO.
You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
    1≤T≤1000
    1≤X≤10^9
    
Input
4
6
478
2090
77777

Output
NO
YES
NO
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
		while(t-- > 0)
		{
		    int x = sc.nextInt();
		    boolean flag = false;
		    while(x > 0)
		    {
		        int r = x % 10;
		        if(r == 7) 
		        {
		            flag = true;
		            break;
		        }
		        x = x/10;
		    }
		    if(flag)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}


