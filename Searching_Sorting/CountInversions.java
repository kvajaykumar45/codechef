/*
COUNT INVERSIONS
Chef has an array arr consisting of integers and wants to know how far the array is from being sorted. N is the size of the array.
Two elements arr[i] and arr[j] form an inversion if:
    • arr[i]>arr[j] 
    • i<j 
An inversion indicates that the array is not sorted. 
Your task is to count the total number of inversions in the array.

Constraints
    • 1 ≤ N ≤ 10^5 
    • −10^4 ≤ arr[i] ≤ 10^4 
    • The answer can be large, so use a data type capable of storing large values. 

Input Format
    • The first line of input contains a single integer N — the size of the array. 
    • The second line contains N space-separated integers representing the array arr. 

Output Format
Output a single integer — the total number of inversions in the array.
Input
5 
3 1 4 2 5 
Output 3 

Explanation:
The inversions are:
    • (3, 1) -> indices (0, 1) 
    • (3, 2) -> indices (0, 3) 
    • (4, 2) -> indices (2, 3) 
Total inversions = 3

OVERALL PROCESS:

CountInversions(array)
        |
 Divide array
        |
 Count inversions in left half
        |
 Count inversions in right half
        |
Count cross inversions while merging
        |
    Total


COMPLEXITY

Brute force
Time  = O(N²)
Space = O(1)

Merge Sort approach
Time = O(N log N)
Space = O(N)
*/

//Java Solution: 
 public static long countInversion(int[] arr, int n) {
       return mergesort(arr, 0, n-1);
    }
 public static long mergesort(int[] arr, int left, int right)
 {
     if(left>=right)
        return 0;
     int mid = (left + right)/2;
     long count = 0;
     count += mergesort(arr, left, mid);
     count += mergesort(arr, mid+1, right);
     count += merge(arr, left, right, mid); 
    return count;
 }
 public static long merge(int[] arr, int left, int right, int mid)
 {
     int temp[] = new int[right - left + 1];
     int i = left;
     int j = mid + 1;
     int k = 0;
     long count = 0;
     while(i <= mid && j <= right)
     {
         if(arr[i] <= arr[j])
         {
             temp[k] = arr[i];
             k++;
             i++;
         }
         else
         {
             temp[k] = arr[j];
             k++;
             j++;
             count += mid - i + 1;
         }
     }
     while(i <= mid)
     {
         temp[k] = arr[i];
         i++;
         k++;
     }
     while(j <= right)
     {
         temp[k] = arr[j];
         k++;
         j++;
     }
     for(int x=0; x<temp.length; x++)
     {
         arr[left + x] = temp[x];
     }
     return count; 
 }
 
