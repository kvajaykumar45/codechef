/*

PASSING MARKS
In a class of N students, a class test was held. The ith student scored Ai marks. It is also known that the scores of all students were distinct.
A student passes the test if their score is strictly greater than the passing mark. Given that exactly X students pass in the test, find the maximum value of the passing mark of the test.

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of multiple lines of input. 
        ◦ The first line of each test case contains two space-separated integers N and X — the number of students in the class and the number of students that passed in the test. 
        ◦ The next line contains N space-separated integers A1, A2, …, AN, where the ith integer denotes the marks of the ith student. 

Output Format
For each test case, output on a new line, the maximum value of the passing mark of the test.

Constraints
    • 1≤T≤100 
    • 1≤N≤100 
    • 1≤X≤N 
    • 1≤A[i]​≤100 
    • All elements of array A are distinct. 

Sample 1:

Input
3
2 2
5 1
4 1
5 1 7 4
4 3
15 70 100 31

Output
0
6
30
*/



//Java Solution:

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[n-x]-1);        }
    }
}


/*
Complexity
Arrays.sort(a); takes O(n log n) time.
Reading the array takes O(n).
Therefore:
Time: O(n log n)

Space: O(n) for the array itself.

*/



