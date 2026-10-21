/*
Redistributing Chocolates

Alice, Bob, and Charlie have X,Y and Z chocolates respectively.
Find whether you can redistribute the chocolates such that:
    Each person has at least one chocolate;
    No two people have same number of chocolates;
    No chocolate is left after redistribution.

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    The first and only line of each test case contains three space-separated integers X,Y, and Z — the number of chocolates Alice, Bob, and Charlie have initially.

Output Format
For each test case, output on a new line YES, if you can redistribute all the chocolates such that all the given conditions are met, and NO otherwise.
You may print each character in uppercase or lowercase. For example, NO, no, No and nO, are all considered identical.

Constraints
    1≤T≤1000
    1≤X,Y,Z≤100
    
Input:
4
1 2 3
1 1 1
2 2 2
2 1 1

Output
YES
NO
YES
NO
*/

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
		    int sum = 0;
		    for(int i=0; i<3; i++)
		        sum += sc.nextInt();
		    if(sum >= 6)
		        System.out.println("YES");
	        else 
	            System.out.println("NO");
		}
	}
}


    

