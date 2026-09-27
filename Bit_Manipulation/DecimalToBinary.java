/*

Decimal to binary
Write a program to input an integer N in decimal form, convert it into binary, and then print the result.
Sample 1:
Input 28
Output 11100

Sample 2:
Input 21
Output 10101
*/

//Java Solution:
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
	public static void main (String[] args) throws java.lang.Exception 	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String b = "";
		while(n>0) {
		    int r = n % 2;
		    b = r + b;
		    n = n / 2;
		}
		System.out.println(b);
		sc.close();
	}
}

/*
Time Complexity: O(log N)
Each iteration divides n by 2:
N → N/2 → N/4 → N/8 → ...
The number of iterations is approximately log₂(N).
For example, N = 28 takes 5 iterations. So: Time = O(log N)
            ​ 
Space Complexity: O(log2 N)
The binary representation of N contains about log₂(N) + 1 bits.
We store those bits in the String b.
So: Space = O(log N)
*/
