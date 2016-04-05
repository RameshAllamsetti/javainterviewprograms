public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("SB INITIAL CAPACITY: " + sb.capacity());
		System.out.println("SB INITIAL LENGTH: " + sb.length());

		sb.append("abcdefghijklmnop");
		System.out.println("SB INITIAL LENGTH: " + sb.length());
		System.out.println("SB INITIAL CAPACITY: " + sb.capacity());

		sb.append("12");
		System.out.println("SB INITIAL LENGTH: " + sb.length());
		System.out.println("SB INITIAL CAPACITY: " + sb.capacity());

		StringBuffer sb1 = new StringBuffer("Ramesh");
		System.out.println("SB INITIAL LENGTH: " + sb1.length());
		System.out.println("SB INITIAL CAPACITY: " + sb1.capacity());

	}

}
