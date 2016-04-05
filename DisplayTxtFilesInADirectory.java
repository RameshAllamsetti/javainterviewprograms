import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayTxtFilesInADirectory {

	/**
	 * Programs to display all the text files in the direcotry
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("//Users//rallamsetti//Desktop//filesdir");
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$_.]*(.)txt");
		String[] s = f.list();
		int count = 0;
		for (String s1 : s) {
			// BufferedReader br = new BufferedReader(new FileReader(s1));
			// System.out.println(s1);
			Matcher m = p.matcher(s1);
			if (m.find() && m.group().equals(s1)) {
				count++;
				System.out.println(m.group());

			}

		}

		System.out.println("Total Number of files: " + count);

	}

}
