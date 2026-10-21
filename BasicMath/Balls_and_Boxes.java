/*

Balls and Boxes

You have N balls and K boxes. You want to divide the N balls into K boxes such that:

    Each box contains ≥1 balls.
    No two boxes contain the same number of balls.

Determine if it is possible to do so.

Input Format
    The first line contains a single integer T — the number of test cases. Then the test cases follow.
    The first and only line of each test case contains two space-separated integers N and K — the number of balls and the number of boxes respectively.

Output Format
For each test case, output YES if it is possible to divide the N balls into K boxes such that the conditions are satisfied. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).
Constraints

1≤T≤10^5
1≤N≤10^9
1≤K≤10^4

Input
4
3 4
30 3
2 2
1 1

Output
NO
YES
NO
YES

*/

//Source Code

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n >= k * (k + 1) / 2)
                System.out.println("Yes");
            else
                System.out.println("No");

        }

    }
}




