import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratoreExample {

	public static void main(String arg[]) {
		LinkedList l1 = new LinkedList();

		l1.add("Ramesh");
		l1.add("satish");
		l1.add("suresh");
		l1.add("lakshmi");
		System.out.println("" + l1);

		ListIterator itr1 = l1.listIterator();

		while (itr1.hasNext()) {
			String str = (String) itr1.next();
			{
				if (str.contains("Ramesh")) {
					itr1.add("Kushaal");
				} else if (str.contains("satish")) {
					itr1.set("Sowji");
				} else if (str.contains("suresh")) {
					itr1.remove();
				} else if (str.contains("lakshmi")) {
					itr1.add("shiva");
				}
			}
			System.out.println(str);

		}
		System.out.println();
		System.out.println(l1);
	}

}
