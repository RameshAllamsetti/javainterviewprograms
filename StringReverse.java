public class StringReverse {

	public static void main(String[] args) {

		// Reverse of a string
		String s = "HelloRamesh";
		String rs = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rs = rs + s.charAt(i);
		}
		System.out.println("Given String  : " + s);
		System.out.println("Reverse String: " + rs);

	}

}
