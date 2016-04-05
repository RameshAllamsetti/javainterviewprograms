import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordSearcher {

	public static void main(String[] args) {

		String text = "Ramesh is a good . ramesh is a clever Ramesh is good";

		List<String> list = Arrays.asList(text.split(" "));
		System.out.println(list);

		Set<String> uniqueWords = new LinkedHashSet<String>(list);

		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(list, word));
		}

	}
}