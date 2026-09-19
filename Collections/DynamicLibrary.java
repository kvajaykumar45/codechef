/*
 DYNAMIC LIBRARY DATABASE
You are managing a library system. Initially, the library contains no books. You need to process Q operations. The operations can be of the following types:

    • ADD title copies: Add copies number of copies for the book with the given title. If the book already exists, increase its available copy count by copies. 

    • BORROW title: Attempt to borrow 1 copy of the book with the given title. 
        ◦ If at least 1 copy is available, decrease its available copy count by 1. 
        ◦ If no copies are available (or the book does not exist), output FAIL. 

    • COUNT title: Output the current number of available copies for the book with the given title. If the book does not exist, output 0. 

    • TOP K: Output the titles of the K books that currently have the highest number of available copies, separated by spaces. 

Books are sorted primarily by the number of copies in descending order.If two or more books have the same number of copies, break ties by sorting their titles in lexicographical (alphabetical) order.

Input Format
    • The first line of input contains a single integer Q — the number of operations. 
    • The next Q lines each contain an operation in one of the formats described above (ADD, BORROW, COUNT, or TOP). 

Output Format
    • For each BORROW operation that fails, print FAIL on a new line. 
    • For each COUNT operation, print the current copy count on a new line. 
    • For each TOP operation, print K space-separated titles on a new line. 

Constraints
    • 1 ≤ Q ≤ 2⋅10^5 
    • 1 ≤ copies ≤ 10^9 

Input
9
ADD Java 5
ADD Python 8
BORROW Java
COUNT Java
TOP 2
ADD Cpp 8
TOP 3
BORROW Python
TOP 2

Output
4
Python
Java
Cpp
Python
Java
Cpp
Python

For the TreeSet approach:
    • ADD / BORROW → O(log N)
    • TOP K → O(K)
For your ArrayList + sorting approach:
    • ADD / BORROW → O(1)
    • TOP K → O(N log N)
So if there are many TOP operations, TreeSet can be much faster overall.
For example, with:
N = 100,000 books
K = 5
One TOP 5:
ArrayList approach → O(100000 log 100000)
TreeSet approach   → O(5)
So the key difference is:
ArrayList approach sorts when TOP is requested. TreeSet maintains the sorted order continuously.
For this problem's Q = 2 × 10⁵, I'd prefer HashMap + TreeSet.
*/

//HashMap + ArrayList + Sorting
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		HashMap<String, Integer> books = new HashMap<>();
		while(q-- > 0)	{
		    String operation = sc.next();
		    if(operation.equals("ADD")){
		        String title = sc.next();
		        int copies = sc.nextInt();
		        if(books.containsKey(title))
		            books.put(title, books.get(title)+copies);
		        else
		            books.put(title, copies);
		    }
		    else if(operation.equals("BORROW")) {
		        String title = sc.next();
		        if(books.containsKey(title)){
		            if(books.get(title)>0)
		                books.put(title, books.get(title)-1);
		            else
		                System.out.println("FAIL");
		        }
		        else
		            System.out.println("FAIL");	        
		    }
		    else if(operation.equals("COUNT")){
		        String title = sc.next();
		        if(books.containsKey(title))
		            System.out.println(books.get(title));
		        else
		            System.out.println(0);
		    }
		    else if(operation.equals("TOP")){
		        int k = sc.nextInt();
		        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(books.entrySet());
		        Collections.sort(list, (a,b)-> {
		            if(a.getValue() != b.getValue())
		                return b.getValue() - a.getValue();
		            return a.getKey().compareTo(b.getKey());
		        });
		        for(int i=0; i<k; i++)
		            System.out.println(list.get(i).getKey());
		    }
		}
	}
}

//HashMap + TreeSet
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        HashMap<String, Integer> books = new HashMap<>();

        TreeSet<Map.Entry<String, Integer>> set =
            new TreeSet<>((a, b) -> {
                if (!a.getValue().equals(b.getValue()))
                    return Integer.compare(b.getValue(), a.getValue());
                return a.getKey().compareTo(b.getKey());
            });

        while (q-- > 0)
        {
            String operation = sc.next();
            if (operation.equals("ADD"))
            {
                String title = sc.next();
                int copies = sc.nextInt();

                if (books.containsKey(title))
                {
                    int oldCopies = books.get(title);
                    set.remove(new AbstractMap.SimpleEntry<>(title, oldCopies));
                    int newCopies = oldCopies + copies;
                    books.put(title, newCopies);
                    set.add(
                        new AbstractMap.SimpleEntry<>(title, newCopies)
                    );
                }
                else
                {
                    books.put(title, copies);
                    set.add(
                        new AbstractMap.SimpleEntry<>(title, copies)
                    );
                }
            }
            else if (operation.equals("BORROW"))
            {
                String title = sc.next();
                if (!books.containsKey(title))
                {
                    System.out.println("FAIL");
                    continue;
                }
                int oldCopies = books.get(title);
                if (oldCopies == 0)
                {
                    System.out.println("FAIL");
                    continue;
                }
                set.remove(
                    new AbstractMap.SimpleEntry<>(title, oldCopies)
                );
                int newCopies = oldCopies - 1;
                books.put(title, newCopies);
                set.add(
                    new AbstractMap.SimpleEntry<>(title, newCopies)
                );
            }
           else if (operation.equals("COUNT"))
            {
                String title = sc.next();
                System.out.println(
                    books.getOrDefault(title, 0)
                );
            }
           else if (operation.equals("TOP"))
            {
                int k = sc.nextInt();
                int count = 0;
                for (Map.Entry<String, Integer> entry : set)
                {
                    System.out.print(entry.getKey());
                    count++;
                    if (count == k)
                        break;
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}

///HashMap + TreeSet + Class
import java.util.*;
import java.lang.*;
import java.io.*;

class Book
{
    String title;
    long copies;

    Book(String title, long copies)
    {
        this.title = title;
        this.copies = copies;
    }
}
class Codechef
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        HashMap<String, Book> books = new HashMap<>();
        TreeSet<Book> set = new TreeSet<>((a, b) ->
        {
            if (a.copies != b.copies)
                return Long.compare(b.copies, a.copies);
            return a.title.compareTo(b.title);
        });

        while (q-- > 0)
        {
            String operation = sc.next();
            if (operation.equals("ADD"))
            {
                String title = sc.next();
                long copies = sc.nextLong();
                if (books.containsKey(title))
                {
                    Book oldBook = books.get(title);
                    set.remove(oldBook);
                    oldBook.copies += copies;
                    set.add(oldBook);
                }
                else
                {
                    Book book = new Book(title, copies);
                    books.put(title, book);
                    set.add(book);
                }
            }
            else if (operation.equals("BORROW"))
            {
                String title = sc.next();
                if (!books.containsKey(title))
                {
                    System.out.println("FAIL");
                    continue;
                }
                Book book = books.get(title);
                if (book.copies == 0)
                {
                    System.out.println("FAIL");
                    continue;
                }
                set.remove(book);
                book.copies--;
                set.add(book);
            }
            else if (operation.equals("COUNT"))
            {
                String title = sc.next();
                if (books.containsKey(title))
                    System.out.println(books.get(title).copies);
                else
                    System.out.println(0);
            }
            else if (operation.equals("TOP"))
            {
                int k = sc.nextInt();
                int count = 0;
                for (Book book : set)
                {
                    System.out.print(book.title);
                    count++;
                    if (count == k)
                        break;
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
