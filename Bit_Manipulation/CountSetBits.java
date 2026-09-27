/*

            ​ Problem: Count of set bits
Task: Write a program that takes an input integer N and prints the count of the set bits present in the number.
Input Format The first line of input will contain a single integer N, denoting the number. 
Output Format Output on a single line, the number of set bits in N.

Constraints 1≤N≤1000000000 

Sample 1:
Input 256
Output 1
Explanation:
Binary representation of 256 is: 100000000 Number of set bits = 1

Sample 2:
Input 15
Output 4

Explanation:
Binary representation of 15 is: 1111 Number of set bits = 4
*/
//Java Solution:
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main (String[] args) throws java.lang.Exception 	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int bits = 0;
	while(n>0) {
	    if((n&1) != 0)
	        bits++;
	    n = n >> 1;
	}
	System.out.println(bits);
	}
}
/*
Complexity	Answer
Time		O(log N)
Space		O(1)
*/
