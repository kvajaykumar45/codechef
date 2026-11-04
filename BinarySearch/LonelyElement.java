/*
Lonely Element in Array

You are given a sorted array of integers A of size N. In this array, every element occurs exactly twice, except for one element which occurs only once.Find and print the element that occurs only once.

Your solution should run in O(logN) time and use O(1) extra memory.

Function Declaration
Function Name
findSinglefindSingle – This function finds the unique element that appears only once in a sorted array.

Parameters
    numsnums : A sorted array of integers where every element appears exactly twice except one.

Return Value
    Returns a single integer — the element that occurs only once.

Constraints
1≤N≤10^5
0≤nums[i]≤10^5
Array is sorted in non-decreasing order
Exactly one element appears once; all others appear exactly twice

Input Format
The first line contains a single integer N — the size of the array.
The second line contains N space-separated integers representing the array elements.

Output Format
Print a single integer — the element that occurs only once.

Input
5
2 2 5 7 7

Output
5
*/

 public static int solve(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high)
        {
            int mid = low + (high - low)/2;
            if(mid%2==1)
                mid--;
            if(nums[mid] == nums[mid + 1])
                low = mid + 2;
            else 
                high = mid;
        }
        return nums[low];
    }

