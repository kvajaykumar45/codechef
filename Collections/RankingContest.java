/*
​ RANKING CONTEST
You are given a list of N contestants who participated in a contest. For each contestant, you are given their Name, the number of problems Solved, and their total Penalty.

The final rank list is determined using the following rules:
    • Higher solved count: A contestant with more solved problems ranks higher. 
    • Lower penalty: If two contestants have solved the same number of problems, the one with a smaller penalty ranks higher. 
    • Lexicographical order: If both solved count and penalty are equal, the contestant whose name is lexicographically smaller ranks higher. 

After sorting all contestants, you need to answer Q queries. For each query, given a rank K, determine the name of the contestant at rank K (1-indexed).
​
Input Format
    • The first line of input contains a single integer N — the number of contestants. 
    • The next N lines each contain a string Namei, an integer Solvedi, and an integer Penaltyi. 
    • The next line contains a single integer Q — the number of queries. 
    • The next line contains Q space-separated integers K1,K2,…,KQ — the ranks requested. 

Output Format
Print Q space-separated strings (or each on a new line), representing the names of the contestants at the given query ranks.

Input
4
Alice 5 400
Bob 5 380
Charlie 4 200
David 5 400
3
1
2
4

Output
Bob
Alice
Charlie
*/

//Solution

import java.lang.*;
import java.util.*;
import java.io.IOException;
class Contestant
{
    String name;
    int penality;
    int problemssolved;
    Contestant(String name, int problemssolved, int penality)
    {
        this.name = name;
        this.problemssolved = problemssolved;
        this.penality = penality;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Contestant> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            String name = sc.next();
            int ps = sc.nextInt();
            int p = sc.nextInt();
            Contestant c = new Contestant(name, ps, p);
            players.add(c);
            
        }
        Collections.sort(players, (a,b)->
            {
                if(a.problemssolved != b.problemssolved)
                    return b.problemssolved - a.problemssolved;
                if(a.penality != b.penality)
                    return a.penality - b.penality;
                return a.name.compareTo(b.name);
                
            });
        int queries = sc.nextInt();
        for(int i=0; i<queries; i++)
        {
            int k = sc.nextInt();
            System.out.println(players.get(k-1).name);
        }
    }
}




/*
​Time Complexity
    1. Reading N contestants: O(N)
    2. Sorting contestants: O(N log N)
    3. Answering Q queries: O(Q)
So overall:
Time = O(N log N + Q)
The sorting dominates.
​
Space Complexity
We store all N contestants in an ArrayList:
Space = O(N)
​
Simple answer to remember
Time: O(N log N + Q)
Space: O(N)
The important part is that after sorting, list.get(K - 1) takes O(1).
*/


