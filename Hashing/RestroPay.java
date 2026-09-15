/*
​ RESTROPAY

Tanny and Purgi are two very good friends. They went to a nice restaurant for some good dinner after a long taxing week. Tanny has n banknotes of value a1,a2,a3,a4,......,an dollars. Similarly Purgi has m banknotes of values b1, b2,b3,b4,........,bm dollars. Their bill came out to be C dollars. Is it possible for them to pay the bill if both of them can just pay with exactly 1 banknote?
​
Input Format
    • The first line will have 3 integers n,m,c separated by a space. 
    • The second and third line will contain the values of the banknotes Tanny and Purgi (separated by a space) respectively. 

Output Format
Output YES if it is possible to pay the bill using just 2 banknotes ( one from Purgi and one from Tanny). Else output NO.
​
Constraints
    • 1 ≤ n ≤ 10^5 
    • 1 ≤ m ≤ 10^5 
    • 1 ≤ c ≤ 2*10^9 
    • 0 ≤ ai, bi ≤ 10^9 

Subtasks
    • 30 points : 1 ≤ n,m ≤ 1000 
    • 70 points : 1 ≤ n,m ≤ 10^5 

Input
4 5 34 
1 2 3 4 
12 43 23 33 44 

Output
YES

​Explanation:
If Tanny pays a 1 dollar banknote and Purgi pays the 33 dollar banknote, they can pay the bill of 34 dollars.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        HashSet<Integer> a = new HashSet<>(); 
        HashSet<Integer> b = new HashSet<>();
        for(int i=1; i<=n; i++)
            a.add(sc.nextInt());
        for(int i=1; i<=m; i++)
            b.add(sc.nextInt());
        boolean flag = false;
        for(int i: a)
        {
            int diff = c-i;
            if(b.contains(diff))
            {
                System.out.println("YES");
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("NO");
	}
}
//Another Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        HashSet<Integer> a = new HashSet<>(); 
        
        for(int i=1; i<=n; i++)
            a.add(sc.nextInt());
        boolean flag = false;
        for(int i=1; i<=m; i++)
        {
            int x = sc.nextInt();
            if(a.contains(c-x))
            {
                flag = true;
              }
        }
        if(!flag)
            System.out.println("NO");
        else
            System.out.println("YES");
	}
}

/*
		Two Hashsets		One HashSet
Time		O(n + m)		O(n + m)
Space		O(n + m)		O(n)
*/

