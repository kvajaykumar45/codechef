/*
/*
Valid Anagram

You are given two strings ss and tt. Your task is to determine whether tt is an anagram of ss.

An anagram is a word formed by rearranging the letters of another word, using all the original letters exactly the number of times it is used.
Function Declaration
Function Name

isAnagramisAnagram – This function checks whether one string is an anagram of another string.
Parameters

    ss : A string representing the original word.
    tt : A string to be checked as an anagram of ss.

Return Value

    Returns truetrue if tt is an anagram of ss.
    Returns falsefalse otherwise.

Constraints

    1≤∣s∣,∣t∣≤5×10^4
    Both ss and tt consist of lowercase English letters (a–z).

Input Format

    The first line contains a single string ss.
    The second line contains a single string tt.

Output Format

    Print YES if tt is an anagram of ss.
    Print NO otherwise.
Input
hello
world


Output
No

*/

//Java Solution

public static boolean isAnagram(String s, String t) {
    char [] s1 = s.toCharArray();
    char [] t1 = t.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(t1);
    return Arrays.equals(s1, t1);
}


