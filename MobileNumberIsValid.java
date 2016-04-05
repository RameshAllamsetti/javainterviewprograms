import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberIsValid {
	public static void main(String[] args) throws IOException {

		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");

		String s = "07884544372";
		Matcher m = p.matcher(s);

		if (m.find() && m.group().equals(s))
			System.out.println("Valid Mobile Number");
		else
			System.out.println("Invalid Mobile Number");

	}

}
