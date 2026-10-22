/*
Musical Chairs

There are N friends who decided to play the game of musical chairs one day.

Initially they decide a number K and with each passing round they remove exactly K chairs. Hence, in each round exactly K players are eliminated. The game stops when less than or exactly K players remain in the game.

Now, Chef wants to figure out for how many possible values of K there will be exactly one winner in the game

Input Format
    The first line contains T - the number of test cases. Then the test cases follow.
    The first line of each test case contain N - the number of friends in the game.

Output Format
For each test case, output in a single line a integer that denotes the number of values of K for which there will be exactly one winner.

Constraints
1 ≤ T ≤ 100
2 ≤ N ≤ 10^9

Input
3
2
3
4

Output
1
2
2



*/

//Source Code

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 1;
            int x = n - 1;

            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    count++;

                    if (i != x / i) {
                        count++;
                    }
                }
            }
            if (x > 1) {
                count++;
            }

            System.out.println(count);
        }
    }
}
