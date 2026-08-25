/*
Problem: Chef Checks Power
Chef has come across a mysterious integer and wants to determine whether it is a power of two.
Given an integer inputNumber, check whether there exists an integer x such that:
    • inputNumber=2x 

Return:
    • true if inputNumber is a power of two 
    • false otherwise 

Note: Negative numbers and zero are not powers of two. And do not use any inbuilt language functions. 

Constraints
    • 1≤T≤10^5 
    • −2^31≤inputNumber≤2^31−1 

Input Format
    • The first line contains a single integer T — the number of test cases. 
    • Each of the next T lines contains a single integer inputNumber. 

Output Format
For each test case:
    • Print 1 in a single line if inputNumber is a power of two. 
    • Otherwise, print 0 in a single line. 
The output for each test case should be printed on a new line, in the same order as the input.

Sample 1:
Input
4
1
2
3
16

Output
1
1
0
1
*/

static boolean checkIfPowerOfTwo(int inputNumber) {
    if(inputNumber>0)
	    return (inputNumber & (inputNumber-1)) == 0 ;
    else
	    return false;
}

/*
Time: O(1) 
Space: O(1)
*/
