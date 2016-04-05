import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionUsingThrows {

	public void readFile() throws FileNotFoundException, NullPointerException {

		FileReader fr = new FileReader("a.txt");

		throw new NullPointerException(); // want to throw an exception
											// explicitly

	}

	public static void main(String args[]) {

		CheckedExceptionUsingThrows e1 = new CheckedExceptionUsingThrows();

		try {
			e1.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
