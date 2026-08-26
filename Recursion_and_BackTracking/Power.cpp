/*	
​ POWER FUNCTION BY RECURSION
Let us learn and practice recursion for simple problems.

Given 2 integers x and y - write a recursive function to calculate the result xy.

Input
8 3

Output
512
*/

//C++ Solution

#include <iostream>
using namespace std;
int power(int x, int n) {
    if(n==0)
        return 1;
    int half = power(x, n/2);
    if(n % 2 == 0)
        return half * half;
    else
        return half * half * x;
 }
int main() {
    int x;
    int y;
    cin >> x;
    cin >> y;
    int result = power(x, y);
    cout << result << "\n";
    return 0;
}

/*
Time complexity: O(log n)
Space complexity: O(log n) due to the recursive call stack.
*/
