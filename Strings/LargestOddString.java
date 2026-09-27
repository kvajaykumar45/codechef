/*            ​ LARGEST ODD SUBSTRING
You are given a string nums consisting of digits representing a large integer. Your task is to find the largest-valued odd integer (as a substring of nums) that can be obtained. A substring is a contiguous sequence of characters within the string.
        ​ Function Declaration
            ​ Function Name
findLargestOddSubstring – This function finds the largest-valued odd integer that can be obtained as a substring of the given numeric string.
            ​ Parameters
    • num : A string representing a large integer, consisting only of digits (0–9). 
            ​ Return Value
    • This function prints:
        ◦ The largest odd integer substring if it exists. 
        ◦ −1 if no odd integer substring can be formed. 
        ​ Constraints
    • 1≤∣num∣≤105 
    • The string num contains only digits 0–9 
    • The string does not contain leading zeros 
    • There is no limit on the size of the integer represented by the substring 
            ​ Input Format
    • The first line contains a single string num. 
            ​ Output Format
    • Print a single line:
        ◦ The largest odd integer substring of num 
        ◦ Or -1 if no odd substring exists 
Input 128764 
Output 1287 

*/











//Java Solution


 public static String findLargestOddSubstring(String num) {
     
     int i = num.length()-1;
     while(i >= 0)
     {
         int x = num.charAt(i) - 48;
         if ( (x&1) == 1)
         {
            return num.substring(0, i+1);
         }
         i--;
     }
    return "-1";
 }
/*

Time Complexity: O(n)
In the worst case, we may check every character from right to left.
            ​ Space Complexity: O(1)
Your algorithm uses only a few variables:
int i;
int x;
The number of extra variables does not increase with the input size.
Therefore:
Auxiliary Space Complexity = O(1)
Note: substring() returns a new string in modern Java implementations, so if you count the returned string's storage, it can require O(n) space. But the algorithm's auxiliary space is O(1).
Type
Space Complexity
Auxiliary space O(1)
Including returned string O(n)
Including input + output O(n)









*/
