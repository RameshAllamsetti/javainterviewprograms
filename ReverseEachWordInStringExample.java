public class ReverseEachWordInStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Reverse each word in the String
		String s3 = "Hello Ramesh How are you   doing";
		String[] sarray = s3.split("\\s");
		// String[] sarray = s3.split(" ");
		StringBuffer sb = null;
		String rs2 = "";
		for (int i = sarray.length - 1; i >= 0; i--) {
			rs2 = rs2 + sarray[i] + " ";
			// System.out.println(rs2);
			sb = new StringBuffer(rs2);
			sb.reverse();
		}
		System.out.println("Given Input String  : " + s3);
		System.out.println("Reversing each word : " + sb);

	}

}
