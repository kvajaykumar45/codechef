/*
NO DOUBLE TROUBLE
You're working on a music streaming app where users often add songs to their playlists multiple times. Your job is to clean up a user's playlist by removing duplicate song titles, keeping only the first occurrence of each song — and you must use the Java Collections Framework to do this efficiently.
Given a list of song titles (strings), remove duplicates while preserving the original order, using Java Collections Framework classes.

Input Format
    • The first line contains an integer N — the number of songs in the playlist. 
    • The next N lines each contain a song title (a string with no spaces). 

Output Format
    • Print the cleaned-up playlist, one song title per line, in the original order, but with duplicates removed. 
    • Titles contain only alphanumeric characters, no spaces. 

Constraints
    • 1 <= N <= 10^4 


Input
6
ShapeOfYou
BlindingLights
ShapeOfYou
Levitating
Peaches
Levitating

Output
ShapeOfYou  
BlindingLights  
Levitating  
Peaches

Explanation:
One can use HashSet, but there is an important point:
HashSet removes duplicates, but does not preserve insertion order.
Since the problem explicitly says "preserving the original order", a plain HashSet is not the best choice.

Best choice: LinkedHashSet
LinkedHashSet is specifically useful here because it:
    • Removes duplicates 
    • Preserves insertion order 
    • Uses the Java Collections Framework 
    • Has approximately O(1) insertion/lookup
*/

//Solution
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashSet<String> songs = new LinkedHashSet<>();
		for(int i=0; i<n; i++)
		    songs.add(sc.next());
		for(String song: songs)
		    System.out.println(song);
	}
}

/*
Complexity	Value
Time		O(N) average
Space		O(N)

*/

