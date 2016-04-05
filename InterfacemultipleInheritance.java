
interface Printable {
	void print();
}

interface Showable {
	void show();
}

class A7 implements Printable, Showable {
	public void print() {
		System.out.println("PRINT");
	}

	public void show() {
		System.out.println("SHOW");
	}

}

public class InterfacemultipleInheritance {

	public static void main(String[] args) {

		A7 ob = new A7();
		ob.print();
		ob.show();

	}

}
