/*
Problem: Least significant bit, and most significant bit

Least Significant Bit
The least significant bit (LSB) is the rightmost bit in a binary representation of a number. In binary, each digit or bit represents a power of 2. The least significant bit represents the smallest power of 2 in the binary number, typically 20 or 1.
For example, in the 8-bit binary number 11010101, the least significant bit is the rightmost bit, which is 1 in this case.
Changing the least significant bit from 0 to 1 or from 1 to 0 results in a change of the least amount in the value of the number. This property is often used in various applications, such as error detection, cryptography, and certain data encoding techniques.

Most Significant Bit
The most significant bit (MSB) is the leftmost bit in a binary representation of a number. In binary notation, each bit represents a power of 2, with the leftmost bit typically representing the largest power of 2 in the number. The term "most significant" indicates that this bit contributes the most to the overall value of the number.
For example, in the 8-bit binary number 11010101, the most significant bit is the leftmost bit, which is 1 in this case.

Task
    • For the given number flip the most significant bit and the least significant bit and return the number. 
Constraints
2≤N≤10^18

Sample 1:
Input 6
Output 3

Explanation:
    • Binary form = 110 
    • MSB = 1, LSB = 0 
    • Flip them to get 011 
    • Convert back to decimal to get 3 
Output = 3

Sample 2:
Input 7
Output 2

Explanation:
    • Binary form = 111 
    • MSB = 1, LSB = 1 
    • Flip MSB and LSB. MSB becomes 0, LSB becomes 0. The new binary is 010 
    • Convert back to decimal that is 2 
Output = 2
*/

//Java Solution:
class Solution {
    public long flipBits(long n) {
        int msb = 0;
        long m = n;
        while(m>1)
        {
            m = m >> 1;
            msb++;
        }
        long result = n ^ (1L << msb) ^ 1L;
        return result;
    }
}
/*
Complexity	Value
Time		O(log N)
Space		O(1)
*/

