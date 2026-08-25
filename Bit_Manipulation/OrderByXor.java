/*
Problem: Order by XOR
You are given three distinct integers A,B, and C. 
Find any integer X (0≤X<230) such that: (A⊕X) < (B⊕X) < (C⊕X), where ⊕ denotes the Bitwise XOR operation. If no such X exists, print −1 instead.

Input Format
    • The first line of the input contains a single integer T, the number of test cases. 
    • The first and only line of each test case contains three space-separated integers A,B, and C. 

Output Format
For each test case, output a single integer on a new line, the value of X that satisfies the above conditions or −1 if no such X exists. If multiple such X satisfy the condition, you may print any.
            ​ Constraints
    • 1≤T≤10^5 
    • 1≤A,B,C<2^30 
    • A,B,C are distinct. 

Sample 1:
Input
3
1 2 3
3 1 2
3 2 1

Explanation:
Test case 1: For X=4,
    • A⊕X=1⊕4 =5 
    • B⊕X=2⊕4 =6 
    • C⊕X=3⊕4 =7 
Thus, (A⊕X) < (B⊕X) < (C⊕X).
Test case 2: No X (0≤X<230) exists that satisfies the above conditions.
Test case 3: For X=3,
    • A⊕X=3⊕3 =0 
    • B⊕X=2⊕3 =1 
    • C⊕X=1⊕3 =2 
Thus, (A⊕X) < (B⊕X) < (C⊕X).
*/

//Java Solution:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t>0)
	    {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d1 = a^b;
	        int d2 = b^c;
	        int bit1 = 31 - Integer.numberOfLeadingZeros(d1);
	        int bit2 = 31 - Integer.numberOfLeadingZeros(d2); 
	        if(bit1 == bit2)
	        {
	            System.out.println(-1);
	            t--;
	            continue;
	        }
	        int mask1 = 1 << bit1;
	        int mask2 = 1 << bit2;
	        int x = 0;
	        if((a & mask1) != 0)
	            x = x | mask1;
	       if((b & mask2) != 0)
	            x = x | mask2;
	       System.out.println(x);
	        t--;
	    }
	}
}
