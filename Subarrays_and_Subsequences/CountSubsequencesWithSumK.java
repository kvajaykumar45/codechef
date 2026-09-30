/*

​ COUNT ALL SUBSEQUENCES WITH SUM K

You are given an array nums containing n integers and an integer k. Your task is to find the total number of non-empty subsequences of nums such that the sum of elements in the subsequence equals k. A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
Notes: if there are duplicate values, they are treated as different values
​
Function Name
countSubsequences – This function counts the number of non-empty subsequences whose sum is equal to k.
​
Parameters
    • nums : A number array containing the elements. 
    • k : A number representing the target sum. 

Return Value
    • Returns an integer — the total number of non-empty subsequences whose sum equals k. Return 0 if there are no subsequence with the given sum. 

Constraints
    • 1 ≤ n ≤ 20 
    • 1 ≤ nums[i] ≤ 100 
    • 1 ≤ k ≤ 2000 
    • The subsequence must be non-empty 
    • Order of elements must be preserved 

Input Format
The first line contains two integers n and k — the number of elements in the array and the target sum.
The second line contains n space-separated integers representing the elements of the array nums.
​
Output Format
Print a single integer — the number of subsequences whose sum is equal to k.

Input
5 8
2 3 5 1 4

Output
3

Explanation:

Valid subsequences with sum 8 are: [3, 5], [2, 5, 1], [3, 1, 4]

Total = 3

*/
public static int countSubsequences(int[] nums, int k) {
   return count(nums, k, 0);
}

static int count(int nums[], int k, int index)
{
    if(k==0) 
        return 1;
    if(index == nums.length) 
        return 0;
    int exclude = count(nums, k, index+1);
    
    int include = 0;
    if(nums[index] <= k) 
        include = count(nums, k-nums[index], index+1);
    
    return include + exclude;
}

/*
​Complexity
There are at most 2^n subsequences.
    • Time: O(2^n) 
    • Space: O(n) recursion stack 
And because n ≤ 20, 2^20 = 1,048,576, so this brute-force recursion is quite reasonable.

One important point: duplicates are automatically treated as different subsequences because each array position gets its own TAKE/DON'T-TAKE decision.
*/



