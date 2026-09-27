/*
Wordle

Chef invented a modified wordle.

There is a hidden word SS and a guess word TT, both of length 55.

Chef defines a string MM to determine the correctness of the guess word. For the ithith index:

    If the guess at the ithith index is correct, the ithith character of MM is GG.
    If the guess at the ithith index is wrong, the ithith character of MM is BB.

Given the hidden word SS and guess TT, determine string MM.
Input Format

    First line will contain TT, number of test cases. Then the test cases follow.
    Each test case contains of two lines of input.
    First line contains the string SS - the hidden word.
    Second line contains the string TT - the guess word.

Output Format

For each test case, print the value of string MM.

You may print each character of the string in uppercase or lowercase (for example, the strings BgBgBBgBgB, BGBGBBGBGB, bgbGBbgbGB and bgbgbbgbgb will all be treated as identical).
Constraints

    1≤T≤10001≤T≤1000
    ∣S∣=∣T∣=5

    S,T contain uppercase english alphabets only.
Input:
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT


Output:
BBGBB
GBBBB
GGBBG


*/
//Java Solution


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
		String s = sc.next();
		String t1 = sc.next();
		StringBuilder result = new StringBuilder();
        for(int i=0; i<5; i++)
            if(s.charAt(i) == t1.charAt(i))
                result.append('G');
            else
                result.append('B');
        System.out.println(result);
		}
	}
}



