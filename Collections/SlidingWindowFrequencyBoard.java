/*
            ​ SLIDING WINDOW FREQUENCY BOARD
You are given a window of maximum capacity W, which is initially empty. Whenever an element is pushed:
    • It is appended to the back of the window. 
    • If the window size exceeds W, the oldest element is automatically removed from the front. 
You need to process Q operations. The operations can be of four types:
    • PUSH x: Add the integer x to the window. 
    • FREQ x: Output the current frequency of x in the window. 
    • DISTINCT: Output the number of distinct values currently present in the window. 
    • TOP k: Output at most k distinct values currently present in the window, separated by spaces. 
The values should be ordered primarily by higher frequency.If two values have the same frequency, break ties by selecting the smaller numerical value.If the window is currently empty, print EMPTY.

Input Format
    • The first line of input contains two space-separated integers Q and W — the number of operations and the maximum window size, respectively. 
    • The next Q lines each contain a single operation in one of the formats described above (PUSH x, FREQ x, DISTINCT, or TOP k). 

Output Format
For each FREQ, DISTINCT, and TOP operation, print the required result on a new line.

Constraints
    • 1≤Q≤200000 
    • 1≤W≤200000 
    • −10^9≤x≤10^9 
    • The sum of k over all TOP queries does not exceed 200000. 
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int freq;
    int value;
    Node(int f, int v)
    {
        freq = f;
        value = v;
    }
}

class SlidingWindow
{
    Deque<Integer> list;
    HashMap<Integer, Integer> freq;
    TreeSet<Node> order; 
    int w;
    
    SlidingWindow(int size)
    {
        list = new ArrayDeque<>();
        freq = new HashMap<>();
        order = new TreeSet<>( (a,b)->{
            if(a.freq != b.freq)
                return Integer.compare(b.freq, a.freq);
            return Integer.compare(a.freq, b.freq);
        });
        w = size;
    }
    
    void push(int x)
    {
        if(list.size() == w)
        {
            int r =list.removeFirst();
            int oldfreq = freq.get(r);
            order.remove(new Node(oldfreq, r));
            if(oldfreq == 1)
            {
                freq.remove(r);
            }
            else
            {
                freq.put(r, oldfreq-1);
                order.add(new Node(oldfreq-1, r));
            }
        }
        list.addLast(x);
        int oldfreq = freq.getOrDefault(x,0);
        if(oldfreq > 0)
            order.remove(new Node(oldfreq, x));
        freq.put(x,oldfreq+1);
        order.add(new Node(oldfreq+1, x));
    }
    int freqy(int x)
    {
        return freq.getOrDefault(x, 0);
    }
    int distinct()
    {
        return freq.size();
    }
    List<Integer> top(int k)
    {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for(Node r: order)
        {
            result.add(r.value);
            count++;
            if(count == k)
                break;
        }
        return result;
        
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int w = sc.nextInt();
		SlidingWindow sw = new SlidingWindow(w);
		while(q-- > 0)
		{
		String operation = sc.next();
		if(operation.equals("PUSH"))
		{
		    int element = sc.nextInt();
		    sw. push(element);
		}
		else if(operation.equals("FREQ"))
		{
		    int element = sc.nextInt();
		    int f = sw.freqy(element);
		    System.out.println(f);
		}
		else if(operation.equals("DISTINCT"))
		{
		    int d = sw.distinct();
		    System.out.println(d);
		}
		else if(operation.equals("TOP"))
		{
		    int k = sc.nextInt();
		    List<Integer> list = sw.top(k);
		    for(int each: list)
		        System.out.println(each+" ");
		}
		}
	}
}


/*
    • Q = number of operations
    • W = window size
    • K = number of elements requested across TOP operations
Time Complexity
​PUSH
Each PUSH does:
    • Deque.addLast() → O(1)
    • If window is full, removeFirst() → O(1)
    • HashMap.get/put/remove() → O(1) average
    • TreeSet.remove() → O(log W)
    • TreeSet.add() → O(log W)
So: PUSH = O(log W)
​
FREQ
freq.getOrDefault(x, 0)
O(1) average.
​
DISTINCT
freq.size()
O(1).
​
TOP k
You iterate through at most k nodes:
O(k)
​
Overall
There are Q operations, and the sum of all k values is at most 200000.

Therefore:
Overall Time = O(Q log W + Σk)
Given the constraint Σk ≤ Q roughly, this can be expressed as:
O(Q log W)
​
Space Complexity
You maintain:
    1. Deque → at most W elements → O(W)
    2. HashMap → at most W distinct elements → O(W)
    3. TreeSet → at most W distinct elements → O(W)

Therefore: Space = O(W)

Simple memory:
Time → O(Q log W)
Space → O(W)

*/
