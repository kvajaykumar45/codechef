
/*

Integers that sum to the same value

Alice has a positive integer N. She is wondering how many ordered pairs of positive integers (i,j) exist such that i+j=N.

Help Alice figure out the answer.

Note that since the pairs are ordered, (1,2) and (2,1) are considered different.
Note that 0 is not considered to be a positive integer.

Input Format
The first and only line of input contains a single integer NN.

Output Format
Print a single integer, the number of ordered pairs of positive integers (i,j) such that i+j=N.

Constraints
1≤N≤100

Input
1

Output
0
*/

//Source Code

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n-1));
    }
}



