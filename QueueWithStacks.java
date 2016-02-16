import java.util.Stack;

public class QueueWithStacks {
	Stack<Integer> queueStack1 = new Stack<Integer>();
	Stack<Integer> queueStack2 = new Stack<Integer>();
	int peek;

	// Push element x to the back of queue.
	public void push(int x) {
		if (queueStack1.isEmpty()) {
			peek = x;
		}
		queueStack1.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		while (!queueStack1.isEmpty()) {
			queueStack2.push(queueStack1.pop());
		}
		queueStack2.pop();
		if (!queueStack2.isEmpty()) {
			peek = queueStack2.peek();
		}
		while (!queueStack2.isEmpty()) {
			queueStack1.push(queueStack2.pop());
		}

	}

	// Get the front element.
	public int peek() {
		return peek;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		if (queueStack1.isEmpty()) {
			return true;
		}
		return false;
	}
}
