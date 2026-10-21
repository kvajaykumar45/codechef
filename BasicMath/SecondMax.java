/*
Second Max of Three Numbers
Problem Statement

Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
Input

    First line contains the number of triples, N.
    The next N lines which follow each have three space separated integers.

Output

For each of the N triples, output one new line which contains the second-maximum integer among the three.
Constraints

    1 ≤ N ≤ 6
    1 ≤ every integer ≤ 10000
    The three integers in a single triplet are all distinct. That is, no two of them are equal. 
    
Input
3
1 2 3
10 15 5
100 999 500

Output
2
10
500


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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a > b && a < c) || (a > c && a < b))
                System.out.println(a);
            else if ((b > a && b < c) || (b > c && b < a))
                System.out.println(b);
            else
                System.out.println(c);
        }

    }
}
