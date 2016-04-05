
public class CountOccurancesOfCharInString {

	public static void main(String args[]) {
		String inputString = "Hello Ramesh How are you? Good Morning";

		System.out.println("Given String: " + inputString);

		int count = 0, foreachcount = 0;

		// Count no.of time o presented in the above string

		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == 'o') {
				count++;
			}
		}

		System.out.println("No.of times o occured in given string: " + count);

		// 2nd approach to find occurance of o in the given string
		for (char ch : inputString.toCharArray()) {
			if (ch == 'o')
				foreachcount++;
		}

		System.out.println("No.of times o occured in given string: "
				+ foreachcount);
	}

}
