
enum color {
	blue, red {
		public void display() {
			System.out.println("Dangerous color");
		}
	},
	green;

	public void display() {
		System.out.println("Natural colors");
	}
}

public class EnumAnnonymousInnerClass {
	public static void main(String args[]) {
		color[] c = color.values();
		for (color c1 : c) {
			c1.display();
		}
	}

}
