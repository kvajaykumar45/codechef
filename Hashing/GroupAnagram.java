/*

​ GROUP ANAGRAM
You are given N strings consisting of lowercase English letters. Two strings are called anagrams if they contain the same characters with the same frequency, possibly in a different order. Your task is to group all anagrams together.

Input Format
    • The input consists of multiple lines. 
        ◦ The first line contains a single integer N , the number of strings. 
        ◦ The next N lines each contain one string consisting of lowercase English letters. 

Output Format
    • Print the grouped anagrams. 
        ◦ Print each group on a new line in order of first occurrence. 
        ◦ Print words of a group in their original order, separated by a single space. 

Constraints
    • 1≤N≤100000 
    • 1≤∣Si∣≤100 
    • All strings contain only lowercase English letters. 

Input
6
eat
tea
tan
ate
nat
bat

Output
eat tea ate
tan nat
bat
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
		for(int i=0; i<n; i++)
		{
		    String str = sc.next();
		    char a[] = str.toCharArray();
		    Arrays.sort(a);
		    String key = new String(a);
		    if(!map.containsKey(key))
		        map.put(key, new ArrayList<>());
		    map.get(key).add(str);
		}
		for(String group: map.keySet())
		{
		    ArrayList<String> words = map.get(group);
		    for(String each: words)
		        System.out.print(each+" ");
		    System.out.println();
		}
	}
}
/*
let:
    • N = number of strings
    • L = maximum length of a string (≤ 100)

Time Complexity
For each string:
    1. Convert string to character array → O(L)
    2. Sort characters → O(L log L)
    3. Create the key → O(L)
    4. HashMap/LinkedHashMap operations → approximately O(1) average
    5. Add string to ArrayList → O(1) amortized
So for N strings: Time = O(N × L log L)
Since L ≤ 100, this is effectively quite manageable for N = 100000.

Space Complexity
We store:
    • All N original strings
    • All the sorted keys
    • All the ArrayLists containing the strings
So:
Space = O(N × L)
Additionally, sorting each string uses temporary space, but the main storage is the map.
​
Simple memory trick
Sorting each string → O(N × L log L)
Storing all strings → O(N × L)

For your constraints, the final answer is:
Time  : O(N × L log L)
Space : O(N × L)
If all strings have roughly the same length L, these are the cleanest complexities to state.

*/
