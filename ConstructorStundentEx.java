
public class ConstructorStundentEx {

	String stundentName;
	int rollNo;
	int count;

	static int counter;
	{

		System.out.println("Instance Block :");
		counter++;
	}

	public ConstructorStundentEx(String stundentName, int rollNo) {
		this.stundentName = stundentName;
		this.rollNo = rollNo;

	}

	public static void main(String args[]) {
		ConstructorStundentEx s1 = new ConstructorStundentEx("Ramesh", 001);
		System.out.println(s1.stundentName + " " + s1.rollNo);

		ConstructorStundentEx s2 = new ConstructorStundentEx("Lakshmi", 002);
		System.out.println(s2.stundentName + " " + s2.rollNo);

		System.out.println("Total No of objects :" + counter);
	}

}
