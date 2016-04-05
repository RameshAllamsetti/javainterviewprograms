
public class PrimeNumber {
	public static void main(String ar[]) {
		int num = 100;
		int count;
		for (int i = 1; i < num; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			// Print all the Prime Numbers

			if (count == 0) {

				System.out.print(i + "\t");
			}

			// Print all the non Prime Numbers

			/*
			 * if(count != 0) {
			 * 
			 * System.out.print(i +"\t"); }
			 */
		}
	}
}
