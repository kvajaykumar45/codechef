/*
PRESERVE FIRST OCCURRENCE

Given an array of integers, remove duplicate values while preserving their first occurrence.
Print the resulting sequence.

Input Format
    • First line contains an integer N
    • Second line contains N space-separated integers.

Output Format
Print the elements after removing duplicates while maintaining insertion order.

Input
8
5 2 5 3 2 8 8 1

Output
5 2 3 8 1
*/

//Solution

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hash = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++)
        {   
            int x = sc.nextInt();
            if(hash.add(x))
            {
                list.add(x);
            }
        }
        for(int x: list)
            System.out.println(x);
    }
}

/*
Operation			Time			Space
Process all elements		O(N) average		O(K)
Store result			O(K)			O(K)
Overall			O(N) average		O(K)
*/
//Solution 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        for(int i=0; i<n; i++)
        {   
            int x = sc.nextInt();
            hash.add(x);
        }
        for(int x: hash)
            System.out.println(x);
    }
}

/*
Approach		Time		Space	Maintains order	Recommended
HashSet + ArrayList	O(N) avg	O(K)	✅		⭐⭐⭐⭐
LinkedHashSet		O(N) avg	O(K)	✅		⭐⭐⭐⭐⭐
ArrayList.contains()	O(N²)		O(K)	✅		⭐⭐
Boolean array		O(N)		O(M)	✅		⭐⭐⭐⭐ if range is small
*/


