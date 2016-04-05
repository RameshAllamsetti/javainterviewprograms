
import java.util.Arrays;

public class SortStringWithoutUsingSortFunction {

	public static void main(String ar[]) {
		// String sorting using sort function

		String s = "ramesh";
		char[] ch = s.toCharArray();

		Arrays.sort(ch);

		String sortedString = new String(ch);
		System.out.println("Sorted String : " + sortedString);

		// String sorting without using sort function
		String original = "fafasedcba";
		int j = 0;
		char temp = 0;

		char[] chars = original.toCharArray();

		for (int i = 1; i < chars.length; i++) {

			for (j = 0; j < chars.length; j++) {

				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}

		for (int k = 0; k < chars.length; k++) {
			System.out.print(chars[k]);
		}

	}

}
