
public class InterfaceEx {

	public static void main(String[] args) {

		// Circel c1 = new Circel();
		Shape1 c1 = new Circel();
		c1.area();
	}

}

interface Shape1 {
	public void area();
}

class Circel implements Shape1 {
	public void area() {
		System.out.println("Area of the circle ");
	}
}