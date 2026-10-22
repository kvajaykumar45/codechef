


/*
Existence

Chef has two variables X and Y. He wants to find out whether the variables satisfy the equation: X^4+4⋅Y^2=4⋅X^2⋅Y

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of two integers X and Y, as mentioned in statement.

Output Format
For each test case, output YES if the variables X and Y satisfy the given equation, NO otherwise.

You may print each character in uppercase or lowercase. For example, Yes, YES, yes, and YeS are all considered the same.

Constraints
1≤T≤1000
1≤X≤10^9
1≤Y≤10^18

Input
5
2 2
4 4
3 6
8 32
200000000 20000000000000000

Output
YES
NO
NO
YES
YES
Explanation
We need to check whether: X⁴ + 4Y² = 4X²Y

Let's simplify the equation mathematically.

Step 1: Move everything to one side. X⁴ - 4X²Y + 4Y² = 0

Step 2: This is a perfect square: (X² - 2Y)² = 0

Step 3: A square equals zero only when the expression inside it is zero.

Therefore: X² - 2Y = 0

So the condition becomes: X² = 2Y
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
		    long x = sc.nextLong();
		    long y = sc.nextLong();
		    if(x*x == 2*y)
		        System.out.println("YES");
		    else 
		        System.out.println("NO");
		}

	}
}



