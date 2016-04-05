
public class SumofEachDigit {

	int sum1 = 0;

	public static void main(String[] args) {

		SumofEachDigit num1 = new SumofEachDigit();

		System.out.println("Sum of 12345 is :" + num1.sum(12345));

		System.out.println("Sum of 23387 is :"
				+ num1.getNumberSumusingRecursive(23387));

	}

	public int sum(int number) {
		int sum = 0;

		while (number != 0) {
			if (number == 0) {
				return sum;
			} else {
				sum = sum + (number % 10);
				number = number / 10;
			}

		}
		return sum;
	}

	public int getNumberSumusingRecursive(int number) {

		if (number == 0) {
			return sum1;
		}

		else {
			sum1 += (number % 10);
			getNumberSumusingRecursive(number / 10);
		}

		return sum1;
	}

}
