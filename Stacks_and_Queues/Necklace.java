/*
NECKLACE
Your best friend has a very interesting necklace with n pearls. On each of the pearls of the necklace there is an integer. However, your friend wants to modify the necklace a bit and asks you for help. She wants to move the first pearl k spots to the left (and do so with all other pearls).
For example: if the necklace was originally 1,5,3,4,2 and k=2, now it becomes 3,4,2,1,5. Help your best friend determine how the necklace will look after the modification.

Input Format
    • First line will contain T, the number of test cases. Then the test cases follow. 
    • Each test case contains two lines of input, the first containing two integers n,k. 
    • The second line of each test case contains n integers a1,a2,...,an representing the integers on the pearls starting from the first one. 

Output Format
For each testcase, output in a single line n integers representing the necklace after modification.

Constraints
    • 1 ≤ T ≤ 100 
    • 1 ≤ n ≤ 10^5 
    • The sum of n over all test cases does not exceed 3⋅10^5 
    • 0 ≤ k ≤ n 
    • −10^9 ≤ ai ≤ 10^9 

Subtasks
    • 30 points : The sum of n over all test cases does not exceed 5000 
    • 70 points : original constraints 

Input
2
5 3
1 5 3 4 2
6 5
10 1 2 9 8 2

Output
4 2 1 5 3
2 10 1 2 9 8

*/

//Queue Based Solution
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		int n = sc.nextInt();
		int k = sc.nextInt();
		k = k % n;
		Queue<Integer> q = new ArrayDeque<Integer>();
		for(int i=0; i<n; i++)
		    q.add(sc.nextInt());
		for(int i=0; i<k; i++)
		{
		    q.add(q.poll());
		}
	    for(int x: q)
	        System.out.print(x+" ");
	    System.out.println();
		}
	}
}

//Iterative Approach
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		    a[i] = sc.nextInt();
		for(int i=k; i<a.length; i++)
		    System.out.print(a[i]+" ");
		for(int i=0; i<k; i++)
		    System.out.print(a[i]+" ");
	    }
	    System.out.println();
	}
}

/*
Approach		Time Complexity		Space Complexity
Queue Based		O(n + k) → O(n) if k ≤ n		O(n)
Iterative Array	O(n)					O(n)
*/

