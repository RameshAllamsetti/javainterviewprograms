
class OverloadingCalculation2 {
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		OverloadingCalculation2 obj = new OverloadingCalculation2();
		obj.sum(20L, 20);// now LONG arg sum() method gets invoked
		obj.sum(20, 30L);// now LONG arg sum() method gets invoked
		obj.sum(20, 30);// now int arg sum() method gets invoked
	}
}
