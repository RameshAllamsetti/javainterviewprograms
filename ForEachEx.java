
public class ForEachEx {

	public static void main(String ar[]) {

		int x[] = { 2, 3, 6, 5, 9 };

		// Using Normal for loop
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		System.out.println("FOR EACH LOOP");
		// Using for each loop
		for (int x1 : x) {
			System.out.println(x1);
		}

		System.out.println("2D ARRAY	");
		// Two Dimesional Array
		int a[][] = { { 2, 3, 4 }, { 5, 6 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		System.out.println("2D ARRAY FOR EACH LOOP");
		// Using for each loop

		for (int a1[] : a) {
			for (int a2 : a1) {
				System.out.println(a2);
			}
		}

	}

}
