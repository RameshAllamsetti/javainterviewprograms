
public class ConstructorEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ConstructorEx obj = new ConstructorEx();

		new ConstructorEx("HELLO").add();
		// add();

	}

	ConstructorEx() {
		System.out.println("default constructor");

	}

	public void add() {
		System.out.println("Addition of two number");
	}

	ConstructorEx(String a) {
		// this();
		// this.add();
		add();
		System.out.println("Argument constructor");

	}

}
