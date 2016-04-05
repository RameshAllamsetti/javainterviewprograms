
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeDataofTwofilesIntoOneFile {

	public static void main(String args[]) throws IOException {
		// Merge 2 files Data into one File File3.txt
		PrintWriter pw = new PrintWriter(
				"//Users//rallamsetti//Desktop//file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader(
				"//Users//rallamsetti//Desktop//file2.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader(
				"//Users//rallamsetti//Desktop//file1.txt"));
		String line = br1.readLine();
		while (line != null) {
			pw.println(line);
			line = br1.readLine();
		}
		pw.flush();

		String line2 = br2.readLine();
		while (line2 != null) {
			pw.println(line2);
			line2 = br2.readLine();
		}
		System.out.println("File Merge is done");
		pw.flush();
		br1.close();
		br2.close();
		pw.close();

	}

}
