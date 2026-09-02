/*//
​ CHECK PALINDROME USING RECURSION
​
 Problem Description
Given a string S, determine whether it is a palindrome using recursion. A string is called a palindrome if it reads the same forward and backward.

For example:
    • "madam" → Palindrome
    • "level" → Palindrome
    • "hello" → Not a Palindrome

Your task is to recursively compare characters from the beginning and the end of the string
​
Input Format
    • The first line contains a string S.
​
Output Format
    • Print "Palindrome" if the given string is a palindrome.
    • Otherwise, print "Not Palindrome".
​
Sample Input 1
madam
​
Sample Output 1
Palindrome
​
Sample Input 2
hello
​
Sample Output 2
Not Palindrome
​
Constraints
    • 1 ≤ S.length() ≤ 10^5
    • The string contains lowercase English letters (a-z).

Note: The solution should use recursion to check whether the string is a palindrome.
*/
//Java Solution
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char arr[] = input.toCharArray();
		System.out.println(isPalindrome(arr, 0, input.length()-1));
	
	}
	public static boolean isPalindrome(char[] s, int left, int right)
	{
	if(left>=right)
		return true;
	if(s[left] != s[right])
		return false;
	return isPalindrome(s, left+1, right-1);
	}
}

/*


Approach	Time Complexity	Extra Data Structure	Stack	Total Space
char[] approach	O(n)		O(n) array		O(n)	O(n)
String approach	O(n)		O(1)			O(n)	O(n)
*/

