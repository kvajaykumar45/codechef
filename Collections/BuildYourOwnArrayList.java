/*
BUILD YOUR OWN ARRAYLIST

You're working on a lightweight Java library where you cannot use built-in collections like ArrayList. Your task is to implement your own version of an ArrayList class that supports basic operations such as adding elements, retrieving elements by index, getting the size, and printing all elements.

This challenge is designed to test your understanding of dynamic arrays, internal resizing, and OOP concepts, all of which are foundational to understanding how the Java Collections Framework works under the hood.

Your custom MyArrayList class should support the following methods:
    1. void add(int element) – Adds an element to the end of the list. 
    2. int get(int index) – Returns the element at the given index. 
    3. int size() – Returns the number of elements in the list. 
    4. void print() – Prints all elements in the list space-separated on a single line. 

Internally, use a fixed-size array and resize it when needed (just like how ArrayList does it).

Input Format
    • First line: An integer Q – the number of operations. 
    • Next Q lines: Each line represents an operation in one of the following formats: 
        ◦ add X 
        ◦ get X 
        ◦ size 
        ◦ print 
Assume that inputs to get are always within bounds.

Output Format
    • For each get operation, output the value at that index. 
    • For size, print the current size. 
    • For print, output all elements on a single line, space-separated. 

Constraints
    • 1 <= length of T <= 10^4 
    • Text contains only lowercase and uppercase letters and spaces. 

Input
7
add 10
add 20
add 30
get 1
size
add 40
print

Output:
20
3
10 20 30 40
*/
//Solution
import java.util.*;
import java.lang.*;
import java.io.*;

class MyArrayList
{
    int data[];
    int size;
    MyArrayList(){
        data = new int[2];
        size=0;
    }
    void add(int element){
        if(size == data.length){
            resize();
        }
        data[size++] = element;
    }
    int get(int index){
        return data[index];
    }
    int size(){
        return size;
    }
    void print(){
        for(int i=0; i<size; i++)
            System.out.print(data[i]+" ");
    }
    void resize(){
        int newdata[] = new int[2*size];
        for(int i=0; i<size; i++)
            newdata[i] = data[i];
        data = newdata;
    }
}
class Codechef{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		MyArrayList list = new MyArrayList();
		int q = sc.nextInt();
		while(q-->0){
		    String operation = sc.next();
		    if(operation.equals("add"))
		        list.add(sc.nextInt());
		    else if(operation.equals("get"))
		        System.out.println(list.get(sc.nextInt()));
		    else if(operation.equals("size"))
		        System.out.println(list.size());
		    else if(operation.equals("print"))
		        list.print();
		}
	}
}

/*
​Time Complexity

    • add(int element): 
        ◦ Amortized O(1): Most of the time, adding an element just takes O(1) time. When the array is full, the resize() method takes O(N) time to copy elements to a new array of double the size. However, because we double the capacity each time, the resizing happens infrequently, making the amortized (average) time per add operation O(1). 

    • get(int index): O(1) since array elements are accessed directly by their index. 

    • size(): O(1) as it simply returns the tracking variable. 

    • print(): O(N) where N is the number of elements in the list, because we iterate through all elements to print them. 

    • Overall Operations (Q queries): If there are Q operations, the total time complexity is O(Q) (assuming a mix of O(1) gets/sizes and amortized O(1) adds). 

Space Complexity
    • O(N): Where N is the number of elements currently stored in the custom array list. We use an underlying primitive array (data), which requires memory proportional to the number of elements (plus some extra capacity due to doubling, which is at most a constant factor of 2N, dropping down to O(N) in Big-O notation). 

*/
