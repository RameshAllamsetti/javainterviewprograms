
public class RemoveDuplicaNumberinArray {
	public static void main(String args[]) {
		int a[] = { 4, 2, 4, 3, 2, 5, 3, 2, 6 };
		String s = "";
		System.out.println("Given Array");
		for (int a1 : a) {
			System.out.print(a1 + "\t");
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			if (!s.contains(String.valueOf(a[i]))) {
				s = s + a[i] + "\t";
			}
		}

		System.out.println("Array After Removing the Duplicates is: ");
		System.out.println(s.toCharArray());
	}

}
