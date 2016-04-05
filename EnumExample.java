
enum Year {

	Jan, Feb, Mar, Apr;

}

public class EnumExample {
	public static void main(String args[]) {
		Year m2 = Year.Jan;
		System.out.println(m2);
		Year[] m = Year.values();

		for (Year m1 : m) {
			System.out.println(m1 + "------" + m1.ordinal());
		}
	}
}
