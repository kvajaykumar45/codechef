/*

400M RACE
Alice, Bob, and Charlie participated in a 400-metre race.
The time taken by Alice, Bob, and Charlie to complete the race was X,Y, and Z seconds respectively. Note that X,Y, and Z are distinct.
Determine the person having the highest average speed in the race.

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of multiple lines of input. 
        ◦ The first line of each test case contains three space-separated integers X,Y, and Z — the time taken by Alice, Bob, and Charlie to complete the race. 

Output Format
For each test case, output on a new line:
    • ALICE, if Alice had the highest average speed. 
    • BOB, if Bob had the highest average speed. 
    • CHARLIE, if Charlie had the highest average speed. 
Note that you may print each character in uppercase or lowercase. For example, the strings BOB, bob, Bob, and BoB are all considered identical.

Constraints
    • 1≤T≤1000 
    • 1≤X,Y,Z≤100 
    • X,Y, and Z are distinct. 

Sample 1:
Input
3
1 2 8
4 100 1
7 3 5
Output 
ALICE
CHARLIE
BOB
      */      ​ 





//Java Solution 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            if(x<y)
            {
                if(x<z)
                    System.out.println("ALICE");
                else
                    System.out.println("CHARLIE");
            }
            else
            {
                if(y<z)
                    System.out.println("BOB");
                else
                    System.out.println("CHARLIE");
            }
        }
    }
}

/*

Complexity	Result
Time	O(T), wher T is the number of test cases, each test case is O(1)
Space	O(1)
            ​ 
*/
