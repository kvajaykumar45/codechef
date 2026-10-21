

/*

Divide Pages

Chef has N books such that the ith book has Ai pages. He wants to divide all the books between Alice and Bob such that:

    Both Alice and Bob get at least one book;
    The number of pages allotted to Alice and Bob are either both odd or both even.

Find whether such distribution exists.

Input Format
    The first line of input will contain a single integer T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
        The first line of each test case contains a single integer N — the number of books.
        The next line contains N space-separated integers, where the ith integer denotes the number of pages in the ith book.

Output Format
For each test case, output on a new line, YES, if a valid distribution exists. Otherwise, print NO.
You can print each character in uppercase or lowercase. For example, NO, no, No, and nO, are all considered the same.

Constraints
1≤T≤100
2≤N≤10^5
1≤Ai​≤100
The sum of N over all test cases won't exceed 2⋅10^5


Input
3
3
2 4 6
4
1 1 2 3
6
3 1 1 1 1 1


Output
YES
NO
YES

*/

//Source Code

class Solution {
    public String checkArray(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++)
            sum += A[i];
        return sum % 2 == 0 ? "YES" : "NO";
    }
}

