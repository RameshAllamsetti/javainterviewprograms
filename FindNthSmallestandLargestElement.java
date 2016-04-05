
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FindNthSmallestandLargestElement {

	public static void main(String[] args) {

		int[] a = { 3, 4, 2, 2, 1, 5, 8, 4, 9, 9, 89, 89, 7, 5 };

		TreeSet<Integer> ts = new TreeSet<>();

		for (int i = 0; i < a.length; i++) {
			ts.add(a[i]);
		}

		// Remove all the duplicates from the array and print the unique
		// elements only
		System.out.println(ts);

		// Smallest number in the array
		System.out.println("Smallest Number : " + ts.first());

		// Largest Number
		System.out.println("Largest Number : " + ts.last());

		// Creating Integer array to hold the Tree Set objects
		Integer arr1[] = new Integer[ts.size()];
		arr1 = ts.toArray(arr1);

		System.out.println("Second Largest: " + arr1[arr1.length - 2]);
		System.out.println("Second Smallest: " + arr1[1]);

		// 2nd Approach

		int[] arr = { 3, 4, 2, 2, 1, 5, 8, 4, 9, 9, 89, 89, 7, 5 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Arranging the elements of the array in the sorting order
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
			}
		}

		System.out.println(al);

		System.out.println("MAXIMUM NUMBER IS: " + al.get(al.size() - 1));
		System.out.println("MINIMUM NUMBER IS: " + al.get(0));

		System.out.println("Second MINIMUM NUMBER IS: " + al.get(1));
		System.out
				.println("SECOND MAXIMUM NUMBER IS: " + al.get(al.size() - 2));

	}

}
