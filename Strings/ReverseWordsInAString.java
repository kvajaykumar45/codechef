/*
REVERSE THE WORDS IN A STRING
You are given a string s consisting of English letters (upper and lower), digits, and spaces ' '. The string may contain leading or trailing spaces, or multiple spaces between words. Your task is to reverse the order of the words in the string. A word is defined as a sequence of non-space characters.
The resulting string should:
    • Contain words in reversed order. 
    • Have only single spaces separating words. 
    • Not contain leading or trailing spaces. 
Function Declaration
            ​ Function Name
reverseWords – This function reverses the order of words in a given string while ensuring that words are separated by exactly one space and there are no leading or trailing spaces.
            ​ Parameters
    • s : A string consisting of English letters (uppercase and lowercase), digits, and spaces ' '. 
Return Value
    • Returns a string containing the words of s in reversed order. 
    • The returned string: 
        ◦ Contains words separated by a single space. 
        ◦ Has no leading or trailing spaces. 
Constraints
    • 1≤∣s∣≤104 
    • The string s contains: 
        ◦ Uppercase English letters (A–Z) 
        ◦ Lowercase English letters (a–z) 
        ◦ Digits (0–9) 
        ◦ Space characters (' ') 
    • The string may contain: 
        ◦ Leading spaces 
        ◦ Trailing spaces 
        ◦ Multiple consecutive spaces between words 
    • There is at least one word in s. 
Input Format
    • The first line contains a single string s. 
Output Format
    • Print a single line containing the words of s in reversed order. 
    • Words must be separated by exactly one space. 
    • There must be no leading or trailing spaces in the output. 
Input 
OpenAI   creates amazing   AI   models  
Output 
models AI amazing creates OpenAI
*/

//Java Solution 1

public static String reverseWords(String s) {
    String words[] = s.split(" ");
    java.util.Collections.reverse(java.util.Arrays.asList(words));
    String result = String.join(" ", words);
    return result; 
}
/*

Time Complexity: O(n) 
    • s.split(" ") → O(n) 	Here, n = length of the input string s.
    • Collections.reverse(...) → O(n) (reverses the array elements)
    • String.join(" ", words) → O(n)
So:
O(n) + O(n) + O(n) = O(n)
            ​ Space Complexity: O(n)
Because:
    • split() creates a String[] containing the words.
    • String.join() creates the final result string.
So the overall complexity is:
Time: O(n)
Space: O(n)
This is an efficient solution for reversing the order of words.
*/


//Java Solution 2

public static String reverseWords(String s) {
    // write your code here 
    String words[] = s.split(" ");
    for(int i=0, j=words.length-1; i<j; i++, j--)
    {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }
    String result = new String();
    for(String each: words)
        result += each+" ";
    return result;
}

/*
So the Time complexity
    • split() → O(L), L is no of characters 
    • reverse words → O(W), W is no of words
    • StringBuilder.append() → O(L) overall 
    • toString() → O(L) 

Therefore, O(L) + O(W) + O(L) + O(L) = O(L)

Space = O(L)

*/
