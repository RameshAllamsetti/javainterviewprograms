
public class ExceptionsEx {

	public static void main(String args[]) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result;

		try {
			result = a / b;
			System.out.println("Result : " + result);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (NumberFormatException ne) {
			System.out.println(ne.getMessage());
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
