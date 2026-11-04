
/*

Target Digit Sum

You are given a sorted array A of N positive integers and an integer D.

The digit sum of an integer is the sum of all its decimal digits. For example, the digit sum of 123 is 1+2+3=6.

Find the smallest integer in the array whose digit sum is exactly D. If no such integer exists, print −1.

Input Format
    The first line contains an integer N — the number of elements in the array.
    The second line contains NN space-separated integers A1​,A2​,…,AN​ in increasing order.
    The third line contains an integer DD — the required digit sum.

Output Format
    Print the smallest integer in the array whose digit sum is equal to D.
    If no such integer exists, print −1.

Constraints
1≤N≤20
10≤Ai​≤1000
A1​<A2​<⋯<AN​
1≤D≤27

Sample Input 1
5
12 23 30 48 56
3

Sample Output 1
12



Explanation:

The digit sum of 12 is 1+2=3
Since 12 is the smallest number in the array with digit sum 3, the answer is 12
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    int d = sc.nextInt();
		    boolean flag = false;
		    for(int i=0; i<n; i++)
		    {
		        if(d == digitSum(a[i]))
		        {
		            System.out.println(a[i]);
		            flag = true;
		            break;
		        }
		    }
		    if(!flag) System.out.println(-1);
		
	}
	public static int digitSum(int num)
	{
	    int sum = 0;
	    while(num > 0)
	    {
	       sum += num%10;
	       num /= 10;
	    }
	    return sum;
	}
}


