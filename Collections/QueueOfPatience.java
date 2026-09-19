/*
​ QUEUE OF PATIENCE

There are N people standing in a queue. Each person has an integer patience value. Then Q operations are performed. Operations:
    • ENTER X : Insert person with patience X.
    • SERVE : Serve first person.
    • REMOVE X : Remove the first occurrence of patience X.

After every operation print the current average patience rounded down.
If queue becomes empty print EMPTY
​
Input Format
    • First line contains integer N, representing the initial number of people in the queue 
    • Second line consist of N space-separated integers A1,A2 …,AN, where Ai represents the patience value of the i-th person. 
    • Third Line contains a single integer Q, representing the total number of operations. 
    • Next Q lines: Each line contains a single operation 

Output Format
For every operation print the current average patience rounded down.
​
Constraints
    • 1 ≤ N,Q ≤ 2×10^5 

Approach
Initialize queue + sum
        ↓
ENTER  → add + increase sum
        ↓
SERVE  → poll + decrease sum
        ↓
REMOVE → remove first occurrence + decrease sum
        ↓
average = sum / size
*/

//Solution
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     Queue<Integer> q = new ArrayDeque<>();
     for(int i=0; i<size; i++)
        q.add(sc.nextInt());
    
    int sum = 0;
    for(int x: q)
        sum = sum + x;
    int avg = sum/size;
    
    int ops = sc.nextInt();
    while(ops-- > 0)
    {
        String operation = sc.next();
        if(operation.equals("SERVE"))
        {
            int x = q.poll();
            size--;
            sum = sum-x;
            if(size == 0)
                System.out.println("EMPTY");
            else
                System.out.println(sum/size);
            
        }
        else if(operation.equals("ENTER"))
        {
            int element = sc.nextInt();
            q.add(element);
            size++;
            sum = sum+element;
            System.out.println(sum/size);
        }
        else if(operation.equals("REMOVE"))
        {
            int element = sc.nextInt();
            boolean state = q.remove(element);
            if(state)
            {
            size--;
            sum = sum-element;
            if(size == 0)
                System.out.println("EMPTY");
            else
                System.out.println(sum/size);
            }
            else
                System.out.println(sum/size);
        }
    }
     }
}
​
/* 
​Time Complexity
    • Initial insertion of N elements → O(N)
    • Calculating initial sum → O(N)
    • ENTER → O(1)
    • SERVE (poll) → O(1)
    • Average calculation → O(1)
    • REMOVE X → O(N) because ArrayDeque searches for the first occurrence.
Therefore, for Q operations:
Worst case: O(N × Q) because every operation could potentially be REMOVE.
​
Space Complexity
The queue stores at most N + Q elements, because every ENTER can add an element.
So: Space = O(N + Q)
For the given constraints, that's O(N + Q), which is effectively O(N) if N and Q are of the same order.
*/


