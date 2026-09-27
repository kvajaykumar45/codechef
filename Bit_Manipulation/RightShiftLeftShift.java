


/*
Left shift, Right shift

Left shift
Left-shifting a binary number involves moving its bits to the left by a specified number of positions.
The syntax is:
        result = original_value << num_positions
         11 << 2 = 1100 (Binary representation)
In binary representation, a left shift operation is equivalent to multiplying a number by 2 raised to the power of the shift amount.
Example of left shifting: 
3 << 2 = 12 (Decimal representation) 
3 * (2 2 ) = 12

Right shift
Right shifting a binary number involves moving its bits to the right by a specified number of positions. The syntax is:
        result = original_value >> num_positions
        1100 >> 2 = 11 (Binary representation)
In binary representation, a right shift operation is equivalent to dividing a number by 2 raised to the power of the shift amount.
Example of right shifting: 
12 >> 2 = 3 (Decimal representation) 
12 / (2^2 ) = 3

Task
    • Input three integers N, L, and, R from user. 
    • First, right-shift N by R positions, and then left-shift it by L positions 
    • Print the final result. 

Sample 1:
Input
7 2 2
Output 4

Explanation:
    • Given a number 7 (binary representation = 111) 
    • Right shifting 7 by 2 = 7 >> 2 = 7 / (2 * 2) = 1 
    • Left shifting 1 by 2 = 1 << 2 = 1 * (2 * 2) = 4 

*/

//Java Solution:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		N = N >> R;
		N = N << L;
		System.out.println(N);
		sc.close();
	}
}

