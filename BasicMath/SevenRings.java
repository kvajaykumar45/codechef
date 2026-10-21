/*

7 Rings

In Chefland, a valid phone number consists of 55 digits with no leading zeros.
For example, 98765,10000,98765,10000, and 7102371023 are valid phone numbers while 04123,9231,04123,9231, and 872310872310 are not.

Chef went to a store and purchased NN items, where the cost of each item is XX.
Find whether the total bill is equivalent to a valid phone number.
Input Format

    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of two space-separated integers N and X — the number of items Chef bought and the cost per item.

Output Format

For each test case, output on a new line, YES, if the total bill is equivalent to a valid phone number and NO otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.
Constraints

1≤T≤100
1≤N,X≤1000

Input
4
25 785
402 11
100 100
333 333

Output
YES
NO
YES
NO

*/

//Source Code
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int num = n * x;
            int count = 0;
            while(num > 0)
            {
                num = num / 10;
                count++;
            }
            if(count == 5)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}




