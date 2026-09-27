/*
​ LARGEST SUBARRAY WITH SUM 0

Chef has an array of integers arr which may contain both positive and negative values.
He is curious to know the length of the longest contiguous subarray whose sum is equal to 0. Your task is to help Chef find this length. If no such subarray exists, output 0.
​
Function Declaration
​Function Name
largestSubarrayWithSumZero – This function finds the length of the longest contiguous subarray with sum equal to zero.
​
Parameters
    • arr : An array of integers (can contain positive and negative values). 

Return Value
    • Returns a single integer — the maximum length of a contiguous subarray whose sum is 0. 
    • Returns 0 if no such subarray exists. 

Constraints
    • 1 ≤ n ≤ 10^6 
    • −10^3 ≤ arr[i] ≤ 10^3 
    • Array elements can be positive, negative, or zero 

Input Format
    • The first line of each test case contains a single integer n — the number of elements in the array. 
    • The next line contains n space-separated integers arr[i] — the elements of the array. 

Output Format
    • For each test case, print a single integer — the length of the longest subarray whose sum is 0. 

Input
7
4 -3 1 -2 2 6 -6

Output
4
*/
//Hash + PrefixSum Solution
 public static int largestZeroSumSubarray(int[] arr, int n) {
     HashMap<Integer, Integer> map = new HashMap<>();
     map.put(0,-1);
     int prefixsum = 0;
     int length = 0;
     int maxlength = 0;
     for(int i=0; i<n; i++)
     {
         prefixsum += arr[i];
         if(map.containsKey(prefixsum))
         {
             length = i - map.get(prefixsum);
             if(length > maxlength)
                maxlength = length;
         }
         else
         {
             map.put(prefixsum, i);
         }
     }
     return maxlength;
 }
/*

Complexity		Result
Time			O(n) average
Space			O(n)
*/


