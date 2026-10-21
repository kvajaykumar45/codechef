/*
Ranklist Pages

Chef participated in a contest and got a rank XX.

Chef is trying to find his name in the ranklist but there are too many pages.

Each page consists of 25 participants. Chef wants to find the exact page number which contains his name.
Help Chef find the page number.

Input Format
    The first line of input will contain a single integer TT, denoting the number of test cases.
    Each test case consists of a single integer XX - denoting the rank of Chef.

Output Format
For each test case, output the page number of the ranklist containing Chef's name.

Constraints
1 ≤ T ≤ 1000
1 ≤ X ≤ 1000

Input
4
1
34
150
74


Output
1
2
6
3

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
		    int x = sc.nextInt();
		    int q = x/25;
		    int r = x%25;
		    if(r==0)
		        System.out.println(q);
		    else
		        System.out.println(q+1);
		    
		}

	}
}



