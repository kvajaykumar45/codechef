/*
REDUCE TO SINGLE ELEMENT ARRAY
You are given an array arr of N positive integers. In each move, you can pick two different numbers from the array where their absolute difference is at most one, and remove the smaller one. If two numbers are the same, you can remove either. Your goal is to determine if you can reduce the array to exactly one number using these moves.

Function Declaration

Function Name
canReduce – This function determines whether the array can be reduced to just one number based on the given rules.

Parameters
N : An integer representing the size of the array.
arr : An array of integers representing the given sequence.

Return Value
Returns a boolean: true if the array can be reduced to a single number, and false otherwise.

Constraints:
1≤N≤10^4
1≤arr[i]≤10^4
The input and output formats provided below are only for testing with custom inputs. You only need to return the value. Printing is handled automatically.
            ​ 
Input Format
    • The first line contains an integer N representing the size of arr. 
    • Next lines contain N integers that are present in arr. 

Output Format
    • Output "YES" if it's possible to reduce the array to one element, otherwise "NO". 

Sample 1:
Input
4
4 1 3 2
OutputYES

Explanation:
First of all pick elements 1 and 2 and remove 1 as it is smallest. Now pick 2 and 3 and remove 2 as it is smallest ,then pick 3 and 4 and remove 3 , now a single element is left so answer is YES.

Sample 2:
Input
3
1 3 4
Output NO

Explanation:
There is no way to reduce the array to a single element.
*/
//Java Solution:

public static boolean canReduce(int N, int[] arr) {
    Arrays.sort(arr);
    for(int i=0; i<N-1; i++)
    {
        if (( arr[i+1] - arr[i]) > 1)
            return false;
    }
    return true;
}

/*

Part			Complexity
Arrays.sort(arr)	O(N log N)
for loop		O(N)
Total Time		O(N log N)
Auxiliary Space		O(log N)

*/

