/*
Bit Manipulation - Reverse Bits
You are given an unsigned 32-bit integer X. Find the integer formed after reversing the 32-bit binary string of X.
            ​ Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • The first and only line of each test case contains 32-bit integer X. 
            ​ Output Format
For each test case, output on a new line, the number formed after reversing the 32-bit binary string 

Constraints
    • 1≤T≤10^5 
    • 0≤X<2^32 

Sample 1:

Input
3
3
16
43261596

Output
3221225472
134217728
964176192

Algorithm:
1. Extract last bit     → n & 1
2. Add it to result     → result << 1 | bit
3. Remove last bit      → n >>> 1
4. Repeat 32 times
*/
//Java Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    long n = sc.nextLong();
		    long result = 0;
		    for(int i = 0; i<32; i++)
		    {
		        long bit = n & 1L;
		        result = result << 1L;
		        result = result | bit;
		        n = n >>> 1L;
		    }
		    System.out.println(result);
		    t--;
		}
        sc.close();
	}
}
/*
Time Complexity: O(1) 
Space Complexity: O(1)
*/
