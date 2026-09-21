/*
​ LONGEST PALINDROMIC SUBSTRING

Chef has a string S consisting of letters and digits. He wants to find the longest palindromic substring. A palindromic substring is a contiguous sequence of characters that reads the same forward and backward. Due to case sensitivity 'A' != 'a' in a palindrome.
The function searches for all possible palindromic substrings in s and returns the one with the maximum length. If there is a tie, priority is given to the substring with the smallest starting index.
​
 Function Declaration
​ Function Name
findLongestPalindrome – This function finds the longest palindromic substring in a given string.
​
 Parameters
    • s : A string consisting of English letters (uppercase and lowercase) and digits. 

Return Value
    • Returns a string representing the longest palindromic substring in s. 
    • If multiple palindromic substrings of the same maximum length exist, the one that appears first in s is returned. 

Constraints
    • 1≤∣s∣≤1000 
    • String s consists of: 
        ◦ English letters (uppercase and lowercase) 
        ◦ Digits (0–9) 

Input Format
    • A single line containing the string s. 

Output Format
    • Print the longest palindromic substring. 
    • If multiple answers exist, print the one that appears first in the string. 

Input	racecar12321

Output racecar

Explanation:
"racecar" and "12321" are both palindromes.
Both have length 7 and 5 respectively.
"racecar" length is larger so it is printed.

Input abaxyzzyxf

Output xyzzyx
​
Explanation:
The longest palindromic substring is "xyzzyx" (length 6).
Even though "aba" is a palindrome, it is shorter than "xyzzyx".

Input 121323

Output 121
​
Explanation:
121 and 323 are both palindrome.
Both have length of 3.
Thus for tie breaker the palindrome with the smaller starting index will be printed.
121 starting index=0. 323 starting index=3.

Trick
For every i
    ↓
Odd center:  (i, i)
    ↓
Expand left/right

Even center: (i, i+1)
    ↓
Expand left/right
    ↓
Keep the longest palindrome
    ↓
If equal length → keep the earlier one
*/

//Solution
 
 public static String findLongestPalindrome(String s) {
     // write your code here...
     int n = s.length();
     int start = 0;
     int maxlength = 1;
     for(int i=0; i<n; i++){
         int left = i;
         int right = i;
         while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
             int length = right - left + 1;
             if(length>maxlength){
                maxlength = length;
                start = left;
             }
             left--;
             right++;
         }
         
         left = i;
         right = i+1;
         while(left>=0 && right<n && s.charAt(left) == s.charAt(right))
         {
             int length = right - left + 1;
             if(length > maxlength)
             {
                maxlength = length;
                start = left;
             }
             left--;
             right++;
         }
     }
     return s.substring(start, start+maxlength);
 }

/*
Time  : O(n²)
Space : O(1)

Manacher's Algorithm: O(n) time, but much more complicated
*/

