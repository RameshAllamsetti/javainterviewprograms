import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

	public void readSample() {
		try {
			int i = 3;
			i = i + 1;
			i = i + 3;

			FileReader fr = new FileReader("a.txt");
			System.out.println("This won't be printed if a.txt is not there");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Control after the catch block");
	}

	public static void main(String args[]) {

		CheckedExceptionSample e1 = new CheckedExceptionSample();
		e1.readSample();

	}

}
