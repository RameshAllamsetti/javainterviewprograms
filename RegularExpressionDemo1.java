
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {

	public static void main(String[] args) {

		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("ababbaabcab   abdab");

		while (m.find()) {
			System.out.println(m.start() + "-------" + m.end() + "------"
					+ m.group());
			count++;
		}

		System.out.println("No.of matches found are : " + count);

		Pattern p1 = Pattern.compile("[^0-9A-Za-z]"); // Only special characters
		Matcher m1 = p1.matcher("5$ab4&*AB");
		while (m1.find()) {
			System.out.println(m1.start() + "------" + m1.group());
		}

	}

}
