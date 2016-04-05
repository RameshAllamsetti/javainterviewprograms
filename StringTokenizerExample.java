import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("12-13-2015", "-");

		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}

		StringTokenizer s1 = new StringTokenizer(
				"Ramesh is having a bad    time?");

		while (s1.hasMoreTokens()) {
			System.out.println(s1.nextToken());
		}

		StringTokenizer s2 = new StringTokenizer("http://www.google.co.in",
				"(.)");

		while (s2.hasMoreTokens()) {
			System.out.println(s2.nextToken());
		}

	}

}
