/*
​ PASCAL TRIANGLE ELEMENT
Given an integer N, representing the row number, and an integer M, representing the column number, find the value at the intersection of the Nth row and Mth column of Pascal's Triangle. Pascal's Triangle is defined as - The 0th row is 1. Each element in subsequent rows is the sum of the two elements directly above it in the previous row.

        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1


Function Declaration
​ Function Name
getPascalElement – This function returns the element at the given row and column of Pascal’s Triangle.
​ Parameters
    • N : An integer representing the row number in Pascal’s Triangle (0-based indexing). 
    • M : An integer representing the column number in Pascal’s Triangle (0-based indexing). 
Return Value
    • Returns an integer representing the value at row N and column M of Pascal’s Triangle. 
Constraints
    • 0≤N≤20 
    • 0≤M≤N 
Input Format
    • The input consists of a single line containing two space-separated integers:
        ◦ N – the row number 
        ◦ M – the column number 
Output Format
    • Print a single integer — the element at the Mᵗʰ column of the Nᵗʰ row in Pascal’s Triangle. 
Sample 1
Input 4 2
Output 6
Explanation: The 4th row of Pascal’s Triangle is [1, 4, 6, 4, 1]. The element at the 2nd column (0-based index) in the 4th row is 6. 




This is a direct application of the binomial coefficient in Pascal’s Triangle.
For 0-based indexing, the element at row N and column M is:
Element = M! / (N−M)! * N!
*/
//Binomial Solution

static int getPascalElement(int N, int M) {
    int result = 1;
    for(int i=0; i<M; i++)
    {
        result = result * (N-i)/(i+1);
    }
    return result; 
}
/*

​ Complexity
    • Time: O(M) — at most O(N)
    • Space: O(1)
*/


//Simple Recursive Solution
static int getPascalElement(int N, int M) {
    if(M == 0 || M == N)
        return 1;
    return getPascalElement(N-1, M-1) + getPascalElement(N-1, M);
}

/*
Time: approximately O(2^N) 
Space: O(N) because of the recursion call stack.
*/

//Recursion + DP Solution
static int dp[][] = new int[21][21];
static int getPascalElement(int N, int M) {
     if(M == 0 || M == N)
        dp[N][M] = 1;
     if(dp[N][M] != 0)
        return dp[N][M];
    dp[N][M] = getPascalElement(N-1, M-1) + getPascalElement(N-1, M);
    return dp[N][M];
}

/*
Approach			Time
Simple recursion		O(2^N) approximately
Recursion + DP			O(N × M)
Loop/formula solution		O(M)
*/
//Iterative Solution

static int getPascalElement(int N, int M) {
    int row[] = new int[N+1];
    row[0]=1; 
    for(int i=1; i<=N; i++)
    {
        for(int j=i; j>=1; j--)
        {
            row[j] = row[j] + row[j-1];
        }
    }
    return row[M];
}


/*
Time: O(N^2)
Space: O(N) 
*/
