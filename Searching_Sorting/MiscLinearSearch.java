
/*
MISCELLANEOUS LINEAR SEARCH
Given n pairs of integers, write a program to check if there exists any pair that contains both integers a and b in any order.

Input Format
    • The first line contains an integer n, the number of pairs. 
    • The next n lines each contain two space-separated integers representing a pair. 
    • The last line contains two integers a and b. 

Output Format
    • Print "Yes" if there exists any pair that contains both integers a and b in any order. 
    • Print "No" if no such pair exists. 

Sample 1:
Input
4
2 3
4 5
3 5
1 7
5 3
Output Yes

Sample 2:
Input
4
2 3
4 5
3 5
1 7
5 9
Output No
*/

//Java Solution:
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main (String[] args) throws java.lang.Exception 	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		for(int i=0; i<n; i++) 	{
		    arr[i][0] = sc.nextInt();
		    arr[i][1] = sc.nextInt();
		}
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean x1, x2;
        int i;
        for(i=0; i<n; i++)  {
            x1 = ( arr[i][0] == a || arr[i][0] == b );
            x2 = ( arr[i][1] == a || arr[i][1] == b );
            
            if (x1 & x2) {
                System.out.println("Yes");
                break;
            }
        }
        if (i == n)
            System.out.println("No");
	}
}

/*
Complexity
Since we may have to check all n pairs:
    • Best case: O(1) — matching pair is first. 
    • Worst case: O(n) — matching pair is last or doesn't exist. 
    • Average case: O(n). 
    • Space: O(n) in the above program because we store all pairs.
    
    */
