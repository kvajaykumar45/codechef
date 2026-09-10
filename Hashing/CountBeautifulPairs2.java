/*
​ COUNT BEAUTIFUL PAIRS
You have an array A of N integers. A pair of indices (i,j) is called Beautiful if Ai=Aj2 and 1 ≤ i < j ≤ N. Count the number of Beautiful Pairs in the given array.
​ Task Use the Hash Function given in the IDE to index the Hash array.
​ Input Format
    • The first line of the input contains a single integer N, denoting the length of array A. 
    • The second line of the input contains N space-separated integers A1, A2,…,AN — denoting the array A. 
Output Format
	Single line that contains the count of beautiful pairs in the given array
Constraints
    • 2 ≤ N ≤ 10^5 
    • 1 ≤ Ai ≤ 10^9 
Input
4 
4 4 2 2
Output
4
*/
//Solution

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    static final int M = 999983;
    static final int MX = 1000000000;
    static int[] Hash = new int[M];
    // Hash Function
    static int f(int x) {
        return x % M;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        HashMap<Long, Integer> h = new HashMap<>();
        long count = 0;
        for(int i=0; i<n; i++)
        {
            long square = a[i] * a[i];
            count += h.getOrDefault(square, 0);
            h.put(a[i], h.getOrDefault(a[i], 0)+1);
        }
       System.out.println(count);
    }
}

/*
​Time Complexity: O(N) average
The loop runs N times:
for (int i = 0; i < n; i++)
Inside each iteration:
    • getOrDefault() → O(1) average
    • put() → O(1) average
    • square calculation → O(1)
Therefore:
O(N)
For N = 100,000, this is efficient.
​
Space Complexity: O(N)
The HashMap can store up to N distinct values.
HashMap<Long, Integer> h
Therefore: O(N)
The array:  long[] a = new long[n]; also uses O(N) space.
So overall: Space=O(N)
​ Summary
Component 				Complexity
Loop					O(N)
HashMap operations			O(1) average each
Time					O(N) average
Array					O(N)


HashMap				O(N)
Space					O(N)

One important point: your HashMap solution is O(N) average, but the problem's requirement to use the provided Hash[] means they probably expect a custom hash-table solution, which can also achieve O(N) average time with O(M) auxiliary space.
*/

//Desired Solution
import java.util.Scanner;

public class Main {
    static final int M = 999983;
    static final int MX = 1000000000;

    static int[] Hash = new int[M];

    // Hash Function
    static int f(int x) {
        return x % M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Write your code here
        long count = 0;
        int i; 
        for(i=0; i<n; i++)
        {
            long square = (long) a[i] * a[i];
            if(square <= MX) count += Hash[f((int)square)];
        
        int root = (int) Math.sqrt(a[i]);
        if(root* root == a[i])
            Hash[f(a[i])]++;
        }
        System.out.println(count);
    }
}
