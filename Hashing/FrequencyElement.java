/*
​ FREQUENCY OF ELEMENTS USING HASHING
You are given an integer N and an array containing N integers. For each element in the array, you have to output its frequency in the array using Hashing. The frequency of an element in the array tells how many times it occurs in the array.
​
Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of multiple lines of input. 
        ◦ The first line of each test case contains one integer N denoting the number of elements in the array. 
        ◦ The next line contains N space separated integers, denoting the elements in the array. 

Output Format
For each test case, output N space separated integers denoting the frequency of each element of the array.
​
Constraints
    • 1 ≤ N ≤ 10^5 
    • 1 ≤ max(A) ≤ 100 

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
//Solution
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t-- > 0) {
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		    a[i] = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
		    if(map.containsKey(a[i]))
		        map.put(a[i], map.get(a[i]) + 1);
		    else
		        map.put(a[i], 1);
		}
		for(int i=0; i<n; i++) {
		    System.out.print(map.get(a[i])+" ");
		}
		System.out.println();
		}
}
}

/*
Complexity		Value
Time			O(n) average
Space			O(n)
*/



