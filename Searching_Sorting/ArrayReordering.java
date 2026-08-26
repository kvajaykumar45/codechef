/*
ARRAY REORDERING
You are given two arrays A and B of size N. Given a function F such that. F(i,j)=Ai+Bj 
Reorder the arrays A and B such that F(i,j)≥F(j,i), 1 ≤ i ≤ N, 1 ≤ j ≤ N, i < j.

Input Format
    • The first line of the input contains a single integer T - the number of test cases. The description of T test cases follows. 
    • Each test case will contain three lines of input. 
    • The first line of each test case contains a single integer N. 
    • The second line of each test case contains N integers, A1,A2...AN. 
    • The third line of each test case contains N integers, B1,B2...BN. 

Output Format
    • In the first line of output, print the rearranged array A. 
    • In the first line of output, print the rearranged array B. 

Constraints
    • 1≤T≤100 
    • 1 ≤ N ≤ 10^5 
    • 1 ≤ Ai,Bi ≤ 10^9 
    • It is guaranteed that the sum of N over all test cases is less than or equal to 2∗105. 
    
Subtasks
    • 20 points : The sum of N over all the testcases is less than or equal to 10. 
    • 40 points : The sum of N over all the testcases is less than or equal to 2∗103. 
    • 40 points : ORIGINAL CONSTRAINTS 

Sample 1:
Input
1
4
3 8 1 5
2 1 6 4
Output
8 5 3 1 
1 2 4 6 

*/

//Java Solution:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
	    while(t>0)
	    {
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        int b[] = new int[n];
	        for(int i=0; i<n; i++)
	            a[i] = sc.nextInt();
	        for(int j=0; j<n; j++)
	            b[j] = sc.nextInt();
	        Arrays.sort(a);
	        Arrays.sort(b);
	        for(int i=n-1; i>=0; i--)
	            System.out.print(a[i] + " ");
	        System.out.println();
	        for(int i=0; i<n; i++)
	            System.out.print(b[i] + " ");
	        t--;
	    }
	}
}

/*
Complexity		Result
Time			O(N log N)
Space			O(N)

*/
