/*
Append for OR - 1201

Chef has an array A of length N.
Chef wants to append a non-negative integer X to the array A such that the bitwise OR of the entire array becomes =Y i.e. (A1 ∣ A2 ∣ … ∣ AN ∣ X)=Y. (Here, ∣ denotes the bitwise OR operation)
Determine the minimum possible value of X. If no possible value of X exists, output −1.

Input Format
    • The first line contains a single integer T — the number of test cases. Then the test cases follow. 
    • The first line of each test case contains two integers N and Y — the size of the array A and final bitwise OR of the array A. 
    • The second line of each test case contains N space-separated integers A1,A2,…,AN denoting the array A. 

Output Format
For each test case, output the minimum possible value of X for which (A1 ∣ A2 ∣…∣ AN ∣ X)=Y holds.
If no such value exists, output −1.
Constraints
    • 1≤T≤10^5 
    • 1≤N≤10^5 
    • 0≤Ai<2^20 
    • 0≤Y<2^20 
    • Sum of N over all test cases does not exceed 2⋅10^5 

Sample 1:
Input
4
4 15
3 5 6 2
3 8
1 2 1
1 1
0
5 7
1 2 4 2 1

Output
8
-1
1
0

Explanation:
Test Case 1: (3 ∣ 5 ∣ 6 ∣ 2 ∣ X)=15 holds for the following values of X: {8,9,10,11,12,13,14,15}. The minimum among them is 8.
Test Case 2: It can be proven that no valid value of X exists.
Test Case 3: (0 ∣ X)=1 holds for only X=1.
*/
//Java Solution:

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int Y = sc.nextInt();
            int OR = 0;
            for (int i = 0; i < N; i++) {
                OR = OR | sc.nextInt();
            }
              if ((OR | Y) == Y) {
                int X = Y & ~OR;
               System.out.println(X);
            } else {
                System.out.println(-1);
            }
	T--;
        }
        sc.close();
    }
}
/*
Complexity	Value
Time		O(ΣN)
Space		O(1)
*/
