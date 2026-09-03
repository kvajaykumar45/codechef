/*
​ WORD FREQUENCY COUNTER

You’ve been assigned to build a simple analytics feature for a blogging platform. One of the most requested tools is a word frequency counter that shows how many times each word appears in a piece of text.

Your task is to implement a program that reads a block of text and outputs the frequency of each word, case-insensitively, using Java's HashMap from the Collections Framework.
    • Read a single line of text. 
    • Split the line into words using space as the delimiter. 
    • Convert all words to lowercase. 
    • Count the frequency of each word using a HashMap. 
    • Print each word and its frequency sorted alphabetically by word. 

Input Format
    • A single line of text T (words separated by spaces; no punctuation). 

Output Format
    • For each unique word, print a line in the format:
word: frequency
    • The output must be sorted alphabetically by word.

Constraints
    • 1 <= length of T <= 10^4 
    • Text contains only lowercase and uppercase letters and spaces. 

Input The cat chased the mouse and the cat ran away 

Output 
and: 1
away: 1
cat: 2
chased: 1
mouse: 1
ran: 1
the: 3
*/

//Solution 1 using TreeMap Class
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		String[] words = s.split(" ");
		TreeMap<String, Integer> h = new TreeMap<>();
		for(String each: words)
		    if(h.containsKey(each)) 
		        h.put(each, h.get(each)+1);
		    else
		        h.put(each, 1);
		for(String key: h.keySet())
		    System.out.println(key+": "+h.get(key));
	}
}



/*
Time Complexity O(NlogN)
Operation		Time Complexity
toLowerCase()			O(L)
split()			O(L)
Insert/count in TreeMap	O(N log K)
Print				O(K) using keySet()

Space Complexity
Memory is used by:
	String[] words O(N) / O(L)
​ 	TreeMap O(K)
Therefore: Space Complexity: O(N + K) 
Since K ≤ N, we usually simplify this to: O(N)
*/

//Solution 2 using HashMap


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		String[] words = s.split(" ");
		HashMap<String, Integer> h = new HashMap<>();
		for(String each: words)
		    if(h.containsKey(each)) 
		        h.put(each, h.get(each)+1);
		    else
		        h.put(each, 1);
		 ArrayList<String> keys = new ArrayList<>(h.keySet());
		 Collections.sort(keys);
		for(String key: keys)
		    System.out.println(key+": "+h.get(key));
	}
}

