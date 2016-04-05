
import java.util.Arrays;

public class CountRepeatedNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args)

	{

		int a[] = { 1, 4, 1, 5, 2, 2, 4, 3, 4, 5, 5, 1 };

		Arrays.sort(a);

		System.out.println("SORTED ARRAY");
		for (int i : a) {
			System.out.print(i + "   ");
		}

		System.out.println();
		int last = a[0];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == last) {
				count++;
				continue;
			}

			System.out
					.println("Number " + last + " found " + count + " times.");
			count = 1;
			last = a[i];
		}

		System.out.println("Number " + last + " found " + count + " times.");

	}

}
