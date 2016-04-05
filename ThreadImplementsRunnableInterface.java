
class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadImplementsRunnableInterface {

	public static void main(String args[]) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r); // Passing MyRunnable object to Thread
		t.start(); // Child thread will be invoked and from this step on wards
					// two thread will be there MyRunnable thread and main
					// thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
