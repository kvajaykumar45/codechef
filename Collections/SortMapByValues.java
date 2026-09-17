/*
            ​ SORT A MAP BY VALUES

You’re working on a leaderboard feature for a quiz app. The scores of users are stored in a HashMap<String, Integer>, where the key is the username and the value is their score.

Your task is to write a program that sorts this map by values in descending order (i.e., highest score first), and prints each key-value pair on a new line in the format: username: score

Input Format
    • First line: An integer N, the number of entries in the map. 
    • Next N lines: Each line contains a username and score, separated by a space. 
​
Output Format
    • Print the sorted key-value pairs (by score descending), one per line, in the format:
username: score 
​
Constraints
    • 1 <= N <= 1000 
    • username contains only lowercase letters and no spaces. 
    • 0 <= score <= 10^6 
    • No duplicate usernames. 

Input
4
alice 250
bob 450
carol 300
dave 400

Output
bob: 450
dave: 400
carol: 300
alice: 250

*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++){
		    String uname = sc.next();
		    int score = sc.nextInt();
		    map.put(uname, score);
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet()); 
		list.sort((a,b) -> b.getValue() - a.getValue());
		for(Map.Entry each: list)
		    System.out.println(each.getKey()+": "+each.getValue());
	}
	}
/*
​Time Complexity: O(NlogN)
    1. Reading Input: Inserting N elements into the HashMap takes O(N) time on average. 
    2. Converting to List: Creating the ArrayList from the map's entry set takes O(N) time. 
    3. Sorting: Sorting the list of N entries using a custom comparator takes O(NlogN) time. 
    4. Printing: Iterating through the sorted list and printing the N elements takes O(N) time. 
The dominant term is the sorting step, making the overall time complexity O(NlogN).
​
Space Complexity: O(N)
    1. HashMap: Stores N key-value pairs, which takes O(N) space. 
    2. ArrayList: Stores N map entries for sorting, which also takes O(N) space. 
Thus, the overall space complexity is O(N).
*/


