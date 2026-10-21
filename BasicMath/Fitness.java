/*Fitness

Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is XX km away from his home.

If his office is open on 55 days in a week, find the number of kilometers Chef travels through office trips in a week.
Input Format

    First line will contain TT, number of test cases. Then the test cases follow.
    Each test case contains of a single line consisting of single integer XX.

Output Format

For each test case, output the number of kilometers Chef travels through office trips in a week.
Constraints

1≤T≤10
1≤X≤10

Input
4
1
3
7
10

Output
10
30
70
100
*/
//Source Code
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            System.out.println(5 * 2 * x);
            
        }
    }
}



