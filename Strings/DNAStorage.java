/*            ​ DNA STORAGE
For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:
    • 00 is replaced with A 
    • 01 is replaced with T 
    • 10 is replaced with C 
    • 11 is replaced with G 
Given a binary string S of length N (N is even), find the encoded sequence.
            ​ Input Format
    • First line will contain T, number of test cases. Then the test cases follow. 
    • Each test case contains two lines of input. 
    • First line contains a single integer N, the length of the sequence. 
    • Second line contains binary string S of length N. 
Output Format
For each test case, output in a single line the encoded sequence.
Note: Output is case-sensitive.
            ​ Constraints
    • 1 ≤ T ≤ 100 
    • 2 ≤ N ≤ 103 
    • N is even. 
    • Sum of N over all test cases is at most 103. 
    • S contains only characters 0 and 1. 
    */
    
//Java Solution
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String result = "";
            int i=0;
            while(i < s.length())
            {
                String s1 = s.substring(i, i+2);
                if(s1.equals("00"))
                    result = result + 'A';
                else if (s1.equals("01"))
                    result += 'T';
                else if(s1.equals("10"))
                    result += 'C';
                else if(s1.equals("11"))
                    result += 'G';
                i += 2;
            }
            System.out.println(result);
        }
    }
}
Another Solution
StringBuilder result = new StringBuilder();
for (int i = 0; i < n; i += 2) {
    char a = s.charAt(i);
    char b = s.charAt(i + 1);
    if (a == '0' && b == '0')
        result.append('A');
    else if (a == '0' && b == '1')
        result.append('T');
    else if (a == '1' && b == '0')
        result.append('C');
    else
        result.append('G');
}
/*
Comparison	
Approach 		Time 	Extra operations 	
substring() + equals()	O(N)	Creates temporary strings	
charAt()		O(N)	No temporary pair strings
*/
