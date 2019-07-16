public class HugeInteger {
	int[] a = new int[40];
	String s;

	public HugeInteger() {
		String s = "";
		for (int i = 0; i < s.length(); i++)
			a[i] = 0;

	}

	public HugeInteger(String s) {
		if (s.length() > 40)
			throw new ArrayIndexOutOfBoundsException();
		this.s = s;
	}

	public int[] parse(String s) {
		for (int i = 0; i < s.length(); i++)
			a[i] = s.charAt(i);
		return a;
	}

	public int[] add(HugeInteger h1, HugeInteger h2) {
		int[] b = new int[40];
		if (h1.parse(s).length > 40 || h2.parse(s).length > 40) {
			System.out.println("Max. length after addition hould be 40-digits.");
		}
		for (int i = 0; i < h1.parse(s).length; i++) {
			b[i] = h1.a[i] + h2.a[i];
			if (b[i] > 9) {
				b[i] -= 10;
				b[i + 1] += 1;
			}
			if (b[parse(s).length - 1] > 9) {
				System.out.println("Sum greater than 40-digits!!");
			}
		}
		return b;
	}

	// public int[] sub(HugeInteger h1, HugeInteger h2) {
	// int[] b = new int[40];
	// if (h1.parse(s).length > 40 || h2.parse(s).length > 40) {
	// System.out.println("Max. length after addition hould be 40-digits.");
	// }
	//
	// for (int i = 0; i < h1.parse(s).length; i++) {
	// b[i] = h1.a[i] - h2.a[i];
	// if (b[i] > 9) {
	// b[i] -= 10;
	// b[i + 1] += 1;
	// }
	// if (b[parse(s).length - 1] > 9) {
	// System.out.println("Sum greater than 40-digits!!");
	// }
	// }
	// return b;
	// }

	// public multiply() {
	//
	// }
	//
	// public divide() {
	//
	// }
	//
	// public remainder() {
	//
	// }
	//
	// public boolean isEqualTo() {
	//
	// }
	//
	// public boolean isNotEqualTo() {
	//
	// }
	//
	// public boolean isGreaterThan() {
	//
	// }
	//
	// public boolean isLessThan() {
	//
	// }
	//
	// public boolean isGreaterThanOrEqualTo() {
	//
	// }
	//
	// public boolean isLessThanOrEqualTo() {
	//
	// }
	//
	// public isZero() {
	//
	// }

	public String toString() {

	}
}
