/*
COMPLETE THE IMPLEMENTATION – QUICK SORT 
	
	Given a quickSort function that accepts an array as a parameter, sort the array using the Quick sort algorithm

Constraints
    • 1 ≤ N ≤ 200000 
    • −10^9 ≤ A[i] ≤ 10^9 
*/
//Java Solution:

public static void quickSort(int[] arr, int low, int high) {
    if(low < high)
    {
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot+1, high);
    }
}
static int partition(int [] arr, int low, int high)
{
    int pivot = arr[low];
    int i = low;
    int j = high;
    
    while(i<j)
    {
            while (i <= high && arr[i] <= pivot)
                i++;
            while(j >= low && arr[j] > pivot)
                j--;
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    
    return j;
}

/*
For your Quick Sort using the first element as pivot:
Time Complexity
Case		Time
Best case	O(n log n)
Average case	O(n log n)
Worst case	O(n²)

Space Complexity
The algorithm uses recursion.
    • Average/Best: O(log n)
    • Worst: O(n)
So overall:
Time: O(n log n) average, O(n²) worst
Space: O(log n) average, O(n) worst

*/
