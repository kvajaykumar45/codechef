/*
​ CONVERT DECIMAL TO BINARY USING RECURSION

​ Problem Statement
Given a non-negative decimal integer N, convert it into its equivalent binary representation using recursion. The binary representation should be printed from the most significant bit to the least significant bit.

​ Input Format
    • The first line contains an integer N, representing the decimal number.
    
Output Format
    • Print the binary representation of N.

Sample Input
13

​ Sample Output
1101
​
 Explanation
For 13:
13 ÷ 2 → remainder 1
 6 ÷ 2 → remainder 0
 3 ÷ 2 → remainder 1
 1 ÷ 2 → remainder 1

Reading the remainders in reverse order gives:
1101
​ Constraints
    • 0 ≤ N ≤ 10^9
    • The solution must use recursion.
    • N is an integer.
    
*/
// Solution

import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		decimalToBinary(n, sb);
		System.out.println(sb);
	}
	static void decimalToBinary(int n, StringBuilder sb)
	{
		if(n==0)
		{
			sb.append(0);
			return;
		}
		else if(n==1)
		{
			sb.append(1);
			return;
		}
		else
			decimalToBinary(n/2, sb);
		sb.append(n%2);
	}
}

/*

​Complexity of your final version
Aspect				Complexity
Recurs-ive calls		O(log n)
StringBuilder.append()		O(1) amortized
Time				O(log n)
Recursion stack		O(log n)
StringBuilder storage		O(log n)
Total auxiliary space		O(log n)

Solution is efficient: O(log n) time and O(log n) space.
*/


