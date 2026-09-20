/*
MAXIMUM SUBARRAY 

Given two arrays A and B of sizes N and M respectively. You can apply the following operation until the array B is non-empty:
    • Choose either the first or the last element of array B. 
    • Insert the chosen element to either the front or the back of array A. 
    • Delete the chosen element from array B. 

For example, let A=[9,7] and B=[1,3,2]. In one operation, we can choose either X=1 or X=2 (first or last element of array B). We can insert X in array A and make it either A=[X,9,7] or A=[9,7,X]. The chosen X is deleted from array B. Thus, it will become either B=[3,2] (when chosen X is 1) or B=[1,3] (when chosen X is 2).

Find the maximum sum of any subarray of the array A that you can achieve after performing exactly M operations.

Note: A subarray of an array is formed by deleting some (possibly zero) elements from the beginning of the array and some (possible zero) elements from the end of the array. A subarray can be empty as well.

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of 4 lines of input. 
        ◦ The first line of each test contains a single integer N, the size of array A. 
        ◦ The next line contains N space-separated integers, denoting elements of array A. 
        ◦ The third line of each test contains a single integer M, the size of array B. 
        ◦ The next line contains M space-separated integers, denoting elements of array B. 

Output Format
For each test case, output on a new line the maximum sum of any subarray of the array A that you can achieve after performing exactly M operations.
Constraints
    • 1 ≤ T ≤ 10 
    • 1 ≤ N ≤ 10^5 
    • 1 ≤ M ≤ 10^5 
    • −10^8 ≤ Ai,Bi ≤ 10^8 

Input
3
5
3 26 -79 72 23
2
66 44
1
81
1
-97
5
10 -5 14 -20 4
3
-10 5 -2

Output
205
81
24
*/
//Solution

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    static long kandane(int a[], int n)
    {
        long currentsum = 0;
        long maxsum = Long.MIN_VALUE;
        
        for(int x: a)
        {
            currentsum = Math.max(x, currentsum+x);
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
    
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
        
        int m = sc.nextInt();
        long bsum = 0;
        for(int i=0; i<m; i++)
        {
            int x = sc.nextInt();
            if(x > 0)
                bsum += x;
        }
        long maxsum = kandane(a, n);
        
        long sum = 0;
        long maxprefix = 0;
        for(int i=0; i<n; i++)
        {
            sum = sum + a[i];
            maxprefix = Math.max(maxprefix, sum);
        }
        
        sum = 0;
        long maxsuffix = 0;
        for(int i=n-1; i>=0; i--)
        {
            sum = sum + a[i];
            maxsuffix = Math.max(maxsuffix, sum);
        }

        System.out.println(Math.max( maxsum, Math.max(maxprefix+bsum, maxsuffix+bsum))); 
        }
	}
}

/*
Time Complexity
You make these passes:
    1. Read A → O(N)
    2. Kadane's algorithm → O(N)
    3. Maximum prefix → O(N)
    4. Maximum suffix → O(N)
    5. Read B and calculate positive sum → O(M)

Therefore: Time = O(N + M)
The constant number of passes over A doesn't change the Big-O complexity.

Space Complexity
You store:
int[] a = new int[n];
which requires O(N) space.

For B, you don't store the array; you process each element immediately:
int x = sc.nextInt();
if (x > 0)
    bsum += x;
so B requires O(1) extra space.

Therefore: Space = O(N)

Final
Time  : O(N + M)
Space : O(N)
Your algorithm itself uses O(1) auxiliary space, excluding the input array A.
*/

