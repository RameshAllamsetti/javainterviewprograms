
import java.io.File;

public class CountFilesandDirsExample {
	public static void main(String args[]) {

		File f1 = new File("//Users//rallamsetti//Documents/2016 Tax Receipts");
		int filecount = 0;
		int dirCount = 0;
		String[] s = f1.list();
		for (String s1 : s) {
			File f2 = new File(f1, s1);

			if (f2.isFile()) {
				filecount++;
			} else if (f2.isDirectory()) {
				dirCount++;
			}

			System.out.println(s1);
		}

		System.out.println("Total Number of files : " + filecount);
		System.out.println("Total Number of dirs: " + dirCount);

	}
}
