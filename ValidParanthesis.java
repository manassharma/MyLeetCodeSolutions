import java.util.Stack;

/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

*/

public class ValidParanthesis {
	public boolean isValid(String s) {
		Stack<Character> validate = new Stack<Character>();

		char[] temp = s.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == '(' || temp[i] == '{' || temp[i] == '[') {
				validate.push(temp[i]);
			}

			else if (temp[i] == ')') {
				if (!validate.isEmpty()) {
					if (validate.peek() == '(') {
						validate.pop();
					} else {
						validate.push(temp[i]);
					}
				} else {
					validate.push(temp[i]);
				}

			} else if (temp[i] == '}') {
				if (!validate.isEmpty()) {
					if (validate.peek() == '{') {
						validate.pop();
					} else {
						validate.push(temp[i]);
					}
				} else {
					validate.push(temp[i]);
				}

			} else if (temp[i] == ']') {
				if (!validate.isEmpty()) {
					if (validate.peek() == '[') {
						validate.pop();
					} else {
						validate.push(temp[i]);
					}
				} else {
					validate.push(temp[i]);
				}
			}
		}

		if (validate.isEmpty()) {
			return true;
		}
		return false;
	}
}