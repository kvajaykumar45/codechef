/*
​ COUNT NUMBER OF SUBARRAYS WITH THE GIVEN XOR K

You are given an array of integers arr and a target integer targetXOR. Your task is to compute the total number of contiguous subarrays whose XOR of all elements equals targetXOR.

Function Declaration
Function Name
countSubarraysWithXOR – Counts the number of contiguous subarrays whose XOR equals the target value.
Parameters
    • arr : A list/array of integers. 
    • k : An integer representing the target XOR value. 
Return Value
    • Returns an integer — the number of contiguous subarrays whose XOR is exactly equal to k. 

Constraints:
    • 1 ≤ arr.length ≤ 10^5 
    • 0 ≤ arr[i] ≤ 10^9 
    • 0 ≤ targetXOR ≤ 10^9 

Input Format
    • T → number of test cases
    • For each test case:
        ◦ Line 1 → n (array size) and k (target XOR) 
        ◦ Line 2 → n integers representing the array 

Output Format One number per test case.
*/

//Solution
class Solution {
    public int countSubarraysWithXOR(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int xor = 0;
        int count = 0;
        map.put(0,1); 
        for(int x: arr)
        {
            xor = xor ^ x;
            int diff = xor ^ k;
            if(map.containsKey(diff))
                count += map.get(diff); 
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count; 
    }
}

/*
Time: O(n)
Space: O(n)
*/

