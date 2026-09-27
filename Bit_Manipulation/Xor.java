/*
Problem: XOR
You are given N binary strings of length 10, output the XOR of these strings.
Sample 1:
Input
3
1100101011
0111011001
1110101110
Output 348
*/

// Java Solution

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String result = sc.next();
		for(int i=1; i<t; i++)	{
		    String s = sc.next();
		    StringBuilder temp = new StringBuilder();
		    for(int j=0; j<10; j++)   {
		        if(result.charAt(j) == s.charAt(j))
		            temp.append('0');
		        else
		            temp.append('1');
		    }
		    result = temp.toString();		    
		}
		System.out.print(Integer.parseInt(result,2));
    }
}
