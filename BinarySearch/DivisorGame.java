


/*
The Divisor Game

In a faraway land, the mathematicians of Numeria discovered a way to control the growth of numbers by choosing a special divisor.

You are given an array A of size N, and an integer T called the threshold.

Your task is to choose the smallest positive integer divisor DD such that sum of all Ai/D for i = 1 to n.

Here, ⌈x⌉ denotes the ceiling function, i.e., rounding x up to the nearest integer.

Function Declaration
Function Name
findSmallestDivisorfindSmallestDivisor – This function finds the smallest divisor that satisfies the threshold condition.
Parameters
A : A list of positive integers.
T : An integer representing the threshold value.

Return Value
   Returns a single integer — the smallest positive divisor D such that the sum of ceilings is less than or equal to T

Constraints
1≤N≤5×10^4
1≤A[i]≤10^6
N≤T≤10^6
It is guaranteed that a valid divisor exists

Input Format
The first line contains two space-separated integers N and T — the size of the array and the threshold.
The second line contains N space-separated integers representing the elements of the array A

Output Format
Print a single integer — the smallest divisor D that satisfies the condition.

Input 1
3 8
3 7 10

Output 1
3

Explanation:

For D = 3 -> ceil(3/3) + ceil(7/3) + ceil(10/3) = 1 + 3 + 4 = 8 -> 8
Smaller divisors give sums > 8, so the smallest valid D is 3.
*/

//Source Code

  public static int findSmallestDivisor(int[] A, int T) {
      int low = 1;
      int high = 0;

      for (int x: A)
          high = Math.max(high, x);

        while(low < high)
        {
            int d = low + (high - low)/2;
            
            int sum = 0;
            for(int x: A)
                sum += (x+d-1)/d;
            if(sum <= T) 
                high = d;
            else
                low = d + 1; 
        }
        return high;

  }


