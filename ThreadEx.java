
public class ThreadEx extends Thread {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		ThreadEx t1 = new ThreadEx();

		ThreadEx t2 = new ThreadEx();

		// System.out.println("Name of T1: "+t1.getName());

		// System.out.println("Name of T2: "+t2.getName());

		t1.start();

		t2.start();

		// System.out.println("Name of Current Thread: "+Thread.currentThread().getName());

	}

	public void run() {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i = i + 2;

		}

		int j = 2;
		while (j < 10) {
			System.out.println(j);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			j = j + 2;

		}
	}

}
