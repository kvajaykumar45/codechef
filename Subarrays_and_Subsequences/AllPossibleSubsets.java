/*
​ ALL POSSIBLE SUBSETS

You are given an Array and you have to output all possible subsets of that array.
For Example: Let the array Arr = [1, 2, 3], It's possible subsets include:
    • {} 
    • {1} 
    • {2} 
    • {3} 
    • {1, 2} 
    • {2, 3} 
    • {1, 3} 
    • {1, 2, 3} 
Note - Print the subsets in sorted order.
​
Input Format
    • The first line of input will contain a single integer N, denoting the number of integers in the array. 
    • The second line contains N integers. 

Output Format
Output All the possible subsets of the given array.
​
Constraints
    • 1 ≤ N ≤ 10 
    • 1 ≤ Ai ≤ 10^5 
    • There are no duplicate values in the array. 

Input
3
1 2 3

Output
 
1
1 2
1 2 3
1 3
2
2 3
3

*/

//Backtracking Solution
class Solution {
    public List<List<Integer>> getAllSubsets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        generate(arr, 0, subset, result);
        return result;
    }
    
    public static void generate(int[] arr, int index, List<Integer> subset, List<List<Integer>> result)
    {
        result.add(new ArrayList<>(subset));
        
        for(int i=index; i<arr.length; i++)
        {
            subset.add(arr[i]);
            generate(arr, i+1, subset, result);
            subset.remove(subset.size()-1);
        }
    }
}

/*
Time: O(N × 2^N) 
Space: O(N × 2^N) including output, or O(N) auxiliary space.
*/
//Iterative Solution

class Solution {
    public List<List<Integer>> getAllSubsets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        
        for(int x: arr)
        {
            int size = result.size();
            for(int i=0; i<size; i++)
            {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(x);
                result.add(subset);
            }
        }
        Collections.sort(result, (a, b) -> {
            int n = Math.min(a.size(), b.size());
            for (int i = 0; i < n; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
            }
        }
            return a.size() - b.size();
        });
        return result; 
    }
}

/*
Approach		Time		Auxiliary / Working Space	Output Storage
Backtracking		O(N × 2^N)	O(N)				O(N × 2^N)
Bit manipulation	O(N × 2^N)	O(N)				O(N × 2^N)
Iterative		O(N × 2^N)	O(N × 2^N)*			O(N × 2^N)
*/

