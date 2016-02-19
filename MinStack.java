import java.util.List;
import java.util.ArrayList;

class MinStack {

	List<Integer> myStack = new ArrayList<Integer>();
	List<Integer> minStack = new ArrayList<Integer>();

	public void push(int x) {
		myStack.add(x);
		if (minStack.isEmpty()) {
			minStack.add(x);
		} else {
			if (minStack.get(minStack.size() - 1) >= x) {
				minStack.add(x);
			}
		}
	}

	public void pop() {
		if (this.top() == minStack.get(minStack.size() - 1)) {
			minStack.remove(minStack.size() - 1);
		}
		myStack.remove(myStack.size() - 1);
	}

	public int top() {
		return myStack.get(myStack.size() - 1);
	}

	public int getMin() {
		return minStack.get(minStack.size() - 1);
	}
}
