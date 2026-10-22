/*
Cutting Recipes

The chef has a recipe he wishes to use for his guests, but the recipe will make far more food than he can serve to the guests. The chef therefore would like to make a reduced version of the recipe which has the same ratios of ingredients, but makes less food. The chef, however, does not like fractions. The original recipe contains only whole numbers of ingredients, and the chef wants the reduced recipe to only contain whole numbers of ingredients as well. Help the chef determine how much of each ingredient to use in order to make as little food as possible.

Input Format
Input will begin with an integer T, the number of test cases. Each test case consists of a single line. The line begins with a positive integer N, the number of ingredients. N integers follow, each indicating the quantity of a particular ingredient that is used.

Output Format
For each test case, output exactly N space-separated integers on a line, giving the quantity of each ingredient that the chef should use in order to make as little food as possible.

Constraints
T ≤ 100
2 ≤ N ≤ 50
All ingredient quantities are between 1 and 1000, inclusive.

Input
3
2 4 4
3 2 3 4
4 3 15 9 6

Output
1 1
2 3 4
1 5 3 2
*/

//Source Code

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
                
            int g = a[0];
            for(int i=1; i<n; i++)
                g = gcd(g, a[i]);
            for(int i=0; i<n; i++)
                System.out.print(a[i]/g + " "); 
            System.out.println();
        }

    }
}

