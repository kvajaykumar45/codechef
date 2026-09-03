/*
​ PRINT STUDENTS IN ALPHABETICAL ORDER
Given names of students, print all unique names in alphabetical order.
​
Input Format
    • First line contains integer N. 
    • Next N lines contain one student name. 

Output Format
Print unique names in sorted order.

Input
6
Raj
Aman
Rahul
Raj
Aman
Zoya

Output
Aman
Rahul
Raj
Zoya
*/
//Solution 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> h = new HashSet<>();
        for(int i=0; i<n; i++)
            h.add(sc.next());
        ArrayList<String> k = new ArrayList<>(h);
        Collections.sort(k);
        for(String s: k)
            System.out.println(s);
        
    }
}

/*
Operation					Complexity
Reading N names and adding to HashSet		O(N) average
Copying HashSet to ArrayList			O(U)
Collections.sort(k)				O(U log U)
Printing U names				O(U)


Complexity			Result
Time Complexity		O(N log N) worst case
Space Complexity		O(N) worst case
*/

//Solution 2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<String> t = new TreeSet<>();
          for(int i=0; i<n; i++)
            t.add(br.readLine());
            for(String s:t)
            System.out.println(s);
    }
}

/*
Time Complexity: O(N log N)
Space Complexity: O(N)

*/
