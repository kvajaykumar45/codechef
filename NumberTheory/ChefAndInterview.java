/*
Chef and Interview

Chef wants to hire a new assistant. He published an advertisement regarding that in a newspaper. After seeing the advertisement, many candidates have applied for the job. Now chef wants to shortlist people for the interviews, so he gave all of them one problem which they must solve in order to get shortlisted.

The problem was : For a given positive integer N, what is the maximum sum of distinct numbers such that the Least Common Multiple of all these numbers is N.

Your friend Rupsa also applied for the job, but was unable to solve this problem and hence you've decided to help her out by writing a code for solving this problem.

Input
The first line of the input contains an integer T denoting the number of test cases.
Each test case contains a single integer N.

Output
For each test case, output a single line containing an integer corresponding to the answer for that test case.

Constraints
    1 ≤ T ≤ 1000
    1 ≤ N ≤ 10^9

Subtask 1 (30 points):
    1 ≤ T ≤ 100
    1 ≤ N ≤ 10^5

Subtask 2 (70 points):
    original constraints

Input
2
1
2

Output
1
3
*/

//Source Code

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long sum = 0;

            for (long i = 1; i <= n / i; i++) {
                if (n % i == 0) {
                    sum += i;

                    if (i != n / i) {
                        sum += n / i;
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
