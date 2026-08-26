/*
RADIX SORT
Given a radixSort function that accepts an array as a parameter, sort the array using the Radix sort algorithm.
*/

//Java Solution:
public static void radixSort(int[] arr) {
    if(arr.length <= 1)
        return;
    int n = arr.length;
    int max = arr[0];
    for(int i=1; i<n; i++)
    {
        if(max < arr[i])
            max = arr[i];
    }
    for(int exp=1; (max/exp) > 0; exp*=10)
    {
        int output[] = new int[arr.length];
        int count[] = new int[10];
        
        for(int i=0; i<n; i++)
        {
            int digit = (arr[i]/exp) % 10;
            count[digit]++;
        }
         for(int i=1; i<10; i++)
        {
            count[i] += count[i-1];
        }
        for(int i=n-1; i>=0; i--)
        {
            int digit = (arr[i]/exp) % 10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }
         for(int i=0; i<n; i++)
        {
            arr[i] = output[i];
        }
    }
}

/*
Time Complexity
Let:
    • n = number of elements
    • d = number of digits in the largest number
For each digit, you perform:
    1. Count digits → O(n)
    2. Cumulative count → O(10) → constant
    3. Build output → O(n)
    4. Copy back → O(n)
So each digit takes:
O(n + 10 + n + n)
= O(3n + 10)
= O(n)
There are d digit positions.
Therefore:
Time Complexity = O(d × n)
For fixed-size integers, d is considered constant, so it is often written as:
O(n)

Space Complexity
You create:
int output[] = new int[n];
int count[] = new int[10];
Therefore:
output → O(n)
count  → O(10) = O(1)
So:
Space Complexity = O(n)

Interview answer
Radix Sort using Counting Sort has O(d × n) time complexity and O(n + k) space complexity, where d is the number of digits and k is the radix (10 here). For decimal integers, this is commonly stated as O(dn) time and O(n) space.
*/

