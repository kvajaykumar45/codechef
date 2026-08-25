/*            ​ CONVERT STRING TO NUMBER
You are given a string that represents a positive number. Your task is to write a program that converts this string into its numerical equivalent without using any in-built parsing, conversion libraries, or direct type casting methods. The string will not contain any leading zeros, decimals, or any non-numeric characters.
Complete the function stringToNumber in the IDE
            ​ Input Format
    • The first line contains a single integer, T, the number of test cases. 
    • The following T lines each contain a single string, S, representing the number. 
            ​ Output Format
For each test case, print the numerical equivalent of the string.
            ​ Constraints
    • 1≤T≤100 
    • 1≤∣S∣≤10, where ∣S∣ is the length of the string. 
    • S will only contain digits (0-9) and will not have leading zeros. 
Input
3
123
42
1001

Output
123
42
1001
*/

//Java Solution

public static long stringToNumber(String str) 
{
    int i = 0;
    long number = 0;
    int x = 0;
    while ( i < str.length())
    {
        x = str.charAt(i) - '0';
        number = number * 10 + x;
        i++;
    }
    return number; 
}

/*
Time Complexity: O(n)

The loop runs once for every character. 
If there are n characters, we perform n iterations. 
Time = O(n)

Space Complexity: O(1)

*/

