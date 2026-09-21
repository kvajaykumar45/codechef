
/*
​ COUNT SUBARRAYS WITH GIVEN SUM

You are given an integer array arr and a target integer k. Your task is to find the number of contiguous subarrays in arr whose sum is exactly equal to k. A subarray is defined as a continuous and non-empty sequence of elements within the array.
​
 Function Declaration
​ Function Name
subarraySum – This function computes the number of contiguous subarrays whose sum equals the target value k.
​ 
Parameters
    • arr : A list/array of integers of length n, representing the input sequence. 
    • k : An integer representing the target sum. 

Return Value
    • Returns an integer: The total number of contiguous subarrays whose sum is exactly k. 

Constraints:
    • 1 ≤ T ≤ 100, 
    • 1 ≤ arr.length ≤ 10^5, 
    • −1000 ≤ arr[i] ≤ 1000, 
    • −10^7 ≤ k ≤ 10^7 

Input Format
    • The first line contains T — the number of test cases.
    • For each test case:
        ◦ The first line contains n and k. 
        ◦ The second line contains n integers representing the array. 

Output Format
    • Output a single integer: The number of contiguous subarrays whose sum is exactly k. 

Input
5
4 5
2 3 -1 4
4 1
1 -1 1 1
5 3
1 2 1 -1 1
3 0
0 0 0
6 -2
-1 -1 2 -2 1 -1

Output
1
5
4
6
5
*/

/*
Algorithm

sum += arr[i]
needed = sum - k
if needed exists in HashMap:
    answer += frequency of needed
then:
    increase frequency of sum
*/

//Prefix Sum + HashMap Pattern based Solution

class Solution {
    public int subarraySum(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<arr.length; i++)
        {
            sum = sum+arr[i]; 
            int need = sum - k;
            if(map.containsKey(need))
            {
                count += map.get(need);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count; 
    } 
}

/*
Time Complexity O(n)
Space Complexity O(n)
*/



