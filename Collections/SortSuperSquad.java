/*
SORT THE SUPER SQUAD
You’ve been hired to build a superhero ranking system. Each superhero has a name, power level, and city. You need to sort a list of superheroes according to the following rules:
    • Sort by power level in descending order. 
    • If two superheroes have the same power level, sort them by name in ascending order. 

Input Format
    • The first line contains an integer N — the number of superheroes. 
    • The next N lines each contain the superhero's name, powerLevel, and city, separated by spaces. 

Output Format
    • Print the sorted list of superheroes, one per line, in the following format: name (powerLevel) - city 

Constraints
    • 1 <= N <= 1000 
    • 1 <= powerLevel <= 1000 
    • name and city contain only English letters without spaces. 

Input
4
Bolt 85 Metroville
Aqua 90 OceanCity
Blaze 85 Firetown
Zapper 92 ElectroCity

Output
Zapper (92) - ElectroCity  
Aqua (90) - OceanCity  
Blaze (85) - Firetown  
Bolt (85) - Metroville
*/

Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class SuperHero {
    String heroName;
    int powerLevel;
    String city;
    SuperHero(String heroName, int powerLevel, String city) {
        this.heroName = heroName;
        this.powerLevel = powerLevel;
        this.city = city;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SuperHero heroes[] = new SuperHero[n];
		for(int i=0; i<n; i++)
		{
		    String name = sc.next();
		    int level = sc.nextInt();
		    String city = sc.next();
		    heroes[i] = new SuperHero(name, level, city);
		}
		
		Arrays.sort(heroes, (a,b) -> { if(a.powerLevel != b.powerLevel)
		                                return b.powerLevel - a.powerLevel;
		                                return a.heroName.compareTo(b.heroName);
		                             }); 
		for(SuperHero hero: heroes)
		 System.out.println(hero.heroName + " ("+hero.powerLevel+") - "+ hero.city);
	}
}

/*
Complexity	Value
Time		O(N log N)
Space		O(N)
*/
