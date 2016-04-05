
import java.util.HashMap;

public class HashMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<Object, String> hp = new HashMap<Object, String>();

		hp.put("Ramesh", "father");
		hp.put("Laxmi", "wife");
		hp.put("Kushaal", "son");

		System.out.println(hp);

		// To get the value of a key
		System.out.println(hp.get("Laxmi"));

		// To find all the keys
		System.out.println("ALL KEYS :" + hp.keySet());

		// To Print all the values
		System.out.println(hp.values());

		// To remove a particular object
		hp.remove("Ramesh");
		System.out.println(hp);

		// To find out a particular key in hashmap
		System.out.println(hp.containsKey("Kushaal"));

		// To check whether hashmap is empty or not
		System.out.println(hp.isEmpty());

	}

}
