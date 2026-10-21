

/*
Odd Sum Pair

Chef has 3 numbers: A, B, and C.

Chef wonders if it is possible to choose exactly two numbers out of the three numbers such that their sum is odd. Your task is to help Chef determine if such a pair exists.
Function Declaration
Function Name

checkOddPairs – This function checks if any two numbers out of the three can form an odd sum.
Parameters

    A : an integer representing the first number.
    B : an integer representing the second number.
    C : an integer representing the third number.

Return Value

Returns a string: "YES" if it is possible to choose two numbers with an odd sum, otherwise returns "NO".
Constraints:
1 ≤ A,B,C ≤ 10^9

The input and output formats provided below are only for testing with custom inputs. You only need to complete the core logic function.

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of three space-separated integers: A, B, and C.

Output Format
    For each test case, output YES if you can choose exactly two numbers with odd sum, NO otherwise.
    The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

Constraints
1 ≤ T ≤ 100
1 ≤ A,B,C ≤ 10

Input
4
1 2 3
8 4 6
3 3 9
7 8 6

Output
YES
NO
NO
YES
*/

//Source Code
class Solution {
    public String checkOddPairs(int A, int B, int C) {
        if( (A+B)%2 == 1)
            return "YES";
        else if((B+C)%2 == 1)
            return "YES";
        else if((C+A)%2 == 1)
            return "YES";
        else 
            return "NO";
    }
}



