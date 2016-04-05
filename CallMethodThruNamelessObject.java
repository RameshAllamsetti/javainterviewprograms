
public class CallMethodThruNamelessObject {

	public static void main(String args[]) {
		new Alpha().display();
		new Alpha("Ramesh").display();
	}

}

class Alpha {
	public Alpha() {
		System.out.println("Hello");
	}

	public Alpha(String S) {
		System.out.println(S);
	}

	public void display() {
		System.out.println("World");
	}
}