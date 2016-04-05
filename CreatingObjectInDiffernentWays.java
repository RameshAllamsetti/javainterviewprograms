
import java.text.DateFormat;

public class CreatingObjectInDiffernentWays {

	public static void main(String args[]) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			CloneNotSupportedException

	{
		// Using new Keyword
		CreatingObjectInDiffernentWays co = new CreatingObjectInDiffernentWays();

		// Using newInstance keyword
		CreatingObjectInDiffernentWays co2 = (CreatingObjectInDiffernentWays) Class
				.forName("CreatingObjectInDiffernentWays").newInstance();

		// Using factory methods
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();

		// Using Clone method

		CreatingObjectInDiffernentWays co3 = new CreatingObjectInDiffernentWays();
		CreatingObjectInDiffernentWays co4 = (CreatingObjectInDiffernentWays) co3
				.clone();
	}

}
