/*
STICKS
	Chef and his little brother are playing with sticks. They have total N sticks. Length of i-th stick is Ai. Chef asks his brother to choose any four sticks and to make a rectangle with those sticks its sides. Chef warns his brother to not to break any of the sticks, he has to use sticks as a whole. Also, he wants that the rectangle formed should have the maximum possible area among all the rectangles that Chef's brother can make. 
	Chef's little brother takes this challenge up and overcomes it. Can you also do so? That is, you have to tell whether it is even possible to create a rectangle? If yes, then you have to tell the maximum possible area of rectangle. 
Input
The first line contains a single integer T denoting the number of test-cases. T test cases follow.
The first line of each test case contains a single integer N denoting the number of sticks.
The second line of each test case contains N space-separated integers A1, A2, ..., AN denoting the lengths of sticks.
Output
For each test case, output a single line containing an integer representing the maximum possible area for rectangle or -1 if it's impossible to form any rectangle using the available sticks.
Constraints
    • 1 ≤ T ≤ 100 
    • 1 ≤ N ≤ 10^3 
    • 1 ≤ sum of N's over all test-cases in a single test file ≤ 10^3 
    • 1 ≤ Ai ≤ 10^3 
Sample 1:
Input
2
5
1 2 3 1 2
4
1 2 2 3
Output 
2
-1
Explanation:
Example case 1. Chef's brother can choose sticks of lengths 1, 2, 1, 2. He can create a rectangle with area 1 * 2 = 2.
Example case 2. It's impossible to choose 4 sticks so that they form a rectangle.
*/

//Java Solution:
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
	public static void main (String[] args) throws java.lang.Exception 	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t > 0)
	    {
	        int n = sc.nextInt();
	        int freq[] = new int[1001];
	        for(int i=0; i<n; i++)
	        {
	            int x = sc.nextInt();
	            freq[x]++;
	        }
	        int side1 = -1;
	        int side2 = -1;
	        for(int i=1000; i>=1; i--)
	        {
	            if(freq[i] >= 2)
	            {
	                if(side1 == -1)
	                {
	                    side1 = i;
	                    if(freq[i] >= 4)
	                    {
	                        side2 = i;
	                        break;
	                    }
	                }
	                else
	                {
	                    side2 = i;
	                    break;
	                }
                }   
	        }
	        if(side2 == -1)
	            System.out.println(-1);
	        else
	            System.out.println(side1 * side2);
	        t--;
	    } } }
	    
/*
Time  = O(N + 1000) ≈ O(N)
Space = O(1000)     ≈ O(1)
*/
