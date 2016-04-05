
public class SwapNumberswihtoutTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		System.out.println("Enter First Number" + i);

		System.out.println("Enter Second Number" + j);

		i = i + j;
		j = i - j;
		i = i - j;

		System.out.println("Numbers after swapping : " + i + "\t " + j);

	}

}
