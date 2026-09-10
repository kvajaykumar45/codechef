/*
​ UNIQUE PERMUTATION
You are given an array arr of integers, which may contain duplicate elements. Your task is to write a recursive function to generate all unique permutations of this array. Each permutation should be unique, even if the array contains duplicate elements. The solution should not generate any duplicate permutations.
A permutation is a unique arrangement of elements where the order matters.
​
Input Format
    • The first line contains one integer n, the size of the array. - Next line contains n integers arr[0],arr[1]...arr[n], representing the elements of the array in the sorted order. 

Output Format
    • Generate the unique permutation in completing the uniquePermutations function. 
    • Printing the permutation will be done by the main function. 

Constraints
    • 1 ≤ n ≤ 10. 
    • 1 ≤ arr[i] ≤ 10. 

Input
2
1 2

Output
[1 2]
[2 1]

Input
3
1 2 2

Output
[1 2 2]
[2 1 2]
[2 2 1]


*/

//Solution
import java.util.*;
class Codechef {
    public static void backtrack(List<Integer> multiset, boolean[] used, List<Integer> path, List<List<Integer>> permutations) {
        if (path.size() == multiset.size()) {
            permutations.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < multiset.size(); ++i) {
            if (used[i] || (i > 0 && multiset.get(i).equals(multiset.get(i - 1)) && !used[i - 1])) {
                continue;
            }
            path.add(multiset.get(i));
            used[i] = true;
            backtrack(multiset, used, path, permutations);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
    public static List<List<Integer>> uniquePermutations(List<Integer> multiset) {
        Collections.sort(multiset);
        List<List<Integer>> permutations = new ArrayList<>();
        boolean[] used = new boolean[multiset.size()];
        backtrack(multiset, used, new ArrayList<>(), permutations);
        return permutations;
    }
    public static void printPermutations(List<List<Integer>> permutations) {
        for (List<Integer> permutation : permutations) {
            System.out.print("[");
            for (int i = 0; i < permutation.size(); ++i) {
                System.out.print(permutation.get(i));
                if (i < permutation.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> multiset = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            multiset.add(scanner.nextInt());
        }
        List<List<Integer>> result = uniquePermutations(multiset);
        printPermutations(result);
    }
}

/*
Time Complexity
Suppose:
arr = [1, 2, 2]
There are only 3 unique permutations:
[1,2,2]
[2,1,2]
[2,2,1]

For every permutation, we have to copy all n elements.
So: Time = number of permutations × n  
O(P × n), where P = number of unique permutations.
If all numbers are different: P = n!
Therefore: Time = O(n × n!)
​ 
​Space Complexity
You are storing all the permutations in result. If there are P permutations and each has n numbers:
Space = O(P × n)
For all different numbers: Space = O(n × n!)
​*/
 
