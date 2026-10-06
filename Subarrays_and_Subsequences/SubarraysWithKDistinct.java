/*
​ SUBARRAY WITH K DISTINCT NUMBER

You are given an integer array arr and an integer k. Your task is to find the number of contiguous subarrays in arr that contain exactly k distinct integers.A subarray is defined as a continuous and non-empty sequence of elements within the array.
​
Function Name
subarraysWithKDistinct – This function computes the number of contiguous subarrays that contain exactly k distinct integers.
​
Parameters
    • arr : A list/array of integers of length n, representing the input sequence. 
    • k : An integer representing the required number of distinct elements. 

Return Value
Returns an integer: The total number of contiguous subarrays that contain exactly k distinct integers. If there are no such good arrays then return 0 value.
​ Constraints:
    • 1≤T≤100 
    • 1≤n≤2⋅10^4 
    • 1≤k≤n 
    • 1≤nums[i]≤n for each 1≤i≤n 
    • The sum of n over all test cases won't exceed 2⋅10^5 
The input and output formats provided below are only for testing with custom inputs. You only need to return the value. Printing is handled automatically
​
Input Format
    • The first line contains an integer T, the number of test cases.
    • For each test case:
        ◦ The first line contains two integers: n (the size of the array) and k. 
        ◦ The second line contains n integers representing the array elements. 

Output Format
For each test case, output a single integer — the number of good subarrays.

Input
2
5 2
4 5 4 5 1
4 3
1 2 2 3

Output
7
1
*/
//Bruteforce Solution

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j=i; j<nums.length; j++)
            {
                set.add(nums[j]);
                if(set.size() == k)
                    count++;
            }
        }
        return count; 
    }
}
/*
Time is O(n^2)
Space is O(n)
*/
//Hash Based Solution

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j=i; j<nums.length; j++)
            {
                set.add(nums[j]);
                if(set.size() == k)
                    count++;
            }
        }
        return count; 
    }
}
/*
Time is O(n)
Space is O(n)
*/

