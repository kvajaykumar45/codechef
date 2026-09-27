/*
            ​ N BUTTONS 1 BULB
Kulyash stays in room that has a single bulb and N buttons. The bulb is initially on.
The initial states of the buttons are stored in a binary string S of length N — if Si is 0, the i-th button is off, and if Si is 1, the i-th button is on. If Kulyash toggles any single button then the state of the bulb reverses i.e. the bulb lights up if it was off and vice versa.
Kulyash has toggled some buttons and the final states of the buttons are stored in another binary string R of length N. He asks you to determine the final state of the bulb.
            ​ Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of three lines of input. 
        ◦ The first line of each test case contains an integer N — the number of buttons. 
        ◦ The second line of each test case contains a binary string S — the initial states of the buttons. 
        ◦ The third line of each test case contains a binary string R — the final states of the buttons. 
Output Format
For each test case, output on a new line the final state of the bulb (0 for off and 1 for on).
            ​ Constraints
    • 1 ≤ T ≤ 100 
    • 1 ≤ N ≤ 100 
    • S and R are binary strings, i.e, contain only the characters 0 and 1. 

Input
2
3
000
001
2
00
11

Output
0 1 
*/


//Java Solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String r = scanner.next();
            int toggles = 0;           
            for(int i=0; i < s.length(); i++)
            {
                    if(s.charAt(i) != r.charAt(i))
                        toggles++;
            }
            if((toggles & 1) == 1)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
            ​ 
            ​ 
/*
Time and space complexity
For each test case:
    • Time: O(N) 
    • Space: O(1) extra space
    */
//Another Solution

            int bulb = 1;           
            for(int i=0; i < s.length(); i++)
            {
                    if(s.charAt(i) != r.charAt(i))
                        bulb = bulb ^ 1;
            }
            System.out.println(bulb);

