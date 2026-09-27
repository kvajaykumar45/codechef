/*
​ Problem: Is the i-th bit set
You are given two integers, n and i. Your task is to determine whether the ith bit (0-indexed from the least significant bit) in the binary form of n is 1. Return true if the bit is set, otherwise return false.
        ​ Constraints
    • 1≤T≤10^5 
    • 1≤n≤3∗10^9 
    • 0≤i≤31 
    */
    
    
// Java Solution 1:
class Solution {
    public boolean isBitSet(long n, int i) {
        return (n & (1L << i)) != 0;
    }
}

// Java Solution 2:
class Solution {
    public boolean isBitSet(long n, int i) {
        return (1 & (n >> i)) == 1;
    }
}


/*
Time Complexity: O(1) 
Space Complexity: O(1)
*/

