
import java.util.ArrayList;
import java.util.Arrays;

public class TopTwoMaxNumbers {

	public static void twomaxNumber(int arr1[]) {
		int maxone = 0;
		int maxtwo = 0;
		for (int n : arr1) {
			if (maxone < n) {
				maxtwo = maxone;
				maxone = n;
			} else if (maxtwo < n) {
				maxtwo = n;
			}
		}

		System.out.println("First Max Number: " + maxone);
		System.out.println("Second Max Number: " + maxtwo);

	}

	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 11, 8, 9, 7, 9, 8, 11, 2, 4 };

		TopTwoMaxNumbers.twomaxNumber(arr);

		Arrays.sort(arr);

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
			}
		}

		System.out.println(al);

		System.out.println("MAXIMUM NUMBER IS: " + al.get(al.size() - 1));
		System.out.println("MINIMUM NUMBER IS: " + al.get(0));
		System.out
				.println("SECOND MAXIMUM NUMBER IS: " + al.get(al.size() - 2));

		System.out.println("Maximum Number is : " + arr[arr.length - 1]);

		System.out.println("Second Maximum Number is : " + arr[arr.length - 2]);

		// System.out.println("Second Maximum Number is : " +
		// al.get(al.size()-1));

		/*
		 * Arrays.sort(arr);
		 * 
		 * for(int n:arr) { System.out.println(n); }
		 * 
		 * HashSet<Integer> s1 = new HashSet<Integer> ();
		 * 
		 * for(int i=0;i<arr.length;i++) { s1.add(arr[i]); }
		 * 
		 * System.out.println(s1);
		 * 
		 * 
		 * 
		 * Integer a[] = new Integer[s1.size()];
		 * 
		 * for(int i = 0; i<a.length;i++) { System.out.println(a[i]); }
		 */

	}

}
