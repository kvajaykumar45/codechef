/*
SEARCH IN A 2D SORTED MATRIX

Chef is given a matrix matrix of size m×n containing integers.
The matrix has the following properties:
    • Each row is sorted in ascending order from left to right. 
    • Each column is sorted in ascending order from top to bottom. 
Chef wants to determine whether a given integer target exists in the matrix.
If target is present, print true, otherwise print false.

Function Declaration
    • Function Name:
        ◦ searchMatrix 
    • Parameters:
        ◦ matrix (Array[][]) A 2D matrix where each row and each column is sorted in ascending order. 
        ◦ target (int) The value to be searched in the matrix. 
    • Return Value:
        ◦ Returns true if target exists in the matrix. 
        ◦ Returns false otherwise. 

Constraints
    • 1 ≤ m, n ≤ 10^4 
    • −10^9 ≤ matrix[i][j] ≤ 10^9 
    • −10^9 ≤ target ≤ 10^9 
    • Each row and each column of the matrix is sorted in ascending order. 

Input Format
    • The first line contains two space-separated integers m and n — the number of rows and columns. 
    • The next m lines each contain n space-separated integers representing the matrix. 
    • The last line contains an integer target — the value to search for. 

Output Format
    • Print true if target exists in the matrix. 
    • Print false otherwise. 
*/


//Java Solution:
 public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols-1;
        while( row < rows && col >= 0)
        {
            if( matrix[row][col] == target)
            {
                return true;
            }
            else if(matrix[row][col] > target)
            {
                col = col - 1;
            }
            else if(matrix[row][col] < target)
            {
                row = row + 1; 
            }
        }
        return false; 
 }


/*
1. Linear search row by row
Suppose the matrix is m × n.
You check every element:
    • Each row → up to n elements
    • There are m rows
Therefore:
Time = O(m × n)
For a 10000 × 10000 matrix:
O(10⁸) comparisons in the worst case.
            ​ 2. Binary search each row
Because each row is sorted, you can perform binary search in every row.
    • Binary search one row → O(log n)
    • m rows → O(m log n)
Similarly, if you binary-search every column:
    • One column → O(log m)
    • n columns → O(n log m)
            ​ 3. Staircase search — best for this problem
Starting from top-right or bottom-left:
    • At every step, eliminate one row or one column.
    • Maximum steps = m + n
So:
Time = O(m + n)
Space = O(1)

Summary
Method					Time Complexity
Row-wise linear search			O(m × n)
Column-wise linear search		O(m × n)
Binary search each row			O(m log n)
Binary search each column		O(n log m)
Top-right/bottom-left staircase		O(m + n)

So, row-wise and column-wise linear searches have the same complexity, but the staircase method takes advantage of both row and column sorting and is the most efficient.
*/
