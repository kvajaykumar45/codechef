/*

EFFICIENT PAN LINKING
There are 20 officers in Chefland who can link the PAN to Aadhar. N applications were received for linking PAN. However, due to an internal conflict, each officer intends to process exactly the same number of applications. Determine the minimum number of applications that would remain unprocessed. Note that N can be huge and might not fit in an integer.
            ​ Input Format
    • The first line of input will contain a single integer T, denoting the number of test cases. 
    • Each test case consists of a single integer N, denoting the number of applications. 
Output Format
For each test case, output the minimum number of applications that will remain unprocessed.
            ​ Constraints
    • 1≤T≤1000 
    • 1≤N<10100 
            ​ Input
4
1
35
127
7463749812302340912745859
*/

//Java Solution
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int length = s.length();
            int num = 0;
            if(length == 1)
                num = s.charAt(0) - '0';
            else
                num = Integer.parseInt(s.substring(s.length() - 2));
            int result = num % 20;   
            System.out.println(result);    
        }
    }
}

/*

Time Complexity: O(D)
Although you only use the last two digits, the input String itself contains D digits, so reading the input takes O(D) time.

The substring() operation here takes only O(1) because you're taking just 2 characters.

So overall:

Time = O(D)
Since D ≤ 100, this is effectively constant-sized for the given constraints.

Space Complexity: O(D)
The String s stores all D digits.

*/
