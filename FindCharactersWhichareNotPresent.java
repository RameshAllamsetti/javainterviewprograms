import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCharactersWhichareNotPresent {

	public static void main(String args[]) {
		String s1 = "Hello Ramesh How are343 you?";
		String s2 = "";
		Pattern p1 = Pattern.compile("[a-z]");

		Matcher ma = p1.matcher(s1);

		// Remove all the characaters apart from a to z
		while (ma.find()) {
			System.out.print(ma.group());
			s2 = s2 + ma.group();
		}
		System.out.println();
		// Contains only lower case letters without any uppercase digits and
		// Specialcharacters
		System.out.println(s2);

		// Remove Duplicates
		String rdc = "";
		for (int i = 0; i < s2.length(); i++) {
			if (!rdc.contains(String.valueOf(s2.charAt(i)))) {

				rdc = rdc + s2.charAt(i);
			}
		}

		System.out.println(rdc);

		// Keep S2 in alphabetical order
		char ch[] = rdc.toCharArray();
		Arrays.sort(ch);
		String s3 = new String(ch);
		System.out.println(s3);

		String s4 = "abcdefghijklmnopqrstuvwxyz";
		char ch2[] = s4.toCharArray();

		ArrayList<Character> al = new ArrayList<>();
		for (int i = 0; i < ch.length; i++) {
			al.add(ch[i]);

		}

		System.out.println(al);

		for (int i = 0; i < ch2.length; i++) {
			if (!al.contains(ch2[i])) {
				System.out.print(ch2[i] + "  ");
			}

		}

	}

}
