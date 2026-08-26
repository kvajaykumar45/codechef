/*
COMPLETE THE IMPLEMENTATION – MERGE SORT 
Given a mergeSort function that accepts an array as a parameter, sort the array using the Merge sort algorithm.

Constraints
    • 1≤N≤200000 
    • −10^9≤A[i]≤10^9 
*/

public static void mergeSort(int[] arr, int left, int right) {
    if(left >= right)
        return;
    int mid = (left + right)/2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid+1, right);
    merge(arr, left, mid, right);
}
public static void merge(int[] arr, int left, int mid, int right)
{
    int i = left;
    int j = mid + 1;
    int k = 0;
    int temp[] = new int[right - left + 1];
    while( i <= mid && j <= right)
    {
        if(arr[i] < arr[j])
        {
            temp[k] = arr[i];
            k++;
            i++;
        }
        else
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
    }
    while(i <= mid)
    {
        temp[k] = arr[i];
        k++;
        i++;
    }
    while(j <= right)
    {
        temp[k] = arr[j];
        k++;
        j++;
    }
    for(int x=0; x<temp.length; x++)
        arr[left + x] = temp[x];
}
/*
Time Complexity: O(n log n) 
Why?
    • The array is divided into two halves repeatedly → log n levels 
    • At each level, merging all elements takes → O(n) 
Therefore: O(n) × O(log n) = O(n log n)

Space Complexity: O(n) 
The temporary array can contain up to n elements.
So: Auxiliary space = O(n)
Because you're using the recursive version, there is also a recursion stack of O(log n).
But: O(n) + O(log n) = O(n)
*/
