/*
​ ARRAY INTERSECTION

	You are given three sequences A1,A2,…,AN, B1,B2,…,BM and C1,C2,…,CK. Each sequence consists of pairwise distinct integers. You need to find how many integers there are that appear in all three of the given sequences.
​
 Input Format
    • The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
    • The first line of each test case contains three space-separated integers N, M and K.
    • The second line contains N space-separated integers A1,A2,…,AN.
    • The third line contains M space-separated integers B1,B2,…,BM.
    • The fourth line contains K space-separated integers C1,C2,…,CK.

Output Format
    • For each test case, print a single line containing one integer ― the number of integers that appear in all three sequences. 

Constraints
    • 1≤T≤100 
    • 1≤N,M,K≤10^5 
    • the sum of N over all test cases does not exceed 10^5 
    • the sum of M over all test cases does not exceed 10^5 
    • the sum of K over all test cases does not exceed 10^5 
    • in each sequence, the numbers are pairwise distinct 
    • 1 ≤ Ai, Bi, Ci ≤ 10^9 for each valid i 

Subtasks
Subtask #1 (30 points):
    • T≤10 
    • N,M,K≤100 
    • the sum of N over all test cases does not exceed 200 
    • the sum of M over all test cases does not exceed 200 
    • the sum of K over all test cases does not exceed 200 

Subtask #2 (70 points): original constraints

Input
3
3 4 5
5 2 6
2 8 3 5
9 1 2 5 7
4 4 4
1 2 3 4
4 5 1 7
3 8 9 2
4 4 4
1 2 3 4
3 4 1 6
7 1 3 4

Output
2
0
3
*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    HashSet<Integer> a = new HashSet<>();
		    for(int i=0; i<n; i++)
		        a.add(sc.nextInt());
		    HashSet<Integer> ab = new HashSet<>();
		    for(int j=0; j<m; j++){
		        int x = sc.nextInt();
		        if(a.contains(x))
		            ab.add(x);
		    }       
		    HashSet<Integer> abc = new HashSet<>();
		    for(int i=0; i<k; i++){
		        int x = sc.nextInt();
		        if(ab.contains(x))
		            abc.add(x);
		    }
		    System.out.println(abc.size());
		}
	}
}



/*

    • n = number of elements in first set
    • m = number of elements in second set
    • k = number of elements in third set
​


Time Complexity
There are 3 main loops:
    1. Insert n elements into HashSet a → O(n) average
    2. Process m elements and a.contains(x) → O(m) average
    3. Process k elements and ab.contains(x) → O(k) average
So total: 	O(n + m + k) average time.
Why average? Because HashSet.add() and HashSet.contains() are O(1) average.
​

Space Complexity
You create three HashSets:
HashSet<Integer> a
HashSet<Integer> ab
HashSet<Integer> abc
Their maximum sizes are:
    • a → O(n)
    • ab → O(min(n, m))
    • abc → O(min(n, m, k))
Therefore: O(n + m + k) space in the worst case.
​
Simple way to remember
Complexity		Answer
Time			O(n + m + k) average
Space			O(n + m + k)

The important point is that although you have three HashSets, you are not doing nested loops. Each input is processed only once, which keeps the time linear.

*/

