/*
​ Factorial
​
Task
Given an integer N, calculate and output the factorial of a N.
Factorial of an integer N is the product of first N natural numbers.
Recursive equation for Factorial:
Factorial(n)=N∗Factorial(n−1), Factorial(0)=1, Factorial(1)=1
​
Input Format
    • Input contains a single integer N 
​
Output Format
Output the Factorial of N
​
 Constraints
    • 1≤N≤10 
​
 Sample 1:
Input
5
Output
120
​
Explanation:
1×2×3×4×5=120
​
Sample 2:
Input
0
Output
1
​
Explanation:
Factorial of 0 is 1
*/


//Java Solution:
import java.util.Scanner;

public class Main {
    static int Factorial(int n) {
        // Write your code here
        if(n==1 || n==0)
            return 1;
        else    
            return n * Factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Factorial(n));
        scanner.close();
    }
}
/*
Complexity	Value	Reason
Time		O(n)	n recursive calls
Space		O(n)	n recursive stack frames
*/
