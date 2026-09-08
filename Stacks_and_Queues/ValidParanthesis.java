/*
​ VALID PARENTHESIS
A string of parentheses is considered valid if each opening parenthesis has a matching closing parenthesis and the pairs are properly nested. In a valid parenthesis string, every opening bracket '(' must have a corresponding closing bracket ')' that occurs after the opening bracket, and there must not be any extra or unpaired brackets.
Here are the rules for a string of parentheses to be valid:
    1. Correct order: Each closing parenthesis must correspond to the latest unmatched opening parenthesis. 
    2. Matching pairs: For every opening parenthesis, there must be a closing parenthesis. 
Let's look at some examples:
    • "()" - This is valid because the only pair of parentheses correctly matches and is in the right order. 
    • "()()" - This is also valid. There are two separate but correct matches. 
    • "(()())" - Valid as well, since the inner pair is nested within the outer pair and they all match up. 
    • "(())" - The inner pair is nested within the outer pair, with both pairs being correctly matched. 
    • ")(" or "(" or ")" - All invalid because they contain either unmatched or improperly ordered parentheses. 
The goal is to determine if parentheses (and optionally other brackets like curly braces and square brackets) in an expression are properly balanced. Check the sample test cases given below for expected input and output format. Complete the code in the IDE to solve this problem.
Input
3
((()))
()()()
(((())
Output
((())) : true
()()() : true
(((()) : false
*/
// Solution
static boolean isBalanced(String expression) {
    char[] stack = new char[expression.length()];
    int top = -1;

    for (int i = 0; i < expression.length(); i++) {
        char ch = expression.charAt(i);

        if (ch == '(' || ch == '[' || ch == '{') {
            stack[++top] = ch;
        }
        else if (ch == ')' || ch == ']' || ch == '}') {
            if (top == -1) {
                return false;
            }

            char open = stack[top--];

            if ((ch == ')' && open != '(') ||
                (ch == ']' && open != '[') ||
                (ch == '}' && open != '{')) {
                return false;
            }
        }
    }
    return top == -1;
}


