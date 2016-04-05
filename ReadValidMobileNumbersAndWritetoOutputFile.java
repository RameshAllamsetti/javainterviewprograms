import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadValidMobileNumbersAndWritetoOutputFile {

	/**
	 * This program will read all valid mobile numbers from a.txt file and write
	 * the valid mobile numbers to mobilenumbers.txt file
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");

		BufferedReader br = new BufferedReader(new FileReader(
				"//Users//rallamsetti//Desktop//filesdir//a.txt"));
		PrintWriter pw = new PrintWriter(
				"//Users//rallamsetti//Desktop//filesdir//mobilenumbers.txt");
		String line = br.readLine();
		int count = 0;

		while (line != null) {
			Matcher m = p.matcher(line);
			if (m.find()) {
				count++;

				pw.println(m.group());
			}
			line = br.readLine();
		}

		System.out
				.println(count + " Mobile numbers are copied to the txt file");
		pw.flush();
		pw.close();
		br.close();
	}

}
