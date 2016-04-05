
public class SuperEx {

	public static void main(String[] args) {
		Bike1 obj = new Bike1();

	}

}

class Vehicle1 {
	public Vehicle1() {
		System.out.println("Vehicle Constructor");
	}

	public Vehicle1(String vname) {
		System.out.println("Car's Constructor");
	}
}

class Bike1 extends Vehicle1 {
	public Bike1() {
		// super();
		super("car");
		System.out.println("Bike's constructor");

	}
}
