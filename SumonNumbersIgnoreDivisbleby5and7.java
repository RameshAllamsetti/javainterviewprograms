
public class SumonNumbersIgnoreDivisbleby5and7 {

	public static void main(String args[]) {

		int n = 55;
		int sum = 0;
		for (int i = 0; i < 55; i++) {

			if (i % 5 == 0 || i % 7 == 0) {
				continue;
			}
			System.out.print(i + "  ");

			sum = sum + i;
		}
		System.out.println();
		System.out.println("Total Sum: " + sum);

	}
}
