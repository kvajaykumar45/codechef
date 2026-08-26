/*
​ CHEF COIN FLIPPING GAME
The chef is playing a game with a coin that has a 1 printed on one side and a 2 printed on the other. He wants to find out how many different ways he can achieve a sum of S by flipping the coin any number of times.
Help Chef determine the total number of ways to get a sum of S using any number of flips of the coin.
​
Input Format
The input consists of a single integer S.
​
Output Format
Output a single integer representing the number of ways to achieve the sum S.
​
Constraints
    • 1≤S≤20 
*/

//Java Solution

import java.util.Scanner;

class Codechef {
    public static int countWays(int S) {
        if(S == 0)
            return 1;
        if(S < 0)
            return 0;
        return countWays(S-1) + countWays(S-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        System.out.println(countWays(S));
    }
}

/*

Time Complexity: O(2^S)
At every call, we make two recursive calls:
      countWays(S)
       /       \
 S - 1          S - 2
This creates a recursion tree with exponentially many calls.
So the time complexity is approximately:
O(2^S)


Space Complexity: O(S)
Although there are many calls, they don't all exist in memory simultaneously.
The maximum depth of the recursion is S:
countWays(S)
   ↓
countWays(S-1)
   ↓
countWays(S-2)
   ↓
...
   ↓
countWays(0)
Therefore, the recursion stack requires:
O(S) space

​
Complexity	Value
Time		O(2^S)
Space		O(S)

For this problem, since S ≤ 20, the simple recursive solution is perfectly fine.
*/
