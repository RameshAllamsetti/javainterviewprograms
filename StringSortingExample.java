import java.util.Arrays;

public class StringSortingExample {

	public static void main(String args[]) {

		// Sort a given String

		String s1 = "Ramesh  Allamsetti";
		char[] ch = s1.toCharArray();

		System.out.println("Given Input String   : " + s1);
		System.out.println("String AFter Sorting : ");
		Arrays.sort(ch);
		for (char ch1 : ch)
			System.out.print(ch1);
		System.out.println();
	}

}
