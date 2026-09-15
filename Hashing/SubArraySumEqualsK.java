/*
​ SUBARRAY SUM EQUALS K

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k. A subarray is a contiguous non-empty sequence of elements within an array.
​
 Function Declaration
​ Function Name
subarraySum – This function computes the total number of continuous subarrays whose sum is exactly equal to k.
​
 Parameters
    • nums : An array of integers of length n, representing the input array. 
    • n : An integer representing the size of the array. 
    • k : An integer representing the target sum. 

Return Value
Returns a single integer — the total number of continuous subarrays whose sum equals k. If no such subarray exists, the function returns 0.
​
 Constraints
    • 1 ≤ N ≤ 2∗10^4 
    • −1000 ≤ nums[i] ≤ 1000 
    • −10^7 ≤ k ≤ 10^7 

Input Format
    • The first line contains n the length of an array. 
    • The second line contains an array of length n 
    • The third line contains an integer representing the target sum. 

Output Format
    • Output the total number of subarrays whose sum equals to k. 

Input
3
1 1 1
2

Output
2

Input
3
1 2 3
3
Output
2

*/

//Iterative Solution: This run in O(n^2) time

public int subarraySum(int[] nums, int n, int k) {
    int count = 0;
    for(int i=0; i<n; i++)
    {
        int sum = 0;
        for(int j=i; j<n; j++)
        {
            sum = sum + nums[j];
            if(sum == k)
                count++;
        }
    }
    return count; 
}



//Hash Based Solution: This runs in O(n) time

public int subarraySum(int[] nums, int n, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0,1);
    int count = 0;
    int sum = 0;
    for(int i=0; i<n; i++)
    {
        sum += nums[i];
        int d = sum - k;
        if(map.containsKey(d))
            count+= map.get(d);
        map.put(sum, map.getOrDefault(sum, 0)+1);
    }
    return count; 
}

