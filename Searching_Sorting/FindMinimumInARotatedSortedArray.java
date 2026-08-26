/*
FIND MINIMUM IN A ROTATED SORTED ARRAY
Imagine you have an array of length n that was initially sorted in increasing order, but then it was rotated some number of times between 1 and n. A rotation consists of moving the last element of the array to the first position. For example, if the sorted array is numbers=[1,2,3,4,5,6,7], after rotating it 3 times, it becomes: [5,6,7,1,2,3,4] Or after rotating 7 times, the array stays the same: [1,2,3,4,5,6,7]
Your task is: Given a rotated sorted array of distinct integers, write an efficient algorithm to find and return the smallest element in the array. Your solution must run in O(log n) time complexity.

Function Declaration

Function Name
findMin – This function returns the minimum element in a rotated sorted array of distinct integers.

Parameters
    • nums : A reference to a rotated sorted array of distinct integers. 

Return Value
    • Returns the smallest integer present in the array. 

Input Format
    • The first line contains an integer T — number of test cases. 
    • For each test case: 
        ◦ One line containing an integer n — size of the array 
        ◦ One line containing n space-separated integers — the rotated sorted array 

Output Format
    • For each test case, print a single integer — the minimum element in the array 

Constraints
    • 1 <= T <= 100 
    • 1 ≤ nums.length ≤ 10^5 
    • −10^4 ≤ nums[i] ≤ 10^4 
    • All elements in nums are unique 
    • nums is guaranteed to be a rotated version of a sorted array 

Sample 1:
Input
3
8
7 8 1 2 3 4 5 6
6
12 15 18 2 5 8
6
3 4 5 6 1 2
Output 
1
2
1
*/

//Java Solution

class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high)
        {
            int mid = (low + high)/2;
            if(nums[mid] < nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[high];
    }

/*
Complexity		Value
Time			O(log n)
Space			O(1)
*/

