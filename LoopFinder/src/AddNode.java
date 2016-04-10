public class AddNode {

	private static List head;

	private static void addNode(List node) {
		if (head == null) {
			head = node;
			return;
		}
		List curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
	}

	public static void main(String[] args) {
		List temp1 = new List(5);
		List temp2 = new List(10);
		List temp3 = new List(45);
		addNode(temp1);
		addNode(temp2);
		addNode(temp3);
	    makeLoop();
		// printNode();
		findLoop();
	}

	private static void makeLoop() {
		List curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = head;
	}

	private static void printNode() {
		System.out.println("Inside");
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	private static void findLoop() {
		List pointer1 = head;
		List pointer2 = head;
		while (pointer1 != null && pointer2 != null) {
			if (pointer1.next != null) {
				pointer1 = pointer1.next;
			} else {
				pointer1 = null;
			}
			if (pointer2.next != null) {
				pointer2 = pointer2.next;
				if (pointer2.next != null) {
					pointer2 = pointer2.next;
				} else {
					pointer2 = null;
				}
			}
			else{
				pointer2 = null;
			}
			if (pointer1 == pointer2) {
				System.out.println("Loop found");
				return;
			}
		}
		System.out.println("Loop not found");
	}
}
