/* 
            ​ ADD ONE
You are given a large number N. You need to print the number N+1.
Note: The number is very large and it will not fit in standard integer data type. You have to take the input as String and then manipulate the digits to convert it to N+1.
            ​ Input Format
    • The first line of the input contains a single integer T - the number of test cases. The description of T test cases follows.
    • The first line of each test case contains a single integer N.
Output Format
    • For each test case, print a single line string - the number N+1. 
Constraints
    • 1≤T≤100 
    • 1≤N≤10200000−1 
    • the sum of the number of digits of all N in a single test file does not exceed 4⋅105 
Subtasks
Subtask #1 (30 points):
    • each digit of the number N is at most 8 
Subtask #2 (70 points): original constraints

Input
6
99
17
1
599
10000000000000000000
549843954323494990404

Output
100
18
2
600
10000000000000000001
549843954323494990405

*/



// Java Solution (This solution has TLE Problem)
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
		    String n = sc.next();
		    String result = "";
		    int carry = 1;
		    
		    int i = n.length()-1;
		    while(i >= 0)
		    {
		        char digit = n.charAt(i);
		        int num = (digit - '0') + carry;
		        if(num == 10)
		        {
		            result = '0' + result;
		            carry = 1;
		        }
		        else
		        {
		            result = (char)(num + '0') + result;
		            carry = 0;
		        }
		        i--;
		    }
		    if(carry == 1)
		        result = '1' + result;
		    System.out.println(result);
		    
		    t--;
		}

	}
}


// Another Solution
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
		    String n = sc.next();
		    StringBuilder result = new StringBuilder();
		    int carry = 1;
		    int i = n.length()-1;
		    while(i >= 0)
		    {
		        	char digit = n.charAt(i);
		        	int num = (digit - '0') + carry;
                		result.append(num%10);
		            carry = num/10;
                
                		i--;
		    }
            	     if(carry == 1)
		        	result.append('1');
		     System.out.println(result.reverse());
		    
		     t--;
		}
	}
}

/*
Time Complexity: O(n)
Where n is the number of digits in N.
    • The loop processes each digit once → O(n) 
    • append() for all digits → overall O(n) 
    • reverse() → O(n)
Space Complexity: O(n)
*/

