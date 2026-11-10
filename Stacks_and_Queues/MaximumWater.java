/*
MAXIMUM WATER IN A SECTION
Chef owns a swimming pool with width N meters which contains N continuous walls with height hi (possible zero) and width 1 meter each.
When it rains heavily, water is stored in the swimming pool in the form of sections. Chef is busy calling his friends for a party. So, you need to determine the maximum water stored in a section among all the sections after a heavy rain.

Input Format
    • First line will contain T, number of testcases. Then the testcases follow. 
    • First line of each testcase contains an integer N - number of walls A. 
    • Second line contains N space separated integers h1,h2,.....,hN 

Output Format
For each testcase, output one integer in a single line - Maximum water stored among all sections.

Constraints
    • 1≤T≤10^3 
    • 2≤N≤10^5 
    • 0≤hi≤10^6 
Sum of N over all test cases will not exceed 10^5

Input
2
4
5 0 2 6
6
3 1 4 0 3 5 

Output
8
5
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
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++)
		        a[i] = sc.nextInt();
		    long maxwater = Integer.MIN_VALUE;
		    int boundary = a[0];
		    long watersum = 0;
		    
		    for(int i=1; i<n; i++)
		    {
		        if(boundary > a[i] )
		        {
		            watersum += boundary-a[i];
		        }
		        else 
		        {
		            if(watersum > maxwater)
		                maxwater = watersum;
		            boundary = a[i];
		            watersum = 0;
		        }
		    }
		    watersum = 0;
		    boundary = a[n-1];
		    for(int i=n-2; i>=0 ; i--)
		    {
		        if(boundary > a[i])
		            watersum += boundary-a[i];
		        else 
		        {
		            if(watersum > maxwater)
		                maxwater = watersum;
		            boundary = a[i];
		            watersum = 0;
		        }
		    }
		    
		    System.out.println(maxwater);
		}
	}
}
/*
Complexity
    • Time: O(N) per test case.
    • Auxiliary space: O(1).
    • Array storage: O(N).
    
    */
