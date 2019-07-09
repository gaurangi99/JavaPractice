public class staticTest {
	private int a = 2;
	private int b = 9;

	public void sum() {
		// this.a = a;
		// this.b = b;
		int s = a + b;
		System.out.println(s);
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		staticTest in = new staticTest();
		in.sum();
		in.display();
		// int r = in.a +in.b;
		// System.out.println(r);
	}

//	public static void main(String[] args) {
//		int a = 5, b = 9;
//		float f = (float) b / a;
//		System.out.println(f);
//	}
}
