/*
​ BROWSER BACK HISTORY
A web browser maintains a history of visited pages so that users can move backward and forward between previously visited pages. Initially, the browser has no current page.

You are given Q operations. Each operation is one of the following:
    • visit X — Visit the page with ID X. 
    • back — Move to the previously visited page, if one exists. 
    • forward — Move to the next page in the forward history, if one exists. 

The browser follows these rules:
    • When visit X is performed, page X becomes the current page. 
    • If a new page is visited after performing one or more back operations, the entire forward history is cleared. 
    • The back operation does nothing if there is no previous page. 
    • The forward operation does nothing if there is no page available in the forward history. 
    • Page IDs are not necessarily unique. The same page may be visited multiple times. 

Your task is to process all Q operations and print the page that is currently open after all operations have been completed.
If no page has ever been visited, print Empty.
The browser history should be maintained efficiently using stack-based operations.
​
Input Format
    • The first line contains an integer Q, the number of operations. 
    • Each of the next Q lines contains one operation: 
        ◦ visit X 
        ◦ back 
        ◦ forward 

Output Format
Print the ID of the current page after processing all operations.
If no page exists, print: Empty

Input
5
visit 10
visit 20
back
visit 30
visit 40

Output
40

*/
//Solution

import java.io.*;
import java.util.*;

class BrowserHistory
{
    private Deque<Integer> backStack;
    private Deque<Integer> forwardStack;
    BrowserHistory()
    {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
    }
    private int current = 0;
    void visit(int pageId)
    {
        backStack.push(current);
        current = pageId;
        forwardStack.clear();
    }
    void back()
    {
        if(!backStack.isEmpty())
        {
            int pid = backStack.pop();
            forwardStack.push(current);
            current = pid; 
        }
    }
    void forward()
    {
         if(!forwardStack.isEmpty())
        {
            backStack.push(current);
            current = forwardStack.pop();
        }
    }
    String getCurrentPage()
    {
       if(current != 0)
            return String.valueOf(current); 
        return "Empty";
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        BrowserHistory history = new BrowserHistory();
        while (q-- > 0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();
            if(operation.equals("visit"))
            {
                int pid = Integer.parseInt(st.nextToken());
                history.visit(pid);
            }
            else if(operation.equals("back"))
            {
                history.back(); 
            }
            else if(operation.equals("forward"))
            {
                history.forward();
            }
        }
        System.out.println(history.getCurrentPage());
    }
}

​/*
Time Complexity
Each operation is O(1) except forwardStack.clear().
    • back() → O(1)
    • forward() → O(1)
    • visit() → O(1) for push operations, but clear() can take O(Q) in the worst case because it may remove many elements.
So, for Q operations, the overall worst-case time is:
O(Q) amortized.
Why amortized? Every page that gets put into the forward stack can only be removed from it once before being replaced/cleared.
​
Space Complexity
At most, the two stacks together can contain O(Q) page entries.
backStack    → O(Q)
forwardStack → O(Q)
current      → O(1)
Therefore:
Space = O(Q)
​

Final answer
Operation			Time
visit			O(1) amortized
back			O(1)
forward		O(1)
getCurrentPage		O(1)
All Q operations	O(Q) amortized

Space			O(Q)

One important point: don't say visit() is always O(1) if you're being precise, because forwardStack.clear() can remove multiple elements. But for the complete sequence of Q operations, the amortized complexity is O(Q).
*/

