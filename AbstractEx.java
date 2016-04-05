
class AbstractClassExample {
	public static void main(String[] args) {

		Shape obj = new Triangle();
		obj.drawing();
		obj.area();
		Shape obj1 = new Circle();
		obj1.drawing();
		obj1.area();
	}

}

abstract class Shape {
	abstract void drawing();

	void area() {
		System.out.println("AREA");
	}
}

class Triangle extends Shape {
	public void drawing() {
		System.out.println("Drawing the Triangle");
	}
}

class Circle extends Shape {
	public void drawing() {
		System.out.println("Drawing Circle");
	}
}
