
public class PrintPairsWhoseSumisEqual {

	public static void main(String args[]) {
		int a[] = { 2, 3, 5, 1, 3, 5, 4 };
		System.out.println("Print pair of numbers whose sum is equal to 6");
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] + a[j] == 6) {
					System.out.printf("(%d, %d) %n", a[i], a[j]);
				}
			}
		}

	}

}
