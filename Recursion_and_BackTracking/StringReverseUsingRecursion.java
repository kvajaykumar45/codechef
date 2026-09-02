/*/*
Reverse a String Using Recursion

Problem Statement
Given a string S, reverse the string using recursion and print the reversed string.
You must solve the problem by recursively processing the characters of the string.

Input Format
    • The first line contains a string S.

Output Format
    • Print the string S in reverse order.

Sample Input
hello

Sample Output
olleh

Constraints
    • 1 ≤ |S| ≤ 10^5
    • The string may contain uppercase letters, lowercase letters, digits, and spaces (depending on the implementation requirements).

Note: The solution should use recursion to reverse the string.

*/
// Java Solution


import java.util.*;

class Main {

    public static void reverse(char[] arr, int left, int right) {

        // Base case
        if (left >= right) {
            return;
        }

        // Swap characters
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        reverse(arr, 0, arr.length - 1);
        System.out.println(new String(arr));
    }
}

/*

​Time Complexity
Each pair of characters is processed once:
O(N)
​
Space Complexity
The recursion depth is approximately N / 2:
O(N) auxiliary space due to the recursion call stack.
The char[] itself takes O(N) space to store the string characters.
*/



