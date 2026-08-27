/*
FREQUENCY OF EACH ELEMENT IN THE ARRAY
You are given an integer N and an array containing N integers. For each element in the array you have to output it's frequency in the array. Frequency of an element in the array tells how many times it occurs in the array. Iterate over each element in the array and count the frequency of that element using another loop then print the frequency for each element in the array.
Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of multiple lines of input. 
        ◦ The first line of each test case contains one integer N denoting the number of elements in the array. 
        ◦ The next line contains N space separated integers, denoting the elements in the array. 
Output Format
For each test case, output N space separated integers denoting the frequency of each element of the array.
Constraints
    • 1≤T≤100 
    • 1≤N≤100 
    • 1≤Ai≤10 
Input
3
10
1 2 1 2 1 3 4 1 2 3
5 
1 1 1 1 1
5
1 2 1 2 1
Output
4 3 4 3 4 2 1 4 3 2
5 5 5 5 5
3 2 3 2 3
*/

// Java Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    HashMap<Integer, Integer> h = new HashMap<>();
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++)
		    {
		        a[i] = sc.nextInt();
		        if(h.containsKey(a[i]))
		            h.put(a[i], h.get(a[i]) + 1);
		        else
		            h.put(a[i],1);
		    }
		    for(int i=0; i<n; i++)
		    {
		        System.out.print(h.get(a[i]) + " ");
		    }
		    System.out.println();
		    t--;
		    
		}

	}
}

/*
Let's analyze your code carefully.
Time Complexity
For each test case:
1. Reading the array + building HashMap
for(int i = 0; i < n; i++)
{
    a[i] = sc.nextInt();

    if(h.containsKey(a[i]))
        h.put(a[i], h.get(a[i]) + 1);
    else
        h.put(a[i], 1);
}
A HashMap operation such as:
    • containsKey() → average O(1)
    • get() → average O(1)
    • put() → average O(1)
So this loop takes: O(n)

2. Printing frequencies
for(int i = 0; i < n; i++)
{
    System.out.print(h.get(a[i]) + " ");
}
Again, get() is average O(1).
Therefore: O(n)

Total time
O(n) + O(n)
= O(n)
So for one test case:
Time = O(n) average

For t test cases:
Time = O(n₁ + n₂ + ... + nₜ)
If every test case has approximately n elements:
Time = O(t × n)

Space Complexity
You have: int a[] = new int[n];
So the array requires: O(n)

The HashMap stores each distinct element and its frequency.
If there are k distinct elements:
HashMap = O(k) 
Since: k <= n the worst case is: O(n)

Therefore total auxiliary space is:
O(n) + O(k) = O(n)

Complexity 	Average
Time		O(n) per test case
Space		O(n)
One small point: technically, Java HashMap operations are average O(1), while their worst-case behavior can be higher due to collisions. For competitive-programming complexity analysis, we normally use O(n) average time here.
*/
