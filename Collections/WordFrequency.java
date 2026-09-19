/*
​ FREQUENCY OF WORDS
Given N words, print the frequency of every distinct word in the order of its first appearance.
​
Input Format
    • First line contains integer N. 
    • Second line contains N space-separated words. 

Output Format
For every distinct word, print wordfrequency

Input:
8
apple mango apple banana mango apple orange banana

Output:
apple 3
mango 2
banana 2
orange 1
*/

//Solution
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String x = new String();
        for(int i=0; i<n; i++){
            x = sc.next();
            if(map.containsKey(x))
                map.put(x, map.get(x)+1);
            else
                map.put(x, 1);
        }
        for(String key: map.keySet())
            System.out.println(key+" "+map.get(key));
    }
}

/*
For N words:
​Time Complexity: O(N)
    • We read each word once → O(N)
    • LinkedHashMap insertion/update → O(1) average
    • Printing all distinct words → at most O(N)
So overall:	Time = O(N)
​ 
​Space Complexity: O(N)
In the worst case, all N words are different, so the map stores N words. Space = O(N)
*/

