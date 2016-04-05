
public class OverridingEx {

	public static void main(String[] args) {

		Bank b1 = new ICICI();
		System.out.println(b1.getIntrestRate());

		Bank b2 = new SBI();
		System.out.println(b2.getIntrestRate());

	}

}

class Bank {
	int getIntrestRate() {
		return 0;
	}
}

class ICICI extends Bank {
	int getIntrestRate() {
		return 6;
	}
}

class SBI extends Bank {
	int getIntrestRate() {
		return 9;
	}
}
