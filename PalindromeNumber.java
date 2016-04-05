
public class PalindromeNumber {

	public static void main(String a[]) {

		int givenNumber = 121;

		int rev = 0;
		int givenNumber1;
		givenNumber1 = givenNumber;

		while (givenNumber > 0) {
			rev = (rev * 10) + (givenNumber % 10);
			givenNumber = givenNumber / 10;

		}
		System.out.println("Given Number: " + givenNumber1);

		System.out.println("Reverse Number :" + rev);

		if (givenNumber1 == rev)

			System.out.println(givenNumber1 + " is a PALINDROME");

		else
			System.out.println(givenNumber1 + " is NOT A PALINDROME");

		// SECOND Logic

		String s = "1234";

		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		System.out.println("GIVEN NUMBER: " + s);
		System.out.println("REVERSE NUMBER: " + reverse);

		if (s.equals(reverse))

			System.out.println(s + "is a PALINDROME");

		else
			System.out.println(s + " is NOT A PALINDROME");

	}

}
