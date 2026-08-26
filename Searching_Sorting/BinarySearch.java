/*
BINARY SEARCH
Complete the code for Binary Search to find the index of an element K in the given array A.    Output the index of the element of K, if K is present in A, else output −1.

Sample 1:
Input
9 7 
1 3 6 7 10 13 20 25 27 
Output 3

Sample 2:
Input
9 2
1 3 6 7 10 13 20 25 27 
Output -1

*/

//Java Solution
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static int binarySearch(int[] arr, int n, int k) {
        int left = 0, right = n - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (k == arr[middle]) {
                return middle;
            } else if (arr[middle] > k) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1; // k not found
    }
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(binarySearch(arr, n, k));
	}
}

/*
Case		Time Complexity
Best Case		O(1)
Average Case		O(log n)
Worst Case		O(log n)

*/

