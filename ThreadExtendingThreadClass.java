
class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Child Thread");
		}
	}

}

public class ThreadExtendingThreadClass {
	public static void main(String args[]) {
		MyThread t1 = new MyThread(); // Instantiating the thread object

		t1.start(); // calling the Thread class start method. After this two
					// threads will be there. Main thread and MyThread

		System.out.println("After START method: "
				+ t1.currentThread().getState());

		System.out.println("Main Thread");
		// Below code will be executed by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
