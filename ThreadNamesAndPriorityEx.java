
class MyThread1 extends Thread {
	public void run() {
		System.out.println("Child thread will be executed by: "
				+ Thread.currentThread().getName());
	}
}

public class ThreadNamesAndPriorityEx {

	public static void main(String args[]) {

		MyThread1 t1 = new MyThread1();
		t1.start();

		System.out.println("Main thread will be executed by: "
				+ Thread.currentThread().getName());

		// Getting Thread Name
		System.out.println("Main Thread Name:"
				+ Thread.currentThread().getName());
		System.out.println("Child Thread Name:" + t1.getName());

		// Setting the name for a thread
		Thread.currentThread().setName("Ramesh ");
		System.out.println("Main Thread Updated Name:"
				+ Thread.currentThread().getName());
		t1.setName("Sunny");
		System.out.println("Child Thread Updated Name:" + t1.getName());

		// By default always main thread priority will be 5. Child Thread (in
		// this case MyThread1) will inherit priority from mainThread
		System.out.println("Initial Main Thread Priority: "
				+ Thread.currentThread().getPriority());
		System.out
				.println("Initial Child Thread Priority: " + t1.getPriority());

		// Setting the priority
		Thread.currentThread().setPriority(10);
		System.out.println(" Main Thread Priority After changing : "
				+ Thread.currentThread().getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out
				.println("Child Thread Priority After modifying main thread priority : "
						+ t1.getPriority());

		// Runtime Exception will be throw if you set thread priority to <1 and
		// >10
		Thread.currentThread().setPriority(11);

	}

}
