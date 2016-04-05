
import java.util.ArrayList;

public class RemoveDuplicateFromArrayUsingArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int input[] = { 2, 3, 3, 5, 6, 9, 9 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {
			if (!list.contains(input[i])) {
				// System.out.println(input[i]);
				list.add(input[i]);
			}
		}

		System.out.println("ARRAY AFTER REMOVING DUPLICATES");
		for (int i : list) {
			System.out.print(i + "  ");

		}

	}

}
