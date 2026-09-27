

/*
Finding least significant, most significant bit

Finding Least significant bit
The least significant bit (LSB) of a binary number is the rightmost bit. You can calculate it using the bitwise AND operation with 1.
   lsb = (num & 1)

Finding Most significant bit
To find the most significant bit (MSB) of an integer, you can iterate through its binary representation and identify the leftmost non-zero bit


Task
    • Write a program to input an integer N. 
    • Print the position of the most significant bit, and print the least significant bit. 
Sample 1:
Input 15
Output 3 1

Sample 2:
Input 24
Output 4 0
*/
//Java Solution:
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
	public static void main (String[] args) throws java.lang.Exception 	{
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();
		int lsb = n & 1; 
		int msb = 0;
		while(n>1) {
		    n = n >> 1;
		    msb++;
		} System.out.println(msb + " " + lsb);
	}
}

/*
Complexity	Value
Time		O(log N)
Space		O(1)
*/

