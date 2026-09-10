/*
​ FREQUENCY GREATER THAN K
Given a string S and an integer, K. Write a program to print characters with frequency greater than or equal to K in sorted order.
​
Input Format
    • The first line contains two integers: N and K. 
    • The second line contains the string S. 

Output Format
Output the characters with frequency greater than or equal to K.
​
Constraints
    • 2 ≤ length(S) ≤ 10^5 
    • 1 ≤ K ≤ 10^5 
    • S can have both upper and lowercase letters 

Input 1
10 3
aaabbcdddd

Output 1
ad

Input 2
10 2
aaAbBcdDdD

Output 2
Dad
*/
//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		HashMap<Character, Integer> h = new HashMap<>();
		for(char ch : s.toCharArray())
		{
		    h.put(ch, h.getOrDefault(ch, 0) + 1);
		}
		ArrayList<Character> a = new ArrayList<>();
		for(char ch: h.keySet())
		{
		    if(h.get(ch) >= k)
		        a.add(ch);
		}
		Collections.sort(a);
		for(char ch:a)
		    System.out.print(ch);
	}
}
/*
Let:
    • n = length of the string s
    • m = number of distinct characters in s
    • Since characters are char, m ≤ 26 if the input contains only lowercase English letters.

Time Complexity

Let's go line by line: 

for(char ch : s.toCharArray())	Visits all n characters.		Time = O(n)
for(char ch: h.keySet())		Visits m distinct characters.	Time = O(m)
Collections.sort(a);		There are at most m characters in a.	Time = O(m log m)

Therefore:	Total:	O(n+m+mlog⁡m)

Since m ≤ n, this can be simplified to:	O(n+mlog⁡m)

​
Space Complexity
HashMap stores m distinct characters:	
HashMap<Character, Integer> h	-->  O(m)

ArrayList also stores at most m characters:
ArrayList<Character> a 	-->	O(m)

toCharArray() creates a character array of size n:
s.toCharArray() 	--> 	O(n) temporary space.

So overall:	O(n+m)
Since m ≤ n:	O(n)	
*/
