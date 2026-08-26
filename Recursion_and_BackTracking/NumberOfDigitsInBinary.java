/*
Number of digits in binary using recursion

Given an integer NN - you need to output the count of digits in the binary value of NN.
Input Format

1st line of input consists of t - the count of test cases

    Each test case consists of 1 line - the integer NN

Output Format

You need to output a single integer - the count of digits in the binary equivalent of NN

Input
3
7
15
32

Output
3
4
6

Explanation:

Test case 1 - Number 7 - Binary: 111, Digit count: 3 
Test case 2 - Number 15 - Binary: 1111, Digit count: 4 
Test case 3 - Number 32 - Binary: 100000, Digit count: 6

*/
// Java Solution

import java.util.Scanner;

class BinaryDigitCounter {
    public static String intToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }
    
    // update the function below
    public static int countBinaryDigits(long n) {
        if(n == 0)
            return 1;
        if(n==1)
            return 1;
       return 1 + countBinaryDigits(n/2);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            long N = scanner.nextLong();
            //String binary = intToBinary(N);
            int digitCount = countBinaryDigits(N);
            System.out.println(digitCount);
        }
        
        scanner.close();
    }
}

/*

Time Complexity: O(log N)

Each recursive call divides n by 2.

For example, for 32:

32 → 16 → 8 → 4 → 2 → 1

There are about log₂(N) calls.

So:

Time = O(log N)

Space Complexity: O(log N)

Because this is recursion, every call remains on the call stack until the base case is reached.

For 32:

count(32)
  count(16)
    count(8)
      count(4)
        count(2)
          count(1)

There are O(log N) recursive calls.
*/




