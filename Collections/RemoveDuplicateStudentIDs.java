/*
​ REMOVE DUPLICATE STUDENT IDS
A college stores student IDs in a list. Some IDs appear multiple times due to data entry mistakes.

Given N student IDs, print the number of unique student IDs.
​
Input Format
    • First line contains an integer N 
    • Second line contains N space-separated integers. 

Output Format
Print the count of unique IDs.

Input
8
10 20 30 10 20 40 50 50

Output
5
*/

//Solution
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<n; i++)
            hash.add(sc.nextInt());
        System.out.println(hash.size());
    }
}

/*
Time Complexity: n * O(1) 
Space Complexity: O(n)
*/
