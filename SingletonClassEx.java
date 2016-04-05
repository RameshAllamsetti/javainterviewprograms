
public class SingletonClassEx {

	private static SingletonClassEx st = null;

	private SingletonClassEx() {

	}

	public static SingletonClassEx getTest() {
		if (st == null) {
			new SingletonClassEx();
		}

		return st;
	}

	public static void main(String args[]) {
		SingletonClassEx st1 = SingletonClassEx.getTest();
		SingletonClassEx st2 = SingletonClassEx.getTest();

		System.out.println(st1);
		System.out.println(st2);

		System.out.println(st1 == st2);
	}

}
