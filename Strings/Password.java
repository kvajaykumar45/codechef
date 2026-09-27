/*

            ​ PASSWORD
Chef is planning to setup a secure password for his Codechef account. For a password to be secure the following conditions should be satisfied:
    1. Password must contain at least one lower case letter [a−z];
    2. Password must contain at least one upper case letter [A−Z] strictly inside (first or the last character won’t be considered)
    3. Password must contain at least one digit [0−9] strictly inside;
    4. Password must contain at least one special character from the set { '@', '#', '%', '&', '?' } strictly inside;
    5. Password must be at least 10 characters in length, but it can be longer.
Chef has generated several strings and now wants you to check whether the passwords are secure based on the above criteria. Please help Chef in doing so.
            ​ Input
    • First line will contain T, number of testcases. Then the testcases follow. 
    • Each testcase contains of a single line of input, string S. 
Output
For each testcase, output in a single line "YES" if the password is secure and "NO" if it is not.
            ​ Constraints
    • 1≤∣S∣≤20 
    • All the characters in S are one of the following: lower case letters [a−z], upper case letters [A−Z], digits [0−9], special characters from the set { '@', '#', '%', '&', '?' } 
    • Sum of length of strings over all tests is atmost 106 

Input:
3
#cookOff#P1
U@CODE4CHEFINA
gR3@tPWD

Output:
NO
YES
NO
*/


//Java Solution

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)	{
		    String pwd = sc.next();
		    boolean upper = false, lower = false, special = false, digit = false;
		    int length = pwd.length();
		    if (length < 10)  {
		        System.out.println("NO");
		        continue;
		    }
		    char ch;
		    int i;
		    for(i=0; i<length; i++)   {
		        ch = pwd.charAt(i);
		        if (Character.isLowerCase(ch))
		            lower = true;
		        if(i>0 && i<length-1) {
		        if(Character.isUpperCase(ch))
		            upper = true;
		        else if (Character.isDigit(ch))
		            digit = true;
		        else if(ch == '@' || ch == '#' || ch == '%' || ch == '&' || ch == '?')
		            special = true;
		        }
		    }
		    if(upper && lower && digit && special)
		        System.out.println("YES");
		    else
		        System.out.println("NO");		        
		}
	}
}

/*
Time: O(N) per test case 
Auxiliary Space: O(1) 
Including input string storage: O(N)
*/
