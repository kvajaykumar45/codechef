/*
​ UNIQUE SUBSET
You are given a set of integers represented by an array arr , which may contain duplicate elements. Your task is to write a recursive function to generate all unique subsets of this array. Each subset should be unique, even if the array contains duplicate elements. The solution should not generate any duplicate subsets.
A subset of a set is a collection of elements that are all derived from the original set. Subsets can range from the empty set (containing no elements) to the set itself (containing all elements).
You need to complete the uniqueSubsets function.
​
Input Format
    • The first line contains one integer n, the size of the array. - Next line contains n integers arr[0],arr[1]...arr[n], representing the elements of the array in the sorted order. 

Output Format
    • Complete the uniqueSubsets function to generate all the subsets. 
    • Return a 2d vector of unique Subsets. 
    • Printing the subset will be done by the rest of the code. 

Constraints
    • 1 ≤ n ≤ 10 
    • 1 ≤ arr[i] ≤ 25 

Input
2
1 2

Output
[]
[1]
[1 2]
[2]

Input
3
1 2 2

Output
[]
[1]
[1 2]
[1 2 2]
[2]
[2 2]

*/
//Solution
import java.util.*;
class Codechef {
    public static List<List<Integer>> uniqueSubsets(int[] multiset) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> subsets = new ArrayList<>();
        generate(multiset, 0, subset, subsets);
        return subsets;
    }
    static void generate(int[] multiset, int index, List<Integer> subset, List<List<Integer>> subsets){
        subsets. add(new ArrayList<>(subset));
        for(int i=index; i<multiset.length; i++)
        {
            if(i>index && multiset[i] == multiset[i-1])
                continue;
            subset.add(multiset[i]);
            generate(multiset, i+1, subset, subsets);
            subset.remove(subset.size()-1);
        }
    }
    public static void printSubsets(List<List<Integer>> subsets) {
        for (List<Integer> subset : subsets) {
            System.out.print("[");
            for (int i = 0; i < subset.size(); ++i) {
                System.out.print(subset.get(i));
                if (i < subset.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] multiset = new int[n];
        for (int i = 0; i < n; ++i) {
            multiset[i] = scanner.nextInt();
        }
        List<List<Integer>> result = uniqueSubsets(multiset);
        printSubsets(result);
    }
}
/*
For your unique subsets solution:
generate(multiset, i + 1, subset, subsets);
the time and space are best understood from the number of subsets.
​
Time Complexity: O(2ⁿ × n)
There can be up to: 2ⁿ unique subsets.
For every subset, we do: new ArrayList<>(subset)
which can copy up to n elements.
So: 2ⁿ subsets × n copying  = O(n × 2ⁿ)
For n = 10: 2¹⁰ = 1024
So at most about 1024 subsets when all elements are different.
​ Space Complexity: O(n × 2ⁿ) Why?
We store all the generated subsets in:
List<List<Integer>> subsets
There can be up to 2ⁿ subsets, and each subset can contain up to n elements.
Therefore: O(n × 2ⁿ)
There is also recursion depth of: O(n)
but the stored answer is much larger.
​
Simple way to remember
Complexity			Answer
Time				O(n × 2ⁿ)
Space				O(n × 2ⁿ)
The 2ⁿ comes from the fact that every element can basically be taken or not taken.

*/

/*
One phrase to remember:
“Choose → Recurse → Undo”
For your unique subsets:
Choose element
     ↓
Recurse with i + 1
     ↓
Undo (remove element)
And for duplicates:
“Skip same at same level.”
*/




