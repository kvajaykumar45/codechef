



/*
Divisible by 3

Stack likes the number 33 a lot.

He has two non-negative integers A and B.
In one operation, Stack can do either of the following:

    A:=∣A−B∣ (change A to ∣A−B∣)
    B:=∣A−B∣ (change B to∣A−B∣)

Note that ∣X∣ denotes absolute value of XX. For example ∣−7∣=7 and ∣4∣=4.

Find the minimum number of operations after which at least one integer out of A and B becomes divisible by 3.

Input Format
    The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
    The only line of each test case contains two integers A and B.

Output Format
For each test case, output in a single line the minimum number of operations after which at least one integer out of A and B becomes divisible by 3.

Constraints
    1≤T≤10^5
    0≤A,B≤10^9
    
Input
2
0 343
1 1


Output
0
1

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
		    int count = 0;
		    while(true)
		    {
		        if(a % 3 == 0 || b % 3 == 0)
		        {
		            System.out.println(count);
		            break;
		        }
		        b = a = Math.abs(a-b);
		        count++;
		    }
		}

	}
}

