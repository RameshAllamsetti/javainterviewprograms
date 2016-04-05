
public class FindMissinNumberinArray {

	public static void main(String args[]) {
		int a[] = { 1, 2, 4, 3, 6 };
		int actualSum = 0;
		int totalSum = 0;
		totalSum = ((a.length + 1) * (a.length + 2)) / 2;

		for (int i = 0; i < a.length; i++) {
			actualSum = actualSum + a[i];
		}
		System.out.println("Total Sum : " + totalSum);
		System.out.println("Actual Sum : " + actualSum);
		int missinNumber = totalSum - actualSum;
		System.out.println("Missing Number : " + missinNumber);

	}

}
