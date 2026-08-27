/*

COUNT BEAUTIFUL PAIRS
You have an array A of N integers.  A pair of indices (i,j) is called Beautiful if Ai=Aj^2 and 1≤i<j≤N. Count the number of Beautiful Pairs in the given array.

Task Try to solve this problem in N^2 time complexity.

Input Format
    • The first line of the input contains a single integer N, denoting the length of array A. 
    • The second line of the input contains N space-separated integers A1, A2,…,AN— denoting the array A. 

Output Format 
Output the number of Beautiful Pairs in the given array A.

Constraints
    • 2 ≤ N ≤ 10^3 
    • 1 ≤ Ai ≤ 10^4 

Input
4
4 4 2 2

Output
4

Input
3
1 2 2 

Output
0
*/

// Java Solution

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        for(int i=0; i<n; i++)
        {
            int square = a[i] * a[i];
            count += h.getOrDefault(square, 0);
            h.put(a[i], h.getOrDefault(a[i], 0)+1);
        }
       System.out.println(count);
    }
}

