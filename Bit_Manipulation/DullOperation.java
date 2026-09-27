/*

Dull Operation - 1490
On Halloween, Chef is in a somber mood.
Chef has an odd integer N that he has to decode.
To do so, Chef would like to find a pair of integers x and y (0≤x, y<230) such that: (x∣y)⋅(x⊕y)=N
Help Chef find any such pair!
It can be proved that a valid pair always exists.
Here, ∣ represents the bitwise OR operation, and ⊕ represents the bitwise XOR operation.

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • The first and only line of each test case contains a single odd integer N. 

Output Format
For each test case, output on a new line two space-separated integers x and y such that 0≤x,y<2^30, and (x∣y)⋅(x⊕y)=N
If multiple solutions exist, you may print any of them. 
It can be proved that a solution always exists under the given constraints.

Constraints
    • 1≤T≤1000 
    • 1≤N≤10^9 
    • N is odd. 
Sample 1:
Input
4
1
49
21
35

Output
1 0
3 4
7 4
7 2

Explanation:
Test case 1: We have N=1. Choose x=1 and y=0, which gives us (x∣y)=1 and (x⊕y)=1.
1⋅1=1, so this is a valid solution.
Test case 2: We have N=49. Choose x=3 and y=4, which gives us (x∣y)=7 and (x⊕y)=7.
7⋅7=49, so this is a valid solution.
Test case 3: Here, N=21. Choose x=7 and y=4, which gives us (x∣y)=7 and (x⊕y)=3.
7⋅3=21, so this is a valid solution.
Test case 4: Here, N=35. Choose x=7 and y=2, which gives us (x∣y)=7 and (x⊕y)=5.
7⋅5=35, so this is a valid solution.
*/
/*
Python Solution:
T = int(input())
for _ in range(T):
    N = int(input())
    print(N, N - 1)
*/

//Java Solution:
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            System.out.println(N + " " + (N - 1));
        }
        sc.close();
    }
}

/*
The time complexity is O(T), where T is the number of test cases.
For each test case, we only perform:
int N = sc.nextInt();
System.out.println(N + " " + (N – 1));
These are constant-time operations, so each test case takes O(1).
Therefore: T X O(1) = O(T)
Space complexity
We don't store the test cases. We only use a few variables:
O(1)
So the final complexity is:
Time: O(T)
Space: O(1)
*/

