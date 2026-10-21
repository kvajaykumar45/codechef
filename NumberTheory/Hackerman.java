/*


Hackerman

Hackerman wants to know who is the better player between Bob and Alice with the help of a game.
The game proceeds as follows:
    First, Alice throws a die and gets the number A
    Then, Bob throws a die and gets the number B
    Alice wins the game if the sum on the dice is a prime number; and Bob wins otherwise.
Given A and B, determine who wins the game.

Input Format
    The first line of input will contain a single integer TT, denoting the number of test cases.
    The first and only line of each test case contains two space-separated integers AA and BB.

Output Format
For each test case, output on a new line the winner of the game: Alice or Bob.
Each letter of the output may be printed in either uppercase or lowercase, i.e, Alice, ALICE, AlIce and aLIcE will all be considered equivalent.

Constraints
	1≤T≤36
	1≤A≤6
	1≤B≤6

Input
3
2 1
1 1
2 2

Output
Alice
Alice
Bob
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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = a+b;
		    if(isPrime(c))
		        System.out.println("Alice");
		    else
		        System.out.println("Bob");
		}
	}
	public static boolean isPrime(int n)
	{
	    for(int i=2; i<=n/2; i++)
	    {
	        if(n%i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}

