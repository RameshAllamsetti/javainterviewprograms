
public class InvalidAgeException extends Exception {

	public InvalidAgeException() {

	}

	public InvalidAgeException(int e) {
		System.out.println(e + " is not a valid age.");
	}

}
