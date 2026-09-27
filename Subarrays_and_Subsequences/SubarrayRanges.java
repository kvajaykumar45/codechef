/*
CHEF COMPUTES SUBARRAY RANGES

Chef has an integer array and wants to explore all possible subarrays within it. A subarray is a contiguous section of the array. Chef is interested in the range of each subarray, defined as the difference between the maximum and minimum elements present in that subarray. Help Chef find the total sum of the ranges of all possible subarrays of the array.

Function Declaration
    • Function Name
        ◦ sumOfSubarrayRanges 
    • Parameters
        ◦ inputArray : A vector/list of integers representing Chef's array elements. The array may contain positive, negative, or zero values. 
    • Return Value
        ◦ Returns a long long integer representing the total sum of ranges of all subarrays. 

Constraints
    • 1 ≤ T ≤ 10^5 — Number of test cases 
    • 1 ≤ N ≤ 1000 — Size of Chef's array 
    • −10^9 ≤ inputArray[i] ≤ 10^9 — Value of each element 

Input Format
    • The first line contains a single integer T — the number of test cases. 
    • For each test case: 
        ◦ The first line contains an integer N — the size of Chef's array. 
        ◦ The second line contains N space-separated integers representing the elements of Chef's array. 

Output Format
    • For each test case, print a single integer — the total sum of the ranges of all subarrays of Chef's array. 

Input
4
3
1 2 3
3
1 3 3
5
4 -2 -3 4 1
2
47 70

Output
4
4
59
23

*/
//Solution
class Codechef {

        public long sumOfSubarrayRanges(int[] inputArray) {
            
            long sum = 0;
            int n = inputArray.length;
            for(int i=0; i<n; i++)
            {
                int max = Integer. MIN_VALUE;
                int min = Integer. MAX_VALUE;
                int diff = 0;
                for(int j=i; j<n; j++)
                {
                    if(inputArray[j] > max)
                        max = inputArray[j];
                    if(inputArray[j] < min)
                        min = inputArray[j];
                    diff = max - min;
                    sum += diff;
                }
            }
            return sum;
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(n) 
*/

