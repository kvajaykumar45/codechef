/*
Add smallest prime factor

Chef's current score is X. Each second, Chef will find the smallest prime factor of his score and add it to his score.
Determine the minimum time in seconds, after which his score becomes ≥Y.

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of a single line containing two integers X and Y, the initial and required score of Chef.

Output Format
For each test case, output the minimum time in seconds, after which Chef's score becomes ≥Y.

Constraints
    1 ≤ T ≤ 1000
    2 ≤ X ≤ 10
    20 ≤ Y ≤ 10^9

Input
4
2 23
9 20
5 100
6 89

Output
11
5
46
42
*/

//Source Code

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

class Codechef {
    static int smallestPrimeFactor(long x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return i;
            }
        }
        return (int) x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long time = 0;

            if (x % 2 != 0) {
                x += smallestPrimeFactor(x);
                time++;
            }
            if (x < y) {
                time += (y - x + 1) / 2;
            }
            System.out.println(time);
        }
        sc.close();
    }
}

