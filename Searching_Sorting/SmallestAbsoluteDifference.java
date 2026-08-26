/*
FIND SMALLEST ABSOLUTE DIFFERENCE
Write a program to find the element in an array with the smallest absolute difference from a given integer k. If there are multiple elements with the same minimum difference, print the smallest of these elements.

Input Format
    • The first line contains two integers n and k, where n is the number of elements in the array and k is the integer against which to compare. 
    • The second line contains n integers separated by spaces, representing the elements of the array. 

Output Format
    • Print the element in the array with the smallest difference from k. If multiple elements have the same minimum difference, print the smallest of these elements. 

Constraints
    • 1≤N≤100000 
    • −10^9 ≤ arr[i] ≤ 10^9 
    • −10^9 ≤ k ≤ 10^9 

Sample 1:
Input
5 10
1 5 9 12 14
Output 9
*/

//Java Solution:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int mindiff = Math.abs(x-k);
		int answer = x;
		for(int i=2; i<=n; i++)
		{
		    x = sc.nextInt();
		    int diff = Math.abs(x-k);
		    if(diff < mindiff)
		    {
		        mindiff = diff;
		        answer = x; 
		    }
		    else if(diff == mindiff)
		    {
		        if(x < answer)
		            answer = x;
		    }
		}
		System.out.println(answer);
	}
}

/*
Complexity	Result
Time		O(n)
Space		O(1)
*/
