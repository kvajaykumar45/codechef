/*
​ GENERATE ALL POSSIBLE PAIRS OF 
​ BALANCED PARENTHESES
Given a number n, generate all possible n pairs of balanced parentheses. A balanced parentheses string consists of opening and closing parentheses in a way that every opening parenthesis has a corresponding closing parenthesis and the pairs are properly nested.
​Input Format
	The input contains a single integer n.
​Output Format
	Generate all combinations of n pairs of balanced parentheses. Printing of the brackets will be done by the main function.
​Constraints
    • 1 ≤ n ≤ 10 
Input
3
Output
((()))
(()())
(())()
()(())
()()()
Input
2
Output
(())
()()
​
*/

// Recursive Solution
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Codechef {
       public static List<String> generateParenthesis(int n) {
       ArrayList<String> result = new ArrayList<>();
       generate(n, n, "", result);
       return result;
    }
    public static void generate(int open, int close, String str, List<String> result) {
        if(open == 0 && close == 0) {
            result.add(str);
            return;
        }
        if(open > 0)
            generate(open-1, close, str+"(", result);
        if(close > open)
            generate(open, close-1, str+")", result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> result = generateParenthesis(n);
        Collections.sort(result); // Sorting the result list
        for(String s : result) {
            System.out.println(s);
        }
    }
}

/*
Time: O(Cₙ log Cₙ × n)
Space: O(Cₙ × n)

*/

