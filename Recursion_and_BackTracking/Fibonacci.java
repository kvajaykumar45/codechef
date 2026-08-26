/*

​Fibonacci Series
Given an integer N, output the Nth term in the Fibonacci Series.
The Fibonacci Series is : 0 1 1 2 3 5 8...
​
Input Format
    • The only line contains a single integer N 
​
Output Format
    • Output the Nth term in the Fibonacci Series. 
​
Constraints
    • 1≤N≤100 
​
Sample 1:
Input 1
Output 0
​
Sample 2:
Input 2
Output 1
*/


//Java Solution
import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    static BigInteger dp[] = new BigInteger[101];
    static BigInteger fib(int n) {
        if(n==1)
        return BigInteger.ZERO;
        if(n==2)
        return BigInteger.ONE;
        if(dp[n] != null)
            return dp[n];
        dp[n] = fib(n-1).add(fib(n-2));
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
        scanner.close();
    }
}

/*
Complexity	Result
Time		O(N)
Space		O(N)
Technique	Recursion + Memoization
*/
