/*
​ LAYERED PROPERTIES MANAGER

A company stores the performance records of N employees. Each employee has:
    • A unique employee name 
    • A performance score 
    • A number of completed projects 

The company applies the following filtering rules:
    • Remove every employee whose performance score is strictly less than P. 
    • Remove every employee whose number of completed projects is strictly less than M. 

After removing the ineligible employees, sort the remaining employees using the following rules:
    • Higher performance score comes first. 
    • If two employees have the same score, the employee with more completed projects comes first. 
    • If both score and project count are equal, sort their names lexicographically. 
Print the remaining employees in the required order.

Note: Use an Iterator to safely remove employees from the collection and a Comparator to sort the remaining employees.
​
Input Format
    • The first line contains three integers: N, P, and M — representing the total number of employees, the minimum required performance score, and the minimum required number of completed projects, respectively. The next N lines each contain: 
    • name score projects 

Output Format
    • Print every eligible employee on a new line in the following format: name score projects 
    • If no employee remains after filtering, print: NO EMPLOYEE 

Constraints
    • 1 <= N <= 100000 
    • 0 <= P <= 100 
    • 0 <= M <= 100000 
    • 0 <= score <= 100 
    • 0 <= projects <= 100000 
    • 1 <= length of name <= 20 
    • Employee names contain only uppercase and lowercase English letters. 

Input
5 50 2 
Zoya 70 4 
Amit 70 4 
Neeraj 70 5 
Bhavna 80 2 
Chetan 50 10

Output
Bhavna 80 2
Neeraj 70 5
Amit 70 4
Zoya 70 4
Chetan 50 10
*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Employee {
    String name;
    int score;
    int projects;
    Employee(String n, int ps, int m){
        name = n;
        score = ps;
        projects = m;
    }
}
class Codechef {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int minp = sc.nextInt();
		int minm = sc.nextInt();
		ArrayList<Employee> emps = new ArrayList<>();
		for(int i=1; i<=n; i++)	{
		    String name = sc.next();
		    int pscore = sc.nextInt();
		    int pcount = sc.nextInt();
		    if(pscore >= minp && pcount >= minm)
		        emps.add(new Employee(name, pscore, pcount));
		}
		emps.sort((a,b)->{
		            if(a.score != b.score)
		                return b.score - a.score;
		            if(a.projects != b.projects)
		                return b.projects - a.projects;
		            return a.name.compareTo(b.name);
		    }); 
		for(Employee each: emps)
		{
		System.out.println(each.name+" "+each.score+" "+each.projects);
		}
	}
}




/*
Operation			Complexity
Filter				O(n)
Sort				O(k log k)
Print				O(k)
Total				O(n + k log k)

Space				O(k)
*/



