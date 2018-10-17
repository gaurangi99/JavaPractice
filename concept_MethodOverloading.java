public class concept_MethodOverloading {
	public static void main(String[] args) {
		concept_MethodOverloading co = new concept_MethodOverloading();
		System.out.println(co.sum(6, 7));
		System.out.println(co.sum(5));
	}

	public int sum(int a, int b) {
		int s = a + b;
		return s;
	}

	public int sum(int a) {
		int s = a * 2;
		return s;
	}
}
