/*
LENGTH OF LONGEST PALINDROME

Given a string s which consists of lowercase latin letters, return the length of the longest palindrome that can be built with those letters.

Input Format
    The first and only line of input contains the string s.

Output Format
    Output on a single line, the length of the longest palindrome that can be format using the letters of s.

Constraints
    • 1≤s.length≤10^5
    • s consists of lowercase English letters only.

Input aabdcd

Output 5

Explanation Longest possible palindromic strings: adbda, adcda, dabad, dacad
*/

public static int longestPalindromeLength(String s) {
    // write your code here 
    HashMap<Character, Integer> h = new HashMap<>();
    for(char ch: s.toCharArray())
        h.put(ch, h.getOrDefault(ch, 0)+1);
    int count = 0;
    boolean odd = false;
    for(int value: h.values()) {
        if((value & 1 ) == 0)
            count = count + value;
        else
            if(!odd) {
                odd = true;
                count = count + value;
            }
    }
    return count;
}


/*
Let N = length of the string.
​Time Complexity: O(N)
There are two main loops:
Operation			Time
s.toCharArray()		O(N)
First for loop			O(N)
Second for loop		O(K)
Total				O(N + K) = O(N)

Here K = number of distinct characters. Since K ≤ N, the overall time is O(N).
​ 
​Space Complexity: O(K)
The HashMap stores one entry for each distinct character.
For example:
s = "aabbccdde"
The map contains:
a → 2
b → 2
c → 2
d → 2
e → 1
So there are 5 entries.
Therefore: Space = O(K)
Since K ≤ N, we can also say the worst-case space complexity is: O(N)
​

Final answer
Time Complexity: O(N)
Space Complexity: O(K), worst case O(N)

One small point: because Java char has a fixed range, if the problem guarantees ordinary characters, the map's practical maximum size can be bounded by the character set. But for standard interview/competitive-programming analysis, O(N) auxiliary space is the safest answer.
*/


