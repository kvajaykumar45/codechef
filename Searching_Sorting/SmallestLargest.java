/*
FIND SMALLEST AND LARGEST NUMBERS
Given an array of integers, your task is to find the smallest (minimum) and largest (maximum) elements present in the array.

Function Declaration

Function Name
findMinMax – This function scans the array to determine both the minimum and maximum values.

Parameters
    • n : An integer representing the number of elements in the array. 
    • arr : A list/array of n integers. 

Return Value
    • Returns a pair/list/array containing exactly two integers: the first element should be the smallest value, and the second element should be the largest value. 

Constraints
    • 1≤ n ≤10^5 
    • −10^9 ≤ arr[i] ≤ 10^9 
The input and output formats provided below are only for testing with custom inputs. You only need to complete the core logic function.

Input Format
    • The first line contains an integer n, representing the size of the array. 
    • The second line contains n space-separated integers, representing the elements of the array. 

Output Format
    • Print the smallest and largest elements in the array on a single line, separated by a space. 

Sample 1:
Input
10
4 3 53 13 2 44 55 35 56 34
Output 2 56 

Explanation:
In the given array [4 3 53 13 2 44 55 35 56 34]:
The smallest element is 2.
The largest element is 56.
Therefore, the output is 2 56.

*/

//Java Solution:

class Solution {
    public int[] findMinMax(int n, int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        return new int[]{min, max};
    }
}

/*
Time: O(n) 
Space: O(1)
*/
