

/*
BINARY SEARCH USING RECURSION
You are given a sorted array of integers A and a target integer X. Create a recursive function to perform binary search and determine the index of X in the array. If there are multiple occurences of X, print the minimum index. If the element is not present in the array, return −1.

Input Format
    • The first line of input contains a single integer T, denoting the number of test cases. 
    • Each test case consists of two lines of input: 
        ◦ The first line contains two space separated integers, N and X, the number of elements in the array and the element to be searched. 
        ◦ The second line contains N space-separated integers. 

Output Format
    • Print the 0 based index of the element X if found. 
    • Print −1 if the element is not present. 

Constraints
    • 1 ≤ T ≤ 2000 
    • 1 ≤ N ≤ 10^5 
    • 1 ≤ Ai ≤ 10^9 
    • The array is sorted in ascending order. 

Input:
2
10 14
4 7 9 11 11 11 11 12 14 17
8 19
3 3 5 8 9 10 14 18

Output
8
-1
*/

//Solution
// Recursive function to find the minimum index of X
public static int findFirstOccurrence(int[] a, int low, int high, int x, int res) {
    // The initial values passed to this function from main are: 
    // low: 0, 
    // high: n-1 (last index of array 'a')
    // res: -1
    if(low > high)
        return res;
    int mid = low + (high - low)/2;
    
    if(a[mid] == x)
    {
        res = mid;
        return findFirstOccurrence(a, low, mid-1, x, res);
    }
    if(a[mid] < x)
        return findFirstOccurrence(a, mid+1, high, x, res);
    
    return findFirstOccurrence(a, low, mid-1, x, res);
}

/*
Time Complexity: O(logn)
Space Complexity: O(logn) for Recursive Stack Space
*/
