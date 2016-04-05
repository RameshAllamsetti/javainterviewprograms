final public class ImmutableClassEx {

	int i;

	public ImmutableClassEx(int i) {

		this.i = i;
	}

	public ImmutableClassEx modify(int i) {
		if (this.i == i)
			return this;

		else
			return (new ImmutableClassEx(i));
	}

	public static void main(String args[]) {
		ImmutableClassEx t1 = new ImmutableClassEx(10);
		ImmutableClassEx t2 = t1.modify(100);
		System.out.println(t1 == t2);
		ImmutableClassEx t3 = t1.modify(10);
		System.out.println(t1 == t3);
		ImmutableClassEx t4 = new ImmutableClassEx(10);
		System.out.println(t1 == t4);

	}

}
