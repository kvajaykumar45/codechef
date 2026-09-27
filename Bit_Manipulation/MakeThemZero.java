/*
Make them Zero

You are given an array A of length N.
You can perform the following operation on the array any number of times:
    • Choose any subsequence S of the array A and a positive integer X such that X is a power of 2 and subtract X from all the elements of the subsequence S. 
Find the minimum number of operations required to make all the elements of the array equal to 0.

Input Format
    • First line will contain T, number of test cases. Then the test cases follow. 
    • First line of each test case contains an integer N denoting the length of the array A. 
    • Second line contains N space-separated integers A1, A2,…,AN - denoting the elements of array A. 

Output Format
For each test case, output in a single line, the minimum number of moves required to make all the elements of the array A equal to 0.

Constraints
    • 1≤T≤1000 
    • 1≤N≤10^5 
    • 0≤Ai≤10^9 
    • Sum of N over all test cases do not exceed 2⋅10^5. 

Sample 1:
Input
4
3
2 2 2
4
2 2 2 4
2
0 0
3
1 2 3

Output
1
2
0
2
*/

//Java Solution1:
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
		    int n = sc.nextInt();
		    boolean bits[] = new boolean[30];
		    for(int i=0; i<n; i++)
		    {
		        int k = sc.nextInt();
		        for(int j=0; j<30; j++)
		        {
		            if ((k & (1 << j)) != 0)
		            bits[j] = true;
		        }
		    }
		    int count = 0;
		    for(int i=0; i<bits.length; i++)
		    {
		        if(bits[i] == true)
		            count++;
		    }
		    System.out.println(count);
		    t--;
		}

	}
}
/*
Time: O(30N) = O(N) per test case
Space: O(30) = O(1)
*/

//Java Solution 2:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int n = sc.nextInt();
		    int or = 0;
		    for(int i=0; i<n; i++)
		    {
		        int k = sc.nextInt();
		        or = or | k;
		    }
		        
		    System.out.println(Integer.bitCount(or));
		    t--;
		}

	}
}
