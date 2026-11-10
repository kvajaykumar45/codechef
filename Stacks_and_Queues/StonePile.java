/*
Stone Pile

Aman and Akshat are trying to solve a task given to them by their teacher. They are given a pile of stones containing NN stones with an integer written on each of them. There are two different kinds of moves that can be performed on the pile :

1.Player will remove a stone from the toptop of the pile and put it back on the bottombottom of the pile
2.Player will remove a stone from the toptop of the pile and throwthrow it away.

Aman in his turn will perform move 11 once and then move 22 once. Akshat in his turn will perform move 11 twice and then move 22 once.
They will stop making moves when there is only 11 stone left in the pile.
Both of them gets turn alternatively with Aman going first. Find the person performing the last move and the number written on the last stone left in the pile.
The stones at index i′th is located higher than the stones at index j′th , such that (i<j)

Input Format
    The first line contains an integer T, representing T Testcases.
    The first line of each test case contains an integer N, representing the size of Array A.
    The second line of each test case contains N integer, representing array A

Output Format
    For each test case, Print 2 space-separated integer representing the person making the last move (1 for Aman and 0 for Akshat) and the number written on the stone remaining.

Constraints
1≤T≤100
2≤N≤100000
−10^9≤Ai​≤10^9
Sum of N over all test cases does not exceed 10^6

*/

//Source Code

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    Queue<Integer> q = new ArrayDeque<>();
		    for(int i=0; i<n; i++)
		        q.offer(sc.nextInt());
		    
		    int turn = 0;
		    int element;
		    while(q.size() > 1)
		    {
		    if(turn == 0)
		    {
		        element = q.poll();
		        q.offer(element);
		        q.poll();
		        turn = 1;
		    }
		    else if(turn == 1)
		    {
		        element = q.poll();
		        q.offer(element);
		        
		        element = q.poll();
		        q.offer(element);
		        
		        q.poll();
		        turn = 0;
		    }
		    }
		    System.out.println(turn + " " + q.peek());
		}
	}
}



