/* 
 RECURSIVE ARRAY SEARCH
 Problem Statement
Given an array of N integers and a target integer X, search for X in the array using recursion. If X is present in the array, print its index of the first occurrence. If X is not present, print -1. You must solve the problem using a recursive function.

Input Format
    • The first line contains an integer N, representing the number of elements in the array.
    • The second line contains N space-separated integers representing the array elements.
    • The third line contains an integer X, representing the target element to search for.

Output Format
    • Print the index of the first occurrence of X.
    • If X is not present in the array, print -1.

Sample Input
7
10 25 30 15 25 40 50
25

Sample Output
1

Explanation
The target 25 occurs at indices 1 and 4.
Since we need the first occurrence, the output is:
1

Constraints
    • 1 ≤ N ≤ 10⁵
    • -10⁹ ≤ arr[i] ≤ 10⁹
    • -10⁹ ≤ X ≤ 10⁹
Note: Array indices are 0-based.
*/

//Solution
import java.util.Scanner;
public class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		int k = sc.nextInt();
		int output = search(a, k, 0);
		System.out.println(output);
	}
	
	public static int search(int a[], int k, int index)
	{
	if(index == a.length)
		return -1;
	if(a[index] == k)
		return index;
	return search(a, k, index+1);
	}
}
/*
Time Complexity: O(n) Worst Case
Space Complexity: O(n) Worst Case 
*/


