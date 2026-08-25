/*

How to set, unset, flip a bit
            ​
Task
    • Given a number N. 
    • Perform the following operations: Set the first bit, Unset the second bit, and flip the third bit from the right hand side. 
    • Print the number. 
Sample 1:
Input 2
Output 5

Sample 2:
Input 6
Output 1
*/

//Java Solution:
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = n | (1 << 0);
		n = n & ~(1 << 1);
		n = n ^ (1 << 2);
		System.out.println(n);
		sc.close();
	}
}

