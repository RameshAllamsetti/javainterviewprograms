
class Thread1 {
	public synchronized void m1(Thread2 b) {
		System.out.println("Thread 1 starts execution of m1() method");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		System.out.println("Thread 1 trying to call B's last method");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Thread 1 last method");
	}
}

class Thread2 {
	public synchronized void m2(Thread1 a) {
		System.out.println("Thread 2  starts execution of m2() method");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		System.out.println("Thread 2 trying to call A's last method");
		a.last();

	}

	public synchronized void last() {
		System.out.println("Thread 2 last method");
	}
}

public class DeadLockExample extends Thread {

	Thread1 a = new Thread1();
	Thread2 b = new Thread2();

	public void m1() {
		this.start();

		a.m1(b); // This line will be executed by Main Thread

	}

	public void run() {
		b.m2(a); // This line will be executed by Child Thread.
	}

	public static void main(String args[]) {
		DeadLockExample d1 = new DeadLockExample();
		d1.m1();

	}

}
