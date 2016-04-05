
public class IllegalArgumentExceptionEx extends Thread {

	public static void main(String[] args) {
		Thread t1 = new Thread();

		// Below 2 lines are valid
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(5);
		t1.setPriority(Thread.MAX_PRIORITY);

		t1.setPriority(14);

	}

}
