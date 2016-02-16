import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Compressor {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String answer = getCompact(input);
		System.out.println("Compact string is " + answer);
	}

	private static String getCompact(String input) {
		char[] div = input.toCharArray();
		String answer = "";
		int counter = 1;
		boolean flag = false;
		for (int i = 0; i < div.length - 1; i++) {
			
			if (div[i] == div[i + 1] && (i + 1) == (div.length - 1)) {
				flag = true;
				counter++;
				Integer tmp = (Integer) (counter);
				String tmpStr = tmp.toString();
				answer = answer + div[i] + tmpStr;
				counter = 1;
				
			}
			
			if (div[i] == div[i + 1]) {
				counter++;
				continue;
			}
			
			Integer tmp = (Integer) counter;
			String tmpStr = tmp.toString();
			answer = answer + div[i] + tmpStr;
			counter = 1;

		}
		if (flag == false) {
			answer = answer + div[div.length - 1] + "1";
		}
		return answer;
	}
}