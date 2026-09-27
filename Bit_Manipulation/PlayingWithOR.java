/*

Problem: Playing with OR
You are given an array A containing N integers, and an integer K (1≤K≤N). 
Find the number of subarrays of A with length K whose bitwise OR is odd.
Note: A subarray of A is a contiguous segment of elements of A. 
For example, if A=[1,3,2], then it has 6 non-empty subarrays: [1],[3],[2],[1,3],[3,2],[1,3,2]. 
In particular, [1,2] is not a subarray of A.

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of two lines of input. 
        ◦ The first line of each test case contains two space-separated integers N and K — the length of the array and the subarray size you have to check, respectively. 
        ◦ The second line of each test contains N space-separated integers A1,A2,…,AN — the elements of the array. 

Output Format
For each test case, output on a new line the number of length-K subarrays of A whose bitwise OR is odd.
            ​ Constraints
    • 1≤T≤10^5 
    • 1≤K≤N≤5⋅10^5 
    • 1≤Ai≤10^9 
    • The sum of N across all tests doesn't exceed 5⋅10^5. 

Sample 1:
Input
2
5 2
5 7 13 4 6
4 3
2 6 7 4

Output
3
2

Explanation:
Test case 1: There are four subarrays of length K=2.
    • [5,7], with bitwise OR equal to 7. 
    • [7,13], with bitwise OR equal to 15. 
    • [13,4], with bitwise OR equal to 13. 
    • [4,6], with bitwise OR equal to 6. 
Three of them are odd, so the answer is 3.
*/

// Java Solution:

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
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    int count = 0;
		    int oddcount = 0;
		    for(int i=0; i<k; i++)
		    {
		        if((a[i] & 1) == 1)
		            oddcount++;
		    }
		    if(oddcount>0)
		        count++;
		    for(int i=k; i<n; i++)
		    {
		        if((a[i-k] & 1) == 1)
		            oddcount--;
		        if((a[i] & 1) == 1)
		            oddcount++;
		        if(oddcount>0)
		            count++;
		    }
		    System.out.println(count);
		    t--;
		}

	}
}

/*
The time complexity is O(N) for each test case.
Space Complexity: O(N) because of array size
*/
