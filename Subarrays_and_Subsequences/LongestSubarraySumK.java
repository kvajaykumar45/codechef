/*

LONGEST SUBARRAY WITH A GIVEN SUM

You are given an array of integers nums with length n and an integer k. Your task is to determine the length of the longest continuous sub-array whose elements sum up exactly to k. If there is no such sub-array, return 0.

Function Declaration
Function Name
longestSubarraySum – This function computes the length of the longest continuous sub-array whose sum is exactly equal to k.

Parameters
    • arr : A vector of integers of length n, representing the array. 
    • k : An integer representing the required target sum. 

Return Value
    • Returns a single integer — the maximum length of any continuous sub-array whose sum equals k. If no such sub-array exists, the function returns 0. 
The input and output formats given below are only if you want to test using custom inputs.

Constraints
    • 1 ≤ T ≤ 10^5 
    • 1 ≤ n ≤ 10^5 
    • −10^5 ≤ arr[i] ≤ 10^5 
    • −10^9 ≤ k ≤ 10^9 

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases.
    • Each test case consists of multiple lines of input.
        ◦ The first line of each test case contains two space-separated integers n and k — the length of the array and the required sum respectively. 
        ◦ The next line contains n space-separated integers, representing the array nums. 

Output Format
For each test case, output on a new line a single integer — the length of the longest continuous subarray whose sum is exactly k. If no such subarray exists, output 0.

Input
3
6 15
10 5 2 7 1 9
3 6
-3 2 1
5 5
1 2 3 2 1

Output
4
0
2
*/

// Brute Force Solution
class Solution {
    public int longestSubarraySum(int[] nums, int k) {
        int maxlength = 0;
        int length = 0;
        for(int i=0; i<nums.length; i++)
        {
            int sum = 0;
            for(int j=i; j<nums.length; j++)
            {
                sum = sum+nums[j];
                if(sum == k)
                {
                    length = j - i + 1;
                    if(length > maxlength)
                        maxlength = length;
                }
            }
        }
        return maxlength; 
    }
}

//PrefixSum + HashMap Approach

class Solution {
    public int longestSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefixsum[] = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
            prefixsum[i] = sum;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlength = 0;
        int length = 0;
        for(int i=0; i<n; i++) {
            int diff = prefixsum[i] - k; 
            if(map.containsKey(diff))
            {
                length = i - map.get(diff);
                if(length > maxlength)
                    maxlength = length;
            }
            if(!map.containsKey(prefixsum[i])) 
                map.put(prefixsum[i], i);
        }
        return maxlength;
    }
}

/*
Approach		Negative numbers?		Time		Space
Brute force		✅ Yes				O(n²)		O(1)
Sliding window		❌ Generally no		O(n)		O(1)
Prefix Sum + HashMap	✅ Yes				O(n)		O(n)
*/


