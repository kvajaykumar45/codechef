/*

​ COUNT OCCURRENCES OF AN ELEMENT

Problem Statement
Given an array of N integers and a target integer X, count how many times X occurs in the array.
You must solve the problem using recursion.
​
Input Format
    • The first line contains an integer N, representing the number of elements in the array.
    • The second line contains N space-separated integers representing the array elements.
    • The third line contains an integer X, the element whose occurrences need to be counted.

Output Format
Print a single integer representing the number of times X occurs in the array.
​
Sample Input
7
2 5 2 8 2 9 2
2
​
Sample Output
4
​
Constraints
    • 1 ≤ N ≤ 10^5
    • -10^9 ≤ arr[i] ≤ 10^9
    • -10^9 ≤ X ≤ 10^9

Example:
For the array 2 5 2 8 2 9 2, the element 2 occurs 4 times.

*/

// Java solution

import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0; i<n; i++)
		a[i] = sc.nextInt();
	int x = sc.nextInt();
	System.out.println(countElement(a, x, n));
	}
	static int countElement(int[] a, int x, int n)
	{
   		 if(n == 0)
        			return 0;
   		 return (a[n - 1] == x ? 1 : 0) + countElement(a, x, n - 1);
	}
}

/*

Approach		Time Complexity	Space Complexity	Remarks
Recursive approach 		O(N)		O(N)			Better recursive design
Iterative approach		O(N)		O(1)			Most space-efficient

*/




