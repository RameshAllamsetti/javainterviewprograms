public class ReverseNumber {

	public int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String a[]) {
		// ReverseNumber nr = new ReverseNumber();
		// System.out.println("Result: "+nr.reverseNumber(0050));

		String s = "12321422";

		System.out.println(s);
		String rs = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rs = rs + s.charAt(i);
		}

		System.out.println("Reversed Number : " + rs);
	}
}