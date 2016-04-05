import java.util.ArrayList;
import java.util.Iterator;

public class IteratoreExample {

	public static void main(String arg[]) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();

		for (int i = 0; i < 11; i++) {
			l1.add(i);
		}
		System.out.println("" + l1);

		Iterator itr1 = l1.iterator();

		while (itr1.hasNext()) {

			int J = (Integer) itr1.next();
			if (J % 2 == 0) {
				System.out.print(" " + J + " ");
			} else
				itr1.remove();
		}
		System.out.println();
		System.out.println("" + l1);
	}

}
