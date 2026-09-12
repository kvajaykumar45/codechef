/*
​ CHEF SOLVES COMBINATION SUM III
Chef wants to find all unique combinations of exactly combinationCount numbers that add up to a target sum targetSum. Chef can only use numbers from 1 through 9, and each number can be used at most once in each combination. Chef wants to list all such valid combinations without any duplicates.  Help Chef by writing a function to generate all these unique combinations.
​
Function Name
findCombinations - This function finds all unique combinations of combinationCount numbers that add up to targetSum.
​
Parameters
    • combinationCount: The number of elements in each combination. 
    • targetSum: The target sum that each combination must add up to. 

Return Value
    • Returns an array of array containing all valid combinations. 
    • Each inner array represents one combination of integers. 
    • Combinations are unique and sorted in ascending order within each combination. 

Constraints
    • 2 ≤ combinationCount ≤ 9 and 1 ≤ targetSum ≤ 60 

Input Format
    • The first line contains a single integerType T — the number of test cases. 
    • Each test case contains two integers: 
        ◦ combinationCount — the number of elements in each combination. 
        ◦ targetSum — the target sum for the combinations. 

Output Format
    • For each test case, print all unique combinations that satisfy the conditions. 
    • Each combination should be printed as space-separated integers in ascending order on a separate line. 
    • If no valid combinations exist, print an empty line. 

Input
2
2
17
3
12

Output
[8 9]
[1 2 9]
[1 3 8]
[1 4 7]
[2 3 7]
[2 4 6]
[3 4 5]
*/
//Solution

class Solution {
    public List<List<Integer>> findCombinations(int combinationCount, int targetSum) {
        // write your code here 
        List<Integer> subset = new ArrayList<Integer>();
        List<List<Integer>> combinations = new ArrayList<>();
        generate(1, combinationCount, targetSum, subset, combinations);
        return combinations;
    }
    public static void generate(int start, int count, int sum, List<Integer> subset, List<List<Integer>> combinations)
    {
        if(count == 0)
        {
            if(sum == 0)
            {
                combinations.add(new ArrayList<>(subset));
            }
            return;
        }
        for(int i=start; i<=9; i++)
        {
            subset.add(i);
            generate(i+1, count-1, sum-i, subset, combinations);
            subset.remove(subset.size()-1);
        }
    }
}

/*
For this problem, keep it simple:
    • Time: O(C(9, N) × N)
    • Space: O(N) + output
For students, you can say:
Time = number of combinations × size of each combination
Space = recursion depth = N
*/

