/*
CHEF FINDS COMMON SUBSEQUENCE
Chef has two text strings and wants to find the longest common subsequence between them. A subsequence is a sequence that can be derived from another sequence by deleting some characters without changing the order of the remaining characters. Chef wants to know the maximum length of such a subsequence that appears in both strings. Help Chef by writing a function that calculates this length efficiently.

Function Name
findLongestCommonSubsequence - This function calculates the length of the longest common subsequence between two text strings.

Parameters
    • firstText (TextString): The first input string for comparison. 
    • secondText (TextString): The second input string for comparison. 
    • Both strings consist of lowercase and/or uppercase English letters, with length up to 1000 characters. 

Return Value
    • Returns an integerResult (int) representing the length of the longest common subsequence between firstText and secondText. 
    • The output is a non-negative integer indicating the maximum number of characters that appear in both strings in the same order, but not necessarily consecutively. 

Input Format
    • The first line contains a single integer T — the number of test cases. 
    • Each test case consists of two lines: 
        ◦ The first line contains the string firstText. 
        ◦ The second line contains the string secondText. 

Output Format
    • For each test case, print a single line containing the integerResult — the length of the longest common subsequence between firstText and secondText. 
    • Help Chef by printing the exact length for each pair of strings. 

Constraints
    • 1 ≤ T ≤ 100 
    • 1 ≤∣firstText∣,∣secondText∣≤ 1000 
    • Both firstText and secondText consist of only lowercase and/or uppercase English letters. 


Input
3
abcde
ace
xyz
xyz
hello
world

Output
3
3
1
*/
//Recursive Solution

    static int findLongestCommonSubsequence(String firstText, String secondText) {
                int count = LCS(firstText, secondText, 0, 0);
                return count;
    }
    static int LCS(String first, String second, int i, int j){
        if(i == first.length() || j == second.length()) {
            return 0;
        }
        if(first.charAt(i) == second.charAt(j)){
            return 1 + LCS(first, second, i+1, j+1);
        }
        else {
           return Math.max(LCS(first, second, i+1, j), LCS(first, second, i, j+1));
        }
    }
/*    
Recursive LCS — Reason for inefficiency
The recursive solution makes two choices whenever the characters are different: skip a character from the first string or skip a character from the second string. This creates a large recursion tree. The same (i, j) subproblem is calculated many times, so the number of recursive calls grows exponentially as the string lengths increase. Therefore, the recursive solution works for small inputs but becomes too slow for large inputs.

Time Complexity: O(2^(n+m))
    • At many positions, recursion branches into 2 calls.
    • Therefore, the number of calls can grow exponentially.

Space Complexity: O(n + m)
    • No extra array/table is used.
    • The space is mainly used by the recursion call stack.
    • The maximum recursion depth is at most n + m.

One-line memory note
Recursion is correct but slow because it repeatedly solves the same subproblems. DP avoids this repeated work.
*/

//Top DownDP Solution (Recursion + Memoization)

    static int findLongestCommonSubsequence(String firstText, String secondText) {
                int n = firstText.length();
                int m = secondText.length();
                int memo[][] = new int[n][m];
                for(int i=0; i<n; i++)
                    Arrays.fill(memo[i], -1);
                int count = LCS(firstText, secondText, 0, 0, memo);
                return count;
    }
    
    static int LCS(String first, String second, int i, int j, int[][] memo)
    {
        if(i == first.length() || j == second.length())
        {
            return 0;
        }
        if(memo[i][j] != -1)
            return memo[i][j]; 
        
        if(first.charAt(i) == second.charAt(j))
        {
            memo[i][j] =  1 + LCS(first, second, i+1, j+1, memo);
        }
        else 
        {
            memo[i][j] = Math.max(LCS(first, second, i+1, j, memo), LCS(first, second, i, j+1, memo));
        }
        return memo[i][j];
    }
    
/*
​ Time Complexity: O(n × m)
Because:
    • i can have n possible positions.
    • j can have m possible positions.
    • Therefore, there are at most n × m different (i, j) subproblems.
    • Each subproblem is calculated only once because of memo.
So: Time = O(n × m)
​
Space Complexity: O(n × m)
Your memo table is: int[][] memo = new int[n][m];  which requires n × m space.
There is also recursion-stack space of up to O(n + m), but the memo table dominates it.
So: Space = O(n × m)
​*/
//Bottom Up DP Solution
    static int findLongestCommonSubsequence(String firstText, String secondText) {
        int n = firstText.length();
        int m = secondText.length();
        
        int dp[][] = new int[n+1][m+1];
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(firstText.charAt(i-1) == secondText.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m]; 
    }

/*
Time  → O(n × m)
Space → O(n × m)
*/
