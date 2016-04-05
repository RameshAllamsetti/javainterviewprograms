
import java.util.Arrays;

public class StringAnagramOrNot {

	public static void main(String args[]) {

		// Anagram means two strings contains same characters but differnt order
		// . ex: pots & stop ex2:army & mary

		String givenString = "army";
		String anagram = "mary";

		char ch[] = givenString.toCharArray();
		char ach[] = anagram.toCharArray();

		System.out.println("Givne Strings: " + givenString + "   " + anagram);

		Arrays.sort(ch);
		Arrays.sort(ach);

		if (Arrays.equals(ch, ach)) {
			System.out.println("Given Strings are anagrams");
		}

		else
			System.out.println("Given Strings are not anagrams");

	}

}
