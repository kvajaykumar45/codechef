/*


​ FIND MAXIMUM ELEMENT USING RECURSION


​Problem Statement
Given an array of N integers, find and print the maximum element in the array using recursion.
You must recursively examine the elements of the array and return the largest value.
​
Input Format
    • The first line contains an integer N, the number of elements in the array.
    • The second line contains N space-separated integers representing the array elements.

Output Format
Print a single integer representing the maximum element in the array.
​
Sample Input
6
12 45 7 89 23 56
​
Sample Output
89
​
Constraints
    • 1 ≤ N ≤ 10^5
    • -10^9 ≤ arr[i] ≤ 10^9
    • The array contains at least one element.

Example
For the array:
[12, 45, 7, 89, 23, 56]
The maximum element is:
89

Note: The solution should use recursion to find the maximum element.
*/

// Java Solution

import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++)
		arr[i] = sc.nextInt();
	System.out.println(maxElement(arr, arr[n-1], n));
	}
	static int maxElement(int[] arr, int big, int n)
	{
		if(n == 0)
			return big;
		if(big < arr[n-1])
			big = arr[n-1];
		return maxElement(arr, big, n-1);	
	}
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/


