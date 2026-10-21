/*
Test Averages

Chef has scored A,B and C marks in 3 different subjects respectively.

Chef will fail if the average score of any two subjects is less than 35. Determine whether Chef will pass or fail.
Input Format

    First line will contain T, number of test cases. Then the test cases follow.
    Each test case contains of a single line of input, three integers A,B,C, denoting the Chef's score in the three subjects.

Output Format

For each test case, if Chef will pass, print PASS, otherwise print FAIL.

You may print each character of the string in uppercase or lowercase (for example, the strings pass, Pass, pAss, and PASS will all be treated as identical).
Constraints

1≤T≤1000
0≤A,B,C≤100

Input
4
23 47 52
28 36 80
0 100 0
35 35 35


Output
Pass
Fail
Fail
Pass

*/

//Source Code
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if(a+b >= 70 && b+c>=70 && a+c>=70)
                System.out.println("Pass");
            else 
                System.out.println("Fail");
        }
    }
}


