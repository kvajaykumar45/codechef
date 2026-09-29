/*
NEAREST GREATER SCORE
Given an array A containing the scores of N students, find the nearest previous score that is strictly greater than the current student's score for each student in the array.

More formally, for each student i (1≤i≤N), find the element Aj such that:
    • j < i 
    • Aj > Ai
    • j is as large as possible. 

If no such previous score exists, output -1 for that student.

Input Format
    • The first line of input contains a single integer N — the number of students. 
    • The second line contains N space-separated integers A1,A2,…,AN — representing the scores of the students. 

Output Format
Print N space-separated integers, where the i-th integer represents the nearest previous score strictly greater than Ai. If no such score exists, print -1.

Constraints
    • 1 ≤ N ≤ 2⋅10^5 
    • 1 ≤ Ai ≤ 10^9 
*/

//Solution

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        System.out.println(-1);
        for(int i=1; i<n; i++){
            int j;
            for(j=i-1; j>=0; j--){
                if(a[j] > a[i]){
                    System.out.println(a[j]);
                    break;
                }
            }
            if(j < 0)
                System.out.println(-1);
        }
    }
}
//This Solution runs in O(n^2) time

//Stack Based Solution

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        int stk[] = new int[n];
        int top = -1;
        for(int i=0; i<n; i++)
        {
            while(top!=-1 && stk[top] <= a[i])
                    top--;
            if(top == -1)
                System.out.println(-1);
            else
                System.out.println(stk[top]);
            
            top++;
            stk[top] = a[i];
            
        }
    }
}
//This solution runs in O(n) time
