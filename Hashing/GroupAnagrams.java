/*
​ GROUP ANAGRAMS

You are given N strings. Your task is to group the strings that are anagrams of each other. Complete the given function. An anagram is a string formed by rearranging the letters of a another string, using all the original letters exactly once. For example, "listen" and "silent" are anagrams of each other because they contain the same letters.
​
Input Format
    • The first line of input contains an integer N — the number of strings. 
    • The next N lines contain strings. 

Output Format
    • Complete the function which return the vector of string vectors. each string vector are group of anagram strings. 
    • You can return the groups of anagrams in any order. 

Constraints
    • 1≤N≤100000 
    • All strings are of lowercase latin letters. 
    • Size of each string is at most 10. 

Input
5
abc
dba
acb
bda
cba

Output
abc acb cba 
dba bda

​Time Complexity
Let the maximum string length be K (here K ≤ 10).
For each string:
    • Convert to character array → O(K) 
    • Sort characters → O(K log K) 
    • HashMap operation → O(K) approximately for hashing the key 
So: Time: O(N × K log K)
Since K ≤ 10, this is very small in practice.

Space: O(N × K)  because we store all strings in the HashMap groups.

Simple memory word:	Sort → Key → Group
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String each: strs)
        {
            char a[] = each.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(each);
        }
        return new ArrayList<>(map.values()); 
    }
}

