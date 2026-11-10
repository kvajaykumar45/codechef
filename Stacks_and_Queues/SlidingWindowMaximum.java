/*
Sliding Window Maximum

You are given an array A consisting of N integers and an integer X.

Find the maximum element in each subarray of size X.
Print (N−X+1) space-separated integers where the ithith integer denotes the maximum element of the ith subarray of size X from left.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of multiple lines of input.
1. The first line of each test case contains two space-separated integers NN and XX — the number of elements in the array and the size of subarrays.
2. The next line contains NN space-separated integers, the elements of array AA.

Output Format
For each test case, output on a new line, the maximum element in each subarray of size X.
Print (N−X+1) space-separated integers where the ithith integer denotes the maximum element of the ith subarray of size X from left.

Constraints
1≤T≤100
1≤X≤N≤10^5
1≤Ai​≤10^9
The sum of N over all test cases won't exceed 2⋅10^5

Subtasks
Subtask 1 (30 points): 1≤X≤N≤1000
Subtask 2 (70 points): Original Constraints.

Input:
3
4 2
1 2 3 4
4 3
4 3 2 1
3 1
9 7 10

Output:
2 3 4
4 3
9 7 10

Explanation:

Test case 1: For the array A=[1,2,3,4]:

    The maximum element in the subarray [1,2] is 2.
    The maximum element in the subarray [2,3] is 3.
    The maximum element in the subarray [3,4] is 4.

Note that the subarrays are traverses from left to right.

Test case 2: For the array A=[4,3,2,1]:

    The maximum element in the subarray [4,3,2] is 4
    The maximum element in the subarray [3,2,1] is 3.

Test case 33: For the array A=[9,7,10]:

    The maximum element in the subarray [9] is 9
    The maximum element in the subarray [7] is 7
    The maximum element in the subarray [10] is 10
*/





