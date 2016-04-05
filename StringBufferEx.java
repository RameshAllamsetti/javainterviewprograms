
public class StringBufferEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// A string that can be modified or changed is known as mutable string.
		// StringBuffer and StringBuilder classes are used for creating mutable
		// string.

		StringBuffer sb = new StringBuffer("Hello");

		// The append() method concatenates the given argument with this string.
		sb.append("java");
		System.out.println(sb);

		// The insert() method inserts the given string with this string at the
		// given position.
		sb.insert(1, "hello");
		System.out.println(sb);

		// The replace() method replaces the given string from the specified
		// beginIndex and endIndex.
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.replace(1, 3, "Java");
		System.out.println(sb1);// prints HJavalo

		// The delete() method of StringBuffer class deletes the string from the
		// specified beginIndex to endIndex.
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.delete(1, 3);
		System.out.println(sb2);// prints Hlo
	}

}
