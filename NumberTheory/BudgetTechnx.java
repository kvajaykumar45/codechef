


/*
Budget of Technex

The budget of Technex'23 is R thousand rupees. Since ICM is their flagship event, they will allocate at least half of their budget to it.

There are 55 other events planned under Technex'23.
The team wants to distribute the remaining amount equally among these.
Find the maximum amount in rupees that could be allocated to each of the other five events.

Input Format
    The first line of input will contain a single integer TT, denoting the number of test cases.
    The first and only line of each test case contains a single integer RR, the budget of Technex'23 in thousand rupees.

Output Format
For each test case, output a single integer on a new line, the maximum amount in rupees that could be allocated to each of the other five events.

Constraints
1≤T≤100
1≤R≤3000

Input
3
20
43
133

Output
2000
4300
13300
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
		    long r = sc.nextLong();
		    System.out.println(r*100);
		}

	}
}

