
public class SumOfDigits {

	public static void main(String ar[]) {

		System.out.println("ENTER THE NUMBER");
		int num = Integer.parseInt(ar[0]);
		int sod = 0;
		while (num != 0) {

			sod = sod + num % 10;
			;
			num = num / 10;

		}

		System.out.println("SUM OF DIGITS: " + sod);
	}

}
