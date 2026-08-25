/*
            ​ CHEF AND STRING TO INTEGER
Chef has found a strange string that may contain spaces, signs, numbers, and letters. He wants to convert this string into an integer by following a few simple rules.
You need to help Chef by writing a program that performs this conversion carefully.
Conversion Rules
    • Ignore spaces:
        ◦ Skip all leading spaces before any character. 
    • Check the sign:
        ◦ If the next character is '-', the number is negative. 
        ◦ If the next character is '+', the number is positive. 
        ◦ If no sign is given, assume it is positive. 
    • Read digits only:
        ◦ Read all consecutive digits and stop when a non-digit character is found. 
        ◦ If no digits are found, the result is 0. 
    • Clamp within range:
        ◦ If the number is smaller than -2147483648, return -2147483648. 
        ◦ If the number is larger than 2147483647, return 2147483647.  
            ​ Input Format
    • The first line contains an integer T — the number of test cases. 
    • Each of the next T lines contains one string S. 
            ​ Output Format
    • For each test case, print the converted integer on a new line. 
            ​ Constraints
    • 1≤T≤100 
    • 0≤∣S∣≤200 
    • S may contain letters, digits, spaces, ’+’,
Input
5
98hello
-00456
+45abc23
word123
-91283472332

*/


// Java Solution
public static int myAtoi(String s) {
    // Handle null or empty strings
    if (s == null || s.length() == 0) return 0;
    int i = 0, n = s.length();
    
    // 1. Skip leading whitespaces
    while (i < n && s.charAt(i) == ' ') {
        i++;
    }

    // If string consists only of spaces
    if (i == n) return 0;

    // 2. Check sign
    int sign = 1;
    if (s.charAt(i) == '-') {
        sign = -1;
        i++;
    } else if (s.charAt(i) == '+') {
        i++;
    }

    // 3. Convert digits
    long num = 0;
    while (i < n && Character.isDigit(s.charAt(i))) {
        num = num * 10 + (s.charAt(i) - '0');

        // 4. Clamp to 32-bit integer range
        if (sign == 1 && num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sign == -1 && -num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        i++;
    }
    return (int)(sign * num);
}
