/*
​ SUBSET SUM PROBLEM
You have N positive integers ith integer begin Ai, and a number X. Return all the subsets of these N integers such that the sum of the integers (in the subset) is equal to X.
​ Input Format
    • The first contains a two integers N and X, denoting the length of array A and the target sum value. 
    • The second line of each test case contains N space-separated integers A1,A2,…,AN — denoting the array A. 
Output Format
Return the list of all the subset of integers which fulfil the target sum value.
Input
5 4
1 1 2 3 4
Output
1 1 2 
1 3 
1 3 
4 
*/

//Solution

import java.util.*;

class main {
    static List<List<Integer>> subsetSum(int[] a, int x) {
        List<Integer> subset = new ArrayList<>(); // Creating an empty subset
        List<List<Integer>> ans = new ArrayList<>(); // To store all the subsets

        generate(a, 0, x, 0, subset, ans);

        return ans;
    }
    static void generate(int[] a, int index, int x, int sum, List<Integer> subset, List<List<Integer>> ans)
    {
        if(sum == x) // subset found
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        if(sum > x) //if subset sum > X
            return;
        
        if(index == a.length)
            return; 
        
        subset.add(a[index]);
        sum = sum+a[index];
        generate(a, index+1, x, sum, subset, ans);
        
        subset.remove(subset.size()-1);
        sum = sum - a[index];
        generate(a, index+1, x, sum, subset, ans);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        List<List<Integer>> subsets = subsetSum(a, x);
        for (List<Integer> subset : subsets) {
            Collections.sort(subset);
        }
        subsets.sort(Comparator.comparing(Object::toString));

        for (List<Integer> subset : subsets) {
            for (int val : subset) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

//Note: Take → Explore → Undo → Skip → Explore

/*

For our backtracking solution: A = [1, 1, 2, 3, 4] There are N elements.
​
Time Complexity: O(2^N)  Why?
For every element, we have 2 choices:
Take it    OR  Don't take it
So:
1 element → 2 choices
2 elements → 2 × 2 = 4
3 elements → 2 × 2 × 2 = 8
...
N elements → 2^N
Therefore:  Time = O(2^N)
​
Simple example
If N = 5:  2^5 = 32
So the recursion can explore up to about 32 different choices/subsets.

Space Complexity
There are two things to consider.
​
1. Recursion stack
At most we go through all N elements:
index 0
  ↓
index 1
  ↓
index 2
  ↓
...
index N
So recursion uses: O(N)
​
2. Current subset
The subset list can contain at most N elements: O(N)
So the working space is: O(N)
But ans stores all answers

This is important.
There can be many valid subsets—potentially up to 2^N. So if we include the memory required to store the output: 	
Space = O(2^N × N)
because there can be 2^N subsets, and each subset can contain up to N elements.

For interviews/exams
You can remember it like this:
Complexity			Answer
Time				O(2^N)
Auxiliary Space		O(N)
Including output		O(N × 2^N)
*/


