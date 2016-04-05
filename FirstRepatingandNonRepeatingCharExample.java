import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstRepatingandNonRepeatingCharExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// First Repeat char and non repeated char in the string
		String s4 = "aRameshRame";
		List<Character> nrc = new ArrayList<>();
		Set<Character> rc = new LinkedHashSet<>();

		for (int i = 0; i < s4.length(); i++) {
			char ch2 = s4.charAt(i);

			if (rc.contains(ch2)) {
				continue;
			}
			if (nrc.contains(ch2)) {
				nrc.remove((Character) ch2);
				rc.add(ch2);
			} else {
				nrc.add(ch2);
			}

		}
		System.out.println("Given Input String : " + s4);
		System.out.println("First NonRepeating Char : " + nrc.get(0));
		System.out.println("All Non Repeating Characters: " + nrc);
		System.out.println("First Repeating Char : " + rc.iterator().next());
		System.out.println("All Repeating Characters : " + rc);

	}

}
