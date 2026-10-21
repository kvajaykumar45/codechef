


/*
Better Deal

There are 2 stores in Chefland and both sell the same product. The first store sells the product for 100 rupees whereas the second store sells it for 200 rupees.

It is the holiday season and both stores have announced a special discount. The first store is providing a discount of A percent on its product and the second store is providing a discount of B percent on its product.

Chef is wondering which store is selling the product at a cheaper price after the discount has been applied. Can you help him identify the better deal?

Input Format
    The first line of input will contain a single integer TT, denoting the number of test cases.
    Each test case consists of a single line of input containing two space-separated integers A and B denoting the discount provided by the first and second store respectively.

Output Format
For each test case, output FIRST if the first store is cheaper, SECOND if the second store is cheaper, and BOTH if both the stores are selling the product for the same price after discount.

The checker is case-insensitive so answers like FiRsT, first, and FIRST would be considered the same.

Constraints
1≤T≤1000
1≤A,B≤100

Input
4
5 20
10 60
7 7
10 55


Output
FIRST
SECOND
FIRST
BOTH

*/

//Source Code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int aprice = 100 * (100 - a) / 100;
            int bprice = 200 * (100 - b) / 100;

            if (aprice < bprice)
                System.out.println("FIRST");
            else if(aprice > bprice)
                System.out.println("SECOND");
            else 
                System.out.println("BOTH");
        }

    }
}

