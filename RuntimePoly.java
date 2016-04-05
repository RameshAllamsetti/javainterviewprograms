
class Bike {
	public void run() {
		System.out.println("Running the Bike");
	}
}

class Tvs extends Bike {
	public void run() {
		System.out.println("Running the tvs bike at 60 kms");
	}
}

public class RuntimePoly {

	public static void main(String[] args) {

		Bike b = new Tvs();
		Bike b1 = new Bike();
		b.run();
		b1.run();

	}

}
