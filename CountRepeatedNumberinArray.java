
import java.util.Arrays;

public class CountRepeatedNumberinArray {

	public static void main(String ar[]) {
		int a[] = { 5, 4, 7, 2, 3, 3, 3, 2, 1, 1, 1, 9, 8 };

		Arrays.sort(a);
		int last = a[0];
		int count = 0;
		System.out.println("SORTED ARRAY ");
		for (int i : a)

		{
			System.out.print(i + "  ");
		}

		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == last) {
				count++;
				continue;
			}

			System.out.println(last + " appeared " + count + " times");
			last = a[i];
			count = 1;
		}
		System.out.println(last + " appeared " + count + " times");
	}

}
