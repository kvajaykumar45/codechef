/*
​ BACKTRACKING - UNIQUE COMBINATIONS SUM
You are given an array A consisting of N and a target sum B. Find the list of all unique combinations of the elements of A, such that the sum of the chosen elements equals B.
Note:
    • The same element may be chosen from the array A any number of times. 
    • Two combinations are unique if the frequency of at least one of the chosen elements is different. 

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of two lines of input: 
        ◦ The first line of each test case contains two integers N and B - the size of the array and target sum, respectively. 
        ◦ The second line contains N space-separated integers - the array A. 

Output Format
For each test case, output M+1 lines, where M is the number of unique combinations:
    • The first line contains a single integer M. 
    • The next M lines contains a combination of space-separated elements of A which sums to B. 
Note:
    • Elements in a combination (C1, C2, …, Ck) must be printed in non-descending order, i.e., (C1 ≤ C2 ≤ … ≤ Ck). 
    • The combinations must be printed in lexicographically increasing order. We say that combination X is lexicographically smaller than Y if either X is a prefix of Y or there exists an index i such that for all j<i, Xj=Yj and Xi < Yi. 

Constraints
    • 1 ≤ T ≤ 10 
    • 1 ≤ N ≤ 20 
    • 1 ≤ Ai ≤ 20 
    • 1 ≤ B ≤ 20 

Input
3
2 2
2 3
3 8
2 3 5
3 7
2 3 6

Output
1
2
3
2 2 2 2
2 3 3
3 5
1
2 2 3
​*/
/* 
​The backtracking idea
At every position we have two choices:
    1. Take the current element 
        ◦ Since reuse is allowed, stay at the same index. 
    2. Skip the current element 
        ◦ Move to the next index
Your final logic is:
    1. Sort the array. 
    2. Remove duplicate values. 
    3. Backtrack: 
        ◦ Take → stay at same index 
        ◦ Undo 
        ◦ Skip → move to next index 
    4. Store each combination when sum == target. 
    5. Because the array is sorted, combinations naturally come in lexicographical order.

*/

/*
For your Unique Combinations Sum solution:
​
Time Complexity: O(2ᴺ)
At each element, we have two choices:
    • Take it
    • Skip it
So the recursion can explore roughly 2ᴺ possibilities.
Since N ≤ 20, this is manageable.
​
Space Complexity: O(B) recursion + output
Because every element is at least 1, a combination can contain at most B elements.
So the recursion depth is at most: B
Therefore auxiliary space is: O(B)
But we also store all valid combinations, so including the output: O(B × M)
where M = number of valid combinations.

Simple answer for students
Time: O(2ᴺ)
Space: O(B) excluding output, O(B × M) including output.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> generateCombinations(int[] a, int sum)
    {
        result.clear();
        generate(a, 0, 0, sum, new ArrayList<>());
        return result;
    }
    public static void generate(int[] a, int index, int sum, int target, List<Integer> subset)
    {
        if(sum == target)
        {
            result. add(new ArrayList<>(subset));
            return;
        }
        if(index == a.length || sum>target)
        {
            return;
        }
        subset.add(a[index]);
        generate(a, index, sum+a[index], target, subset);
        subset.remove(subset.size()-1);
        generate(a, index+1, sum, target, subset);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int b = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++)
		        a[i] = sc.nextInt();
		
		Arrays.sort(a);
		int m=0;
		for(int i=0; i<a.length; i++)
		{
		    if(i==0 || a[i] != a[i-1])
		        a[m++] = a[i];
		}
		int unique[] = Arrays.copyOf(a,m);
		List<List<Integer>> result = generateCombinations(unique, b);
		System.out.println(result.size());
		for(List<Integer> out: result)
		{
		    for(int i: out)
		    System.out.print(i+" ");
		
		System.out.println();
		}
		}
	}
}
