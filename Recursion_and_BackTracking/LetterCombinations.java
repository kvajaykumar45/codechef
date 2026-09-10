/*
CHEF GENERATES LETTER COMBINATIONS
Chef has found an old phone keypad and wants to explore all the possible letter combinations that can be generated from a given string of digits.  Each digit from 0 to 9 maps to a set of letters just like on a traditional telephone keypad
0: "" 
1: "" 
2: "abc" 
3: "def" 
4: "ghi" 
5: "jkl" 
6: "mno" 
7: "pqrs" 
8: "tuv" 
9: "wxyz"
Chef wants to generate every possible string by replacing each digit with one of its corresponding letters.
Help Chef by writing a function that takes the input digits inputDigits and returns all possible letter combinations that the number could represent. If Chef provides an empty string, then no combinations should be returned.

Function Declaration
Function Name
getLetterCombinations - This function generates all possible letter combinations that the input digits could represent on a phone keypad.

Parameters
    • inputDigits : A string containing digits from 0 to 9 inclusive. Each digit maps to a set of letters as on a traditional phone keypad. 

Return Value
    • Returns a string containing all possible letter combinations. 
    • Each string in the array represents one valid letter combination. 
    • The output vector is empty if inputDigits is empty. 

Constraints
    • 1 ≤ T ≤ 10^5 
    • 1 ≤∣inputDigits∣≤ 4 
    • Each character in inputDigits is a digit in the range [′0′,′9′]. 

Input Format
    • The first line contains a single integer T — the number of test cases. 
    • Each test case consists of a single line containing the string inputDigits. 

Output Format
    • For each test case, print all possible letter combinations that the input digits could represent. 
    • Print the combinations separated by spaces in any order. 
    • If there are no combinations, print an empty line. 

Input 
3
2
23
234

Output 
a b c
ad ae af bd be bf cd ce cf
adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
*/
//Solution

class Solution {
    static HashMap<Character, String> map = new HashMap<>();
    
    public List<String> getLetterCombinations(String inputDigits) 
    {
    List<String> result = new ArrayList<>();
    
    if(inputDigits.length() == 0)
        return result;
    map.put('0', "");
    map.put('1', "");
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
    backtrack(inputDigits, 0, new StringBuilder(), result);
      
    return result;
    }
    
    public static void backtrack(String inputDigits, int index, StringBuilder s, List<String> result)
    {
        if(index == inputDigits.length())
        {
            result.add(s.toString());
            return;
        }
        char digit = inputDigits.charAt(index);
        String digits = map.get(digit);
        if(digits.isEmpty())
            backtrack(inputDigits, index+1, s, result);
        else
        {
            for(int i=0; i<digits.length(); i++)
            {
            s.append(digits.charAt(i));
            backtrack(inputDigits, index+1, s, result);
            s.deleteCharAt(s.length()-1);
            }    
        }
    }
}

/*
Component				Complexity
Backtracking time			O(n × 4ⁿ)
Recursion + StringBuilder		O(n)
Result storage				O(n × 4ⁿ)
Total space including result		O(n × 4ⁿ)
Auxiliary space excluding result	O(n)

*/


