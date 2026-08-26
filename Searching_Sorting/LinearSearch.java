/*
LINEAR SEARCH IN ARRAY
Write a program to search for a specific element in an array and print "Yes" if the element is present, otherwise print "No".
            ​ Input:
    • The first line contains an integer n, the length of the array and k, the element to be search. 
    • The second line contains n space-separated integers representing the elements of the array. 
            ​ Output:
    • Print "Yes" if the element k is present in the array. 
    • Print "No" if the element k is not present in the array. 

Constraints
    • 1≤n≤100000 
    • −10^9≤k≤10^9 
    • −10^9≤arr[i]​≤10^9 

Sample 1:
Input
8 1
3 5 1 4 5 6 5 6
Output Yes

Sample 2:
Input
3 4
1 2 3
Output No
*/

//Java Solution:
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean found = false;
		for(int i = 1; i<=n; i++) {
		    int x = sc.nextInt();
		    if ( x == k)  {
		        System.out.println("Yes");
		        found = true;
		        break;
		    }
		}
		if(!found)
		    System.out.println("No");
	}
}

/*
Case	Time Complexity
Best Case	O(1)
Average Case	O(n)
Worst Case	O(n)
            ​ 
Explanation
    • Best Case – O(1): 
        ◦ The target element is found at the first position. 
        ◦ Only one comparison is needed. 
    • Average Case – O(n): 
        ◦ On average, the element is found halfway through the list (or may not exist). 
        ◦ Approximately n/2 comparisons are made, which simplifies to O(n). 
    • Worst Case – O(n): 
        ◦ The target is at the last position, or it is not present in the array. 
        ◦ Every element must be checked. 
            ​ Space Complexity
    • O(1) (Constant Space) 
        ◦ Linear search uses only a few extra variables (such as an index and the target value). 
        ◦ It does not require additional memory proportional to the input size. 
*/

