/*
​ YOUR NAME IS MINE

In an attempt to control the rise in population, Archer was asked to come up with a plan. This time he is targeting marriages. Archer, being as intelligent as he is, came up with the following plan: A man with name M is allowed to marry a woman with name W, only if M is a subsequence of W or W is a subsequence of M. A is said to be a subsequence of B, if A can be obtained by deleting some elements of B without changing the order of the remaining elements.
Your task is to determine whether a couple is allowed to marry or not, according to Archer's rule.
​
Input
The first line contains an integer T, the number of test cases. T test cases follow. Each test case contains two space separated strings M and W.
​
Output
For each test case print "YES" if they are allowed to marry, else print "NO". (quotes are meant for clarity, please don't print them)
​
Constraints
    • 1 ≤ T ≤ 100 
    • 1 ≤ |M|, |W| ≤ 25000 (|A| denotes the length of the string A.) 
    • All names consist of lowercase English letters only. 

Input
3
john johanna
ira ira
kayla jayla

Output
YES
YES
NO
*/

//Solution
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
		    String M = sc.next();
		    String W = sc.next();
		    String small, large;
		    if(W.length() > M.length())
		    {
		        small = M;
		        large = W;
		    }
		    else
		    {
		        small = W;
		        large = M;
		    }
		    int i=0;
		    int j=0;
		    while(i<small.length() && j<large.length())
		    {
		        if(small.charAt(i) == large.charAt(j))
		            i++;
		        j++;
		    }
		    if(i == small.length())
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
/*
This runs in O(n) time
*/

