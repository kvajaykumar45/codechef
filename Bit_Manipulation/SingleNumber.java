

/*
Bit Manipulation - Single Number
You are given an array A1,A2,…,AN of length N. Each distinct element appears twice except for one. Find that single one.

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • The first line of each test case contains an integer N - the length of the array A. 
    • The second line of each test case contains N space-separated integers A1,A2,…,AN. 

Output Format
For each test case, output on a new line the single one.
            ​ 
Constraints
    • 1≤T≤100 
    • 1≤N≤10^5 
    • 1≤Ai≤10^9 
    • The sum of N over all test cases won't exceed 2⋅105. 

Sample 1:
Input
4
1
5
5
2 5 2 10 10
5
1 1 10 10 15
5
6 8 10 6 8

Output
5
5
15
10

Explanation:
Test case 1: Distinct elements will be 5. The single element will be 5.
Test case 2: Distinct elements will be 2, 5, 10. The single element will be 5.
Test case 3: Distinct elements will be 1, 10, 15. The single element will be 15.
*/

//Java Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
	public static void main (String[] args) throws java.lang.Exception 	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
		    int result = 0;
		    for(int i=0; i<n; i++)
		    {
		        result ^= sc.nextInt();
		    }
		    System.out.println(result);
            t--;
        }
   }
}


/*
Complexity	Answer
Time		O(T × n) if each test has n elements
Space		O(1)
*/



