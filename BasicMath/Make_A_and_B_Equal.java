/*


Make A and B equal

Chef has two numbers A and B. In one operation, Chef can choose either A or B and multiply it by 2.
Determine whether he can make both A and B equal after any number (possibly, zero) of moves.

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of two space-separated integers A and B.

Output Format
For each test case, output YES if Chef can make both numbers equal, NO otherwise.
Note that the checker is case-insensitive i.e. YES, Yes, yes, yES are all considered same.

Constraints
1≤T≤2500
01≤A,B≤50

Input
4
5 20
6 6
12 2
50 20


Output
YES
YES
NO
NO
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
		    
		    while(a<b)
		        a = a * 2;
		    
		    while(b<a)
		        b = b * 2;
		    
		    if(a == b)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}

