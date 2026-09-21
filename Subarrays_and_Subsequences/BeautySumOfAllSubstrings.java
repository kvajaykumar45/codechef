/*
​ SUM OF BEAUTY OF ALL SUBSTRINGS

You are given a string S consisting of lowercase English letters. The beauty of a substring is defined as the difference between the frequency of the most frequent character and the frequency of the least frequent character in that substring, considering only characters that appear at least once. Your task is to calculate the sum of beauty of all possible substrings of the given string S.
​
Function Declaration
    • Function Name:
        ◦ beautySum 
    • Parameters:
        ◦ s (string) A string consisting of lowercase English letters. 
    • Return Value:
        ◦ Returns an int representing the sum of beauty of all substrings of the string. 
​
Input Format
The first line contains an integer T — the number of test cases.
Each test case contains a single line with the string S.
​
Output Format
For each test case, print a single integer — the sum of beauty of all substrings of S.
​
Constraints
    • 1 ≤ T ≤ 100 
    • 1 ≤∣S∣≤ 500 
    • S consists of only lowercase English letters. 

Input
2
abcab
zzxyzz

Output
3
12

​Explanation:
For abcab, substrings contributing non-zero beauty are bcab, abca, and abcab, giving a total beauty of 3.
For zzxyzz, the total beauty across all substrings is 12.
*/

//Solution
 static int beautySum(String s) {
     int n = s.length();
     int sum = 0;
     for(int i=0; i<n; i++)
     {
         int freq[] = new int[26];
         for(int j=i; j<n; j++)
         {
         freq[s.charAt(j) - 'a']++;
         
         int maxfreq = 0;
         int minfreq = Integer.MAX_VALUE;
         for(int k=0; k<26; k++)
         {
             if(freq[k] > 0)
             {
                maxfreq = Math.max(maxfreq, freq[k]);
                minfreq = Math.min(minfreq, freq[k]);
             }
         }
         sum += (maxfreq - minfreq);
         }
     }
     return sum;
 }

/*
Complexity

There are O(n²) substrings, and for each substring we scan only 26 characters.

Time: O(26 × n²) → O(n²)
Space: O(26) → O(1)

For n ≤ 500, this is easily fast enough.
*/
