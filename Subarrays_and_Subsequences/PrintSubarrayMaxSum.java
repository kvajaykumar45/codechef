/*
            ​ PRINT SUBARRAY WITH MAXIMUM SUBARRAY SUM
Given an integer array nums, find the longest contiguous subarray (containing at least one element) with the largest sum and print the elements of that subarray.

Note: If two or more sub arrays have the same length and same max sum then you should return the leftmost array.

Function Declaration
Function Name
maxSubArray – This function finds the longest contiguous subarray (with at least one element) that has the maximum possible sum, and returns the elements of that subarray. If multiple subarrays have the same maximum sum and same length, the function returns the leftmost such subarray.

Parameters
    • nums : A reference to a vector of integers representing the array.
        ◦ Each element can be negative, zero, or positive. 

Return Value
    • Returns an array containing the elements of the contiguous subarray that:
        ◦ Has the maximum subarray sum. 
        ◦ If multiple subarrays achieve this sum, the function returns the longest one. 
        ◦ If still tied, returns the leftmost such subarray. 

Constraints
    • 1 ≤ nums.length ≤ 10^5 
    • −10^4 ≤ nums[i] ≤ 10^4 
    • The solution must run in O(N) time due to input size. 

Input Format
    • The first line contains a single integer T — the number of test cases.
    • For each test case:
        ◦ The first line contains an integer N — the size of the array. 
        ◦ The next line contains N space-separated integers representing the array elements. 

Output Format
    • For each test case, print the elements of the longest maximum-sum subarray on a new line. 

Input
2
6
4 -1 2 1 -5 4
5
1 2 -1 -2 5

Output
4 -1 2 1
1 2 -1 -2 5
*/
//Solution

class Solution {
    public int[] maxSubArray(int[] nums) {
        // write your code here
        long currentsum = nums[0];
        long maxsum = nums[0];
        int currentstart = 0;
        int beststart = 0;
        int bestend = 0;
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]> nums[i]+currentsum)
            {
                currentsum = nums[i];
                currentstart = i;
            }
            else
            {
                currentsum += nums[i];
            }
            
            int currentlength = i - currentstart + 1;
            int bestlength = bestend - beststart + 1;
            if(currentsum > maxsum || (currentsum == maxsum && currentlength>bestlength))
            {
                maxsum = currentsum;
                beststart = currentstart;
                bestend = i;
            }
        }//for close 
        int result[] = new int[bestend - beststart + 1];
        for(int i=beststart; i<=bestend; i++)
            result[i-beststart] = nums[i];
        return result;
        }//method close
    }//class end

/*
​
Time Complexity: O(N)
You traverse the array once:
for(int i = 1; i < nums.length; i++)
Then you traverse the selected subarray once to create result:
for(int i = beststart; i <= bestend; i++)
So overall: O(N) + O(N) = O(N)
​

Space Complexity: O(N)
Your algorithm itself uses only a few variables:
currentsum
maxsum
currentstart
beststart
bestend
So auxiliary space = O(1).

But you create the returned result array: int[] result = new int[bestend - beststart + 1];
In the worst case, it can contain all N elements.

Therefore:
    • Auxiliary space: O(1)
    • Including returned result array: O(N)

For this problem, the standard answer is usually Time: O(N), Space: O(N) because the function must return the subarray.
*/


