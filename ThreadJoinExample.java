
class ThreadA extends Thread {
	static Thread mt;

	public void run() {
		// If child thread want to wait till main thread get completed
		try {
			System.out.println("Waiting for Main thread to complete");
			mt.join();

		} catch (InterruptedException e) {

		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadJoinExample {

	public static void main(String args[]) throws InterruptedException {
		ThreadA.mt = Thread.currentThread();
		ThreadA t2 = new ThreadA();
		t2.start();
		// Below cod main thread will wait till child thread got completed. Dead
		// lock condition
		System.out.println("Waiting for Child thread to complete");
		// t2.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("MAin Thread");
		}

	}

}
