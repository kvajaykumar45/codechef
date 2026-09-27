/*
​ CHEF AND THE MAGICAL SUBARRAY

Chef found a magical array of integers arr in his kitchen. He believes that somewhere inside this array, there exists a contiguous sequence of dishes (subarray) whose product of tastiness values is the highest possible. Now Chef is curious: Can you help him find the maximum product among all possible subarrays?
​
Function Declaration
​Function Name
maxProductSubarray – This function computes the maximum product of any contiguous subarray.
​
Parameters
    • arr : An array of integers that may contain positive numbers, negative numbers, and zeros. 

Return Value
    • Returns a single integer — the maximum product of any contiguous subarray. 

Constraints
    • 1 ≤ N ≤ 2×10^4 
    • −10≤arr[i]≤10 
    • The product of any subarray fits in a 32-bit signed integer 

Input Format
    • The first line contains a single integer N — the number of elements in the array. 
    • The second line contains N space-separated integers representing the array elements. 

Output Format
Output a single integer — the maximum product of any contiguous subarray.

Input
5
-1 -2 -3 4 -2

Output
48
*/
//Brute Force Solution
   public static int maxProductSubarray(int[] arr) {
       int n = arr.length;
       int maxproduct = Integer.MIN_VALUE;
       for(int i=0; i<n; i++)   {
           int product = 1;
           for(int j=i; j<n; j++) {
               product = product * arr[j];
               if(product > maxproduct)
                    maxproduct = product;
           }
       }
       return maxproduct; 
   }
/*
Time: O(n^2)
Space: O(1)
*/

