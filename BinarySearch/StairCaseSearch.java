/*
Search in a 2D Matrix

You are given an N × M matrix where:
Each row is sorted in ascending order.
The first integer of each row is greater than the last integer of the previous row.
Your task is to find if an integer Target exists in the matrix.

Note: You must implement a solution with a time complexity faster than O(N + M).

Input Format
    The first line contains two integers, N and M, separated by a space, representing the number of rows and columns in the matrix, respectively.
    The next N lines each contain M integers, representing the elements of the matrix.
    The final line contains a single integer, Target, which is the value to search for in the matrix.

Output Format
    Print YES if the Target exists in the matrix.
    Print NO otherwise.

Constraints
1≤m,n≤100
−10^4≤matrix[i][j],target≤10^4
The matrix is guaranteed to be non-empty and sorted.


Input
3 4
1 3 5 7 
10 11 16 20 
23 30 34 60
3

Output
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
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i=0; i<n; i++)
		for(int j=0; j<m; j++)
		    a[i][j] = sc.nextInt();
		int target = sc.nextInt();
        int right = m-1;
        int top = 0;
        boolean flag = false;
        while(top < n && right >= 0)
        {
            int element = a[top][right];
            if(element == target)
            {
                System.out.println("YES");
                flag = true;
                break;
            }
            else if(target > element)
            {
                top++;
            }
            else if(target < element)
            {
                right--;
            }
        }
        if(!flag)
            System.out.println("NO");
	}
}




