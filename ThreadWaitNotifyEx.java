
class Threadwn extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			for (int i = 1; i < 100; i++) {
				total = total + i;

			}

			System.out
					.println("child thread giving the notification to main thread");
			this.notify();

		}
	}

	// 1 Lakh lines of code after run method
}

public class ThreadWaitNotifyEx {

	public static void main(String args[]) throws InterruptedException {

		Threadwn obj = new Threadwn();
		obj.start();

		synchronized (obj) {
			System.out.println("Main thread call wait method");
			obj.wait();
			System.out.println("Main Thread got the notification");
			System.out.println("Total sum = " + obj.total);
		}

	}

}
