
public class StringEx {

	public static void main(String arg[]) {
		String s1 = "ramesh";
		String s2 = "ra";
		String s3 = "";
		for (int i = 0; i < s1.length(); i++) {
			s3 = s3 + s1.charAt(i);
			System.out.println(s3);

			System.out.println(s2.equalsIgnoreCase(s3));
		}

	}

}
