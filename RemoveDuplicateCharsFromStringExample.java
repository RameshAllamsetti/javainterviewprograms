public class RemoveDuplicateCharsFromStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Remove Duplicate characters from the given String
		String s2 = "aabbbbcdeffedgeaa  afdadf";
		String removeDups = "";
		for (int i = 0; i < s2.length(); i++) {
			if (!removeDups.contains(String.valueOf(s2.charAt(i))))
				removeDups += s2.charAt(i);

		}
		System.out.println("Given Input String with Duplicates: " + s2);
		System.out.println("String AFter Removing Duplicates  : " + removeDups);

	}

}
