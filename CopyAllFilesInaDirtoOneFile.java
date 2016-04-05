
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyAllFilesInaDirtoOneFile {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(
				"//Users//rallamsetti//Desktop//output.txt");
		File f = new File("//Users/rallamsetti//Destop//ReadDir");
		String[] s = f.list();
		for (String s1 : s) {
			// Print the file names:
			System.out.println(s1);
			File f1 = new File(f, s1);
			BufferedReader br = new BufferedReader(new FileReader(f1));
			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}

		}

		pw.flush();

	}

}
