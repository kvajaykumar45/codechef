/*
Apples and oranges

Rushitote went to a programming contest to distribute apples and oranges to the contestants.
He has NN apples and MM oranges, which need to be divided equally amongst the contestants. Find the maximum possible number of contestants such that:
    Every contestant gets an equal number of apples; and
    Every contestant gets an equal number of oranges.
Note that every fruit with Rushitote must be distributed, there cannot be any left over.
For example, 2 apples and 4 oranges can be distributed equally to two contestants, where each one receives 1 apple and 2 oranges.
However, 2 apples and 5 oranges can only be distributed equally to one contestant.

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    The first and only line of each test case contains two space-separated integers N and M — the number of apples and oranges, respectively.

Output Format
For each test case, output on a new line the answer: the maximum number of contestants such that everyone receives an equal number of apples and an equal number of oranges.

Constraints
1≤T≤1000
1≤N,M≤10^9

Input
3
1 5
2 4
4 6

Output
1
2
2

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
            int m = sc.nextInt();

            while (m != 0)
            {
                int r = n % m;
                n = m;
                m = r;
            }
            System.out.println(n);
        }
    }
}
