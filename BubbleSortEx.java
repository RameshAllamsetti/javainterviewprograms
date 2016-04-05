
public class BubbleSortEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 5, 3, 11, 2, 8, 9, 11, 13, 12 };

		for (int k : arr) {
			System.out.print(k + "\t");
		}
		System.out.println();

		sort(arr, arr.length);

		System.out.println("Array After bubble sort: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

	public static void sort(int[] a, int length) {
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < (a.length - i); j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
