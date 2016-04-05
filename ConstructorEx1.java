
public class ConstructorEx1 {

	public ConstructorEx1() {
		this(4);
	}

	public void ConstructorEx1() {
		System.out.println("I am in void construtor");
	}

	public ConstructorEx1(int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {

		ConstructorEx1 ob = new ConstructorEx1();
		ob.ConstructorEx1();

	}

}
