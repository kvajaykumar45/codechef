/*

Euclidean GCD Algorithm
You are required to write a recursive function to find the Greatest Common Divisor (GCD) of two non-negative integers a and b using the Euclidean Algorithm.
The Euclidean Algorithm is based on the following recurrence relation:
Given two non-negative integers a and b, the GCD of a and b is defined by the following properties:
    1. Base Case:
        ◦ If (b = 0), then GCD(a, b) = a. 
    2. Recursive Case:
        ◦ If (b != 0), then GCD(a, b) = GCD(b, a % b). 

Input Format
    • The only line of input contains two space separated non-negative integers a and b. 
​
Output Format
    • Output the GCD of the two numbers. 
​
Constraints
    • 0≤a,b≤1000000000 
*/

// Java Solution
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = gcd(a,b);
		System.out.println(g);
	}
	public static int gcd(int a, int b) {
	    if(b == 0)
	        return a;
	    else
	        return gcd(b, a%b);
	} }

/*
Time Complexity: O(log(min(a, b)))
For example:
gcd(48, 18)

gcd(48,18)
→ gcd(18,12)
→ gcd(12,6)
→ gcd(6,0)
→ 6
The number of recursive calls is logarithmic.
Space Complexity: O(log(min(a, b)))
*/

