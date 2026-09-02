/*
​ SUM OF ELEMENTS IN AN ARRAY USING RECURSION

​ Problem Statement
Given an array of N integers, find the sum of all elements in the array using recursion. You must solve the problem recursively without using loops for calculating the sum.
​
 Input Format
    • The first line contains an integer N, representing the number of elements in the array.
    • The second line contains N space-separated integers, representing the elements of the array.
​
 Output Format
Print a single integer representing the sum of all elements in the array.
​
 Sample Input
5
10 20 30 40 50
​
 Sample Output
150
​
 Explanation
10 + 20 + 30 + 40 + 50 = 150
​
 Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9

Note: Since the sum can exceed the range of int, use long in Java for storing the sum.

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
	long s = sum(arr, n);
	System.out.println(s);
	}
	
	static long sum(int arr[], int n)
	{
	if(n == 0)
		return 0;
	return arr[n-1] + sum(arr, n-1); 
	}
	
}

/*


| Approach  |   Time | Extra Space |
| --------- | -----: | ----------: |
| Recursion | `O(N)` |      `O(N)` |
| Iteration | `O(N)` |      `O(1)` |


*/


