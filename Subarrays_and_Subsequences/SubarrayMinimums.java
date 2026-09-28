/*
CHEF CALCULATES SUBARRAY MINIMUMS
Chef has an array of integers inputArray, and wants to find the sum of the minimum elements of all possible contiguous subarrays of this array. Since the total number of subarrays can be very large and the resulting sum may exceed normal integer limits, Chef wants the final answer modulo 10^9+7. Help Chef solve this problem efficiently for multiple test cases.

Function Declaration
    • Function Name
        ◦ calculateSumOfSubarrayMinimums 
    • Parameters
        ◦ inputArray: a list of integers representing Chef’s array 
    • Return Value
        ◦ An integer representing the sum of the minimum values of all contiguous subarrays of inputArray, taken modulo 109+7 

Constraints
    • 1 ≤ T ≤ 10^5 
    • 1 ≤ N ≤ 3×10^4 
    • 1 ≤ inputArray[i] ≤ 3×10^4 

Input Format
    • The first line contains a single integer T — the number of test cases. 
    • For each test case: 
        ◦ The first line contains an integer N — the size of the array. 
        ◦ The second line contains N space-separated integers representing inputArray. 

Output Format
    • For each test case, print a single integer: 
        ◦ the sum of the minimum elements of all contiguous subarrays of inputArray modulo 10^9+7. 

Input
3
3
1 3 2
4
8 7 6 5
1
10000

Output
10
60
10000

*/
//Solution – TLE 

    public static int calculateSumOfSubarrayMinimums(int[] inputArray) {
        int n = inputArray.length;
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=i; j<n; j++)
            {
                if(inputArray[j] < min)
                    min = inputArray[j];
                sum = (sum + min)%1000000007;
            }
        }
        return (int) sum; 
    }

//Monotonic Stack Solution
    public static int calculateSumOfSubarrayMinimums(int[] inputArray) {
        int n = inputArray.length;
        long MOD = 1000000007L;
        long left[] = new long[n];
        long right[] = new long[n];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<n; i++)
        {
            while(!stack.isEmpty() && inputArray[stack.peek()] > inputArray[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
                left[i] = i+1; 
            else 
                left[i] = i-stack.peek();
            stack.push(i);
        }
        stack.clear();
        
        for(int i=n-1; i>=0; i--)
        {
            
            while(!stack.isEmpty() && inputArray[stack.peek()] >= inputArray[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
                right[i] = n-i;
            else
                right[i] = stack.peek()-i;
            stack.push(i);
        }
        long answer = 0;
        for(int i=0; i<n; i++)
        {
            long c = (long) inputArray[i] * left[i]%MOD * right[i]%MOD;
            answer = (answer+c)%MOD;
        }
        return (int)answer;
        }

/*
​TIME COMPLEXITY: O(N)
You have:
    1. Left stack loop → O(N)
    2. Right stack loop → O(N)
    3. Final contribution loop → O(N)
So: O(N) + O(N) + O(N) = O(N)
The important point is that although you have while loops inside the for loops, each element is pushed once and popped at most once.
​
SPACE COMPLEXITY: O(N)
long[] left = new long[n];    // O(N)
long[] right = new long[n];   // O(N)
Deque<Integer> stack    // O(N)

So total: O(N) + O(N) + O(N) = O(N)

Complexity		Solution
Time			O(N)
Space			O(N)

Brute force:       O(N²) time, O(1) space
Your stack:        O(N)  time, O(N) space
*/
