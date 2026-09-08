/*

​ GENERATE BINARY STRINGS WITHOUT CONSECUTIVE 1S
You are given an integer n, and your task is to generate all binary strings of length n that do not contain consecutive 1s. The strings must be printed in lexicographically increasing order (sorted order). A binary string is a string that contains only the characters '0' and '1'.
​ Function Declaration
​ Function Name
generate – This function generates all binary strings of length n that do not contain consecutive 1s using recursion, and prints them in lexicographically increasing order.
​ Parameters
    • n : A number representing the required length of the binary strings. 
Return Value
    • The function does not return anything. 
    • It prints all valid binary strings of length n, each on a new line. 
Constraints
    • 1 ≤ n ≤ 20 
    • The string contains only characters 0 and 1 
    • No binary string may contain 11 as a substring 
Input Format
    • The first line contains a single integer n — the length of the binary string. 
Output Format
    • Print all valid binary strings of length n that do not contain consecutive 1s. 
    • Each string must be printed on a new line. 
    • Strings must appear in lexicographically increasing order. 
*/

public static void generate(int n) {
    generateString("", n);
}
public static void generateString(String s, int n){
    if(n == 0){
        System.out.println(s);
        return;
    }
    generateString(s+"0", n-1);
    if(s.length()==0 || s.charAt(s.length()-1) == '0')
        generateString(s+"1", n-1);
}


/*
For this exact code, which generates all binary strings of length n with no consecutive 1s:
generateString(s+"0", n-1);

if(s.length()==0 || s.charAt(s.length()-1) == '0')
    generateString(s+"1", n-1);
​
1. Time Complexity
The number of valid strings follows: T(n)=T(n−1)+T(n−2)
So the number of generated strings is:  Θ(ϕ ^ n) where ϕ≈1.618
But there is an important point: at every recursive call you do:
s + "0"
s + "1"
String concatenation takes O(n) in the worst case because Java creates a new string.
Also, printing a string of length n takes O(n).
Therefore:
O(n. Φ ^ n)
​
2. Space Complexity
The recursion depth is at most n: O(n)
However, because you're creating strings using: s + "0"
each active recursive level holds a string whose length can be up to n.
There can be up to n such strings on the recursion stack:
n+(n−1)+(n−2)+⋯+1=O(n^2)

So for this implementation: O(n2)
Final Complexity	Answer
Time			O(n × φⁿ)
Space			O(n²)
​ 
*/

// Backtracking solution 
//For thebacktracking code using char[]:
public static void generate(int n) {
    char[] arr = new char[n];
    generateString(arr, 0);
}

public static void generateString(char[] arr, int n) {
    if (n == arr.length) {
        System.out.println(new String(arr));
        return;
    }
    arr[n] = '0';
    generateString(arr, n + 1);
    if (n == 0 || arr[n - 1] == '0') {
        arr[n] = '1';
        generateString(arr, n + 1);
    }
}
​/*
Time Complexity
The number of valid strings is: Fn+2 = Θ(ϕn) where: ϕ≈1.618 
For every valid string, we create and print a string of length n: new String(arr) which takes O(n).
Therefore: O(n . ϕ^n)
You can also say O(n × 2^n) as an upper bound, but O(nφⁿ) is tighter for this particular problem.
​ Space Complexity
You have: char[] arr = new char[n]; so: O(n)
The recursion depth is also n: O(n)
Since these are not additional independent O(n) structures, the total auxiliary space remains: O(n)
*/
​/*
Final answer
Complexity
Time		O(n × φⁿ)
Space 		O(n)

This is better than your previous String s implementation, where repeated s + "0"  and  s + "1" creates new strings. With the reusable char[], the backtracking space is O(n).
*/

