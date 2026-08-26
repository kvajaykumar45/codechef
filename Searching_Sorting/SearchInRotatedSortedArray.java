/*

SEARCH IN ROTATED SORTED ARRAY
You are given a sorted array that has been rotated to the right by some number of steps. Your task is to find the index of a given element in this array.
For example, if a sorted array [1,2,3,4,5] is rotated by 2 positions, it becomes [4,5,1,2,3]. Despite being rotated, the array maintains some order that can be used to search efficiently.

Input Format
    • First line contains T - the number of test cases 
    • For each test case: 
        ◦ First line contains two space-separated integers N and K - size of array and element to find 
        ◦ Second line contains N space-separated integers A1,A2, ...,AN - the rotated array elements 

Output Format
    • For each test case, print a single integer - the index of K in the array (0-based indexing), or -1 if K is not found 

Constraints
    • 1≤ T ≤ 100 
    • 1≤ N ≤ 5000 
    • 0≤ K ≤ 10^5 
    • 0≤ A[i] ≤ 10^5 

Sample 1:
Input
4

5 2
12 15 18 2 4

4 3
3 4 1 2

6 6
6 7 1 2 3 4

5 5
1 2 3 4 5

Output
3
0
0
4
*/


//Java Solution:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int i;
		    int a[] = new int[n];
		    for(i=0; i<n; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    int result = -1;
		    int low = 0;
		    int high = n-1;
		    while(low <= high)
		    {
		        int mid = low + (high - low)/2;
		        if(a[mid] == k)
		        {
		            result = mid;
		            break;
		        }
		        if(a[low] <= a[mid])
		        {
		            if(a[low] <= k && k < a[mid])
		            {
		                high = mid - 1;
		            }
		            else
		            {
		                low = mid + 1;
		            }
		        }
		        else
		        {
		            if(k > a[mid] && k <= a[high])
		            {
		                low = mid + 1;
		            }
		            else
		            {
		                high = mid - 1;
		            }
		        }
		        
		    }
		    
		        System.out.println(result);
		    t--;
		}

	}
}
/*
Complexity
Because you're storing the array:
    • Time: O(n) to read the input + O(log n) to search → overall O(n) 
    • Extra space: O(n) for the array 
The search itself is O(log n) time and O(1) extra space.
*/
