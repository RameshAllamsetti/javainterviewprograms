
public class PrimeNumberEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrimeNumberEx p1 = new PrimeNumberEx();
		System.out.println("Is 5 prime number? " + p1.isPrime(5));
		System.out.println("Is 13 prime number? " + p1.isPrime(13));
		System.out.println("Is 14 prime number? " + p1.isPrime(14));

	}

	public boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
