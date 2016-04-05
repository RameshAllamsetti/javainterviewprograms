import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdIsValid {
	public static void main(String[] args) {
		Pattern p = Pattern
				.compile("[a-zA-Z0-9][0-9a-zA-Z._]*@[a-zA-Z0-9]+[(.)+[a-zA-Z]+]+");

		String s = "ramesh531abc_ab@gmail";

		Matcher m = p.matcher(s);

		// while(m.find())
		// System.out.println(m.group());

		if (m.find() && m.group().equals(s))
			System.out.println("Valid Email id");
		else
			System.out.println("Invalid EmailId");

	}

}
