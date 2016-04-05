
import java.util.Arrays;

class ArrayEx {
	public static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];

		}
		System.out.println("Minimum number is : " + min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];

		}
		System.out.println("Maxmimum Number is : " + max);
	}

	public static void main(String[] args) {

		int a[] = { 33, 5, 2, 56, 19, 25, 12, 34, 23, 44 };
		min(a);
		max(a);

		int b[] = { 3, 5, 1, 3, 2, 8, 9, 27, 12 };

		Arrays.sort(b);
		System.out.println("Minimum is: " + b[0]);
		System.out.println("Maxmimum is: " + b[b.length - 1]);

	}

}
