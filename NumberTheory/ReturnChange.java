/*

Return the Change

In Chefland, denominations less than rupees 10 have stopped and now rupees 10 is the smallest denomination.

Suppose Chef goes to buy some item with cost not a multiple of 10, then, he will be charged the cost that is the nearest multiple of 10.
If the cost is equally distant from two nearest multiples of 10, then the cost is rounded up.

For example, 35,38,40,44 are all rounded to 40.

Chef purchased an item having cost X (X≤100) and gave a bill of rupees 100. How much amount will he get back?

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of a single integer X, the cost of the item.

Output Format
For each test case, output the amount returned to Chef.

Constraints
1≤T≤100
1≤X≤100

Input
4
35
54
80
12

Output
60
50
20
90
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
		    int r = x % 10;
		    if(r >= 5)
		        System.out.println(100-(x+10-r));
	        else
	            System.out.println(100-(x-r));
		}

	}
}

