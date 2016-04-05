
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();

		System.out.println("ARRAY LIST SIZE B4 INSTRTION: " + al.size());

		al.add("Ramesh");
		al.add(100);
		al.add("Allam");
		al.add(5.23f);

		System.out.println("ARRAY LIST SIZE AFTER INSTRTION: " + al.size());
		System.out.println(al);

		// Remove Element by object
		al.remove("Ramesh");

		// Remove Element by index
		al.remove(2);
		System.out.println(al);

		// Contains method
		System.out.println(al.contains("Allam"));

		al.add(0, "Kushaal");

		System.out.println(al);

		// To clear all the objects from the array
		al.clear();
		System.out.println("Array List Size after clear method: " + al.size());
		System.out.println(al);

	}

}
