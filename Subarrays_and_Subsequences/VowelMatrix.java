/*
THE VOWEL MATRIX

Welcome to The Mega City! Neo finds himself in a high-stakes situation. He has a string S of length N and his task is to crack the string using the vowel matrix. The vowel matrix is a unique cryptographic scheme where the string is sliced into multiple pieces, such that, each piece contains exactly K vowels.
Determine the number of ways you can slice the string S using vowel matrix scheme. Since the number can be huge, print it modulo 109+7.
Note:
    • The characters a, e, i, o, and u are considered vowels in lowercase english alphabets. 
    • It is guaranteed that S contains at least one vowel and the number of vowels in S is a multiple of K. 

Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of two lines of input. 
        ◦ The first line of each test case contains two space-separated integers N and K, the length of string and the number of vowels required in each piece of string. 
        ◦ The second line contains the string S, consisting of lowercase english letters. 

Output Format
For each test case, output on a single line, the number of ways you can slice the string S using vowel matrix scheme. Since the number can be huge, print it modulo 109+7.
            ​ Constraints
    • 1 ≤ T ≤ 10^4 
    • 1 ≤ N ≤ 10^6 
    • 1 ≤ K ≤ N 
    • The sum of N over all test cases won't exceed 10^6. 
    • It is guaranteed that the number of vowels in S is a multiple of K. 

Input
2 
3 1
neo
10 2
babylonian

Output
1
2

*/

//Solution
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
	        ArrayList<Integer> vowels = new ArrayList<>();
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        String s = sc.next();
	        for(int i=0; i<n; i++)
	        {
	            char ch = s.charAt(i);
	            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	                vowels.add(i);
	        }
	        long result = 1;
	        int index = k;
	        while(index < vowels.size())
	        {
	            result = (result * (vowels.get(index) - vowels.get(index-1)))%1000000007;
	            index += k;
	        }
	        System.out.println(result);
	    }
	}
}

/*
Time: O(n)
Space: O(n)
*/

