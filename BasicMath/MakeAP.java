/**
Make AP

Chef is given two integers A and C such that A≤C.

Chef wants to find whether there exists any integer B such that A,B, and C are in arithmetic progression.
Input Format

    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of two space-separated integers A and C, the given integers.

Output Format

For each test case, output −1 if there exists no integer B such that A,B, and C are in arithmetic progression. Else, output the value of B.
Constraints

    1≤T≤60
    1≤A≤C≤10


Input
4
3 5
6 6
2 7
1 9

Output
4
6
-1
5


*/
//Source Code

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            int b=0;
            for( b=1; b<=10; b++)
            {
                if(b-a == c-b)
                {
                    System.out.println(b);
                    break;
                }
                
            }
            if(b==11)
                System.out.println(-1);
        }
    }
}

