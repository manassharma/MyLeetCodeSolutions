/*Implement the following operations of a stack using queues.

	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	empty() -- Return whether the stack is empty.

*/

import java.util.ArrayDeque;
import java.util.Deque;

public class StackWithQueues {
    // Push element x onto stack.
    private Deque<Integer> mainQueue = new ArrayDeque<>();

    int top = 0;
    public void push(int x) {
        mainQueue.add(x);
        top = x;
    }

    // Removes the element on top of the stack.
    public void pop() {
        mainQueue.removeLast();
        if(!mainQueue.isEmpty()){
            top = mainQueue.getLast();
        }
    }
    // Get the top element.
    public int top() {
        return top;   
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(mainQueue.isEmpty()){
            return true;
        }
        return false;
    }
}