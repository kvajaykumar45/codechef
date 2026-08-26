/*
BOOK ALLOCATION
You have N books, where the i-th book has A[i] pages. There are M students.
You need to distribute all books to the students with these rules:
    • Each student must get at least one book. 
    • Each book can be given to only one student. 
    • The books given to a student must be next to each other (contiguous). 
Your task is to distribute the books so that the maximum pages any student gets is as small as possible.
If it is not possible to distribute the books, print -1.

Input Format
    • First line: two integers N (number of books) and M (number of students). 
    • Second line: N integers, where A[i] = pages in the i-th book. 

Output Format
    • Print the minimum possible value of the maximum pages assigned to a student. 
    • If distribution is not possible, print -1. 

Constraints
1 ≤ N, M ≤ 10⁴
1 ≤ A[i] ≤ 10⁵

Sample 1:
Input
4 2
12 34 67 90
Output 113

Explanation:
Student 1: 12 + 34 + 67 = 113 Student 2: 90 Maximum = 113
            ​ 
Sample 2:
Input
5 4
25 46 28 49 24
Output 71

Explanation:
Student 1: 25 + 46 = 71 Student 2: 28 Student 3: 49 Student 4: 24 Maximum = 71

*/

//Java Solution
  static long allocateBooks(long[] books, int N, int M) {
      if(N < M)
        return -1;
      long low = books[0];
      long high = books[0];
      for(int i=1; i<N; i++)
      {
            if(books[i] > low)
                low = books[i];
            high += books[i];
      }
      long answer=-1;
      while(low <= high)
      {
          long middle = low + (high-low)/2;
          long currentsum = 0;
          int students = 1;
          
          for(int i=0; i<N; i++)
          {
              if(currentsum + books[i] <= middle)
              {
                  currentsum += books[i];
              }
              else
              {
                  students++;
                  currentsum = books[i];
              }
          }
          if(students <= M)
          {
              answer = middle;
              high = middle - 1;
          }
          else
          {
              low = middle + 1;
          }
      }
      return answer;       
  }
  
/*  
Time  : O(N log(sum of pages))
Space : O(1)

*/
