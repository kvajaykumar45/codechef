/*
Alternate Additions

Chef has 2 numbers A and B (A<B).

Chef will perform some operations on A.

In the ith operation:

    Chef will add 1 to A if i is odd.
    Chef will add 2 to A if i is even.

Chef can stop at any instant. Can Chef make A equal to B?

Input Format
    The first line contains a single integer T — the number of test cases. Then the test cases follow.
    The first and only line of each test case contains two space separated integers A and B.

Output Format
For each test case, output YES if Chef can make A and B equal, NO otherwise.
Note that the checker is case-insensitive. So, YES, Yes, yEs are all considered same.

Constraints
    1≤T≤1000
    1≤A<B≤10^9

Input
4
1 2
3 6
4 9
10 20

Output
YES
YES
NO
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
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int diff = b - a;
		    if(diff % 3 == 0 || diff % 3 == 1 )
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}

	}
}



