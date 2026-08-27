/*
​ MEDIAN OF 2 SORTED ARRAYS
Chef is given two sorted arrays nums1 and nums2, of lengths m and n respectively. Chef wants to combine both arrays and find the median of the resulting set of numbers.
The median of a sorted list is the middle value:
    • If the total number of elements is odd, the median is the middle element. 
    • If the total number of elements is even, the median is the average of the two middle elements. 
Example (Even length): For the sorted array [2,4,6,8], the middle elements are 4 and 6, so Median = (4+6)/2=5.00000
Your task is to compute the median of the combined arrays. 
Your algorithm must run in O(log(m + n)) time.
​ Notes
    • Print the answer with 5 decimal places (e.g. 3.00000, 17.50000). 
    • The arrays are already sorted in non-decreasing order. 
    • At least one array is non-empty: 1≤m+n≤2000. 
​ Function Declaration
    • Function Name:
        ◦ findMedianSortedArrays 
    • Parameters:
        ◦ nums1 (vector<int>) A sorted array of numbers. 
        ◦ m (int) The number of valid elements in nums1. 
        ◦ nums2 (vector<int>) A sorted array of numbers. 
        ◦ n (int) The number of valid elements in nums2. 
    • Return Value:
        ◦ Returns a double representing the median of the combined sorted array. 
​ Constraints
    • 1≤T≤1000 
    • 0≤m≤1000 
    • 0≤n≤1000 
    • 1≤m+n≤2000 
    • −10^6≤nums1[i],nums2[i]≤10^6 
    • At least one array is non-empty 
​ Input Format
The first line contains an integer T — the number of test cases.
For each test case:
    • First line containing m,n represent size of nums1,nums2 
    • Second line containing the elements of nums1 
    • Third line containing the elements of nums2 
​ Output Format
    • For each test case, print the median of the combined array. 
    • The result must be printed with 5 decimal places. 
Input
2
2 3
2 6
1 3 5
2 4
10 20
5 15 25 30
Output
3.00000
17.50000
*/

//Java Solution

class Solution {
    public double findMedianSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        // Ensure nums1 is the smaller array to optimize binary search
        if (m > n) {
            return findMedianSortedArrays(nums2, n, nums1, m);
        }

        int totalLeft = (m + n + 1) / 2;
        int left = 0, right = m;


        while (left <= right) {
            int i = (left + right) / 2;
            int j = totalLeft - i;

            int nums1Left = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1Right = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int nums2Left = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2Right = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                // If total length is odd
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1Left, nums2Left);
                } else {
                    // If total length is even, use 2.0 to ensure floating-point division
                    int leftMax = Math.max(nums1Left, nums2Left);
                    int rightMin = Math.min(nums1Right, nums2Right);
                    return (leftMax + rightMin) / 2.0;
                }
            } else if (nums1Left > nums2Right) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }
        return 0.0; 
    }
}

