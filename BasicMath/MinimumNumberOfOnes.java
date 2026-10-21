/*


Minimum Number of Ones

Your teacher gave you an assignment — given an integer N, 
Construct a binary string B=b1b2b3…bN​ of length N such that: max(bi​,bi+1​)=1 for every i from 1 to N−1.

What is the minimum number of 1's such a binary string can contain?
ote: A binary string is a string consisting of only the digits 0 and 1

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case contains a single integer N — the length of binary string you'd like to construct.

Output Format
For each test case, output on a new line the minimum number of 1's required to complete the assignment.

Constraints
1≤T≤1000
2≤N≤1000

Input
6
6
8
2
3
5
100


Output
3
4
1
1
2
50

*/

//Source Code

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(n/2);
        }
    }
}


