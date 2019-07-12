public class IntegerSet {
	private boolean a[] = new boolean[101];
	private int count = 0;

	public IntegerSet(int[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] > 100 || b[i] < 0) {
				throw new IllegalArgumentException("Integer " + b[i] + " should be less than 100.");
			} else {
				a[b[i]] = true;
				count++;
			}
		}
		System.out.printf("The length of integer set is: %d\n", b.length);
	}

	public IntegerSet() {
		for (int i = 0; i < a.length; i++) {
			a[i] = false;
		}
	}

	public int[] getNumbers() {
		int[] s = new int[count];
		int i = 0;
		for (int k = 0; k < a.length; k++) {
			if (a[k] == true) {
				s[i++] = k;
			}
		}
		return s;
	}

	public static void isEqualTo(IntegerSet i, IntegerSet i1) {
		boolean flag = true;
		int k = 0;
		while (flag && k < i.a.length) {
			if (i.a[k] == i1.a[k]) {
				flag = true;
				if (k == 100) {
					System.out.println("EQUAL SETS!!");
				}
				k++;
			} else {
				flag = false;
				System.out.println("UNEQUAL SETS!!");
				break;
			}
		}
	}

	public String insertElement(int m) {
		if (a[m] == true) {
			return String.format("Item already present!");
		} else {
			a[m] = true;
			count++;
			return toString();
		}
	}

	public String deleteElement(int m) {
		if (a[m] == false) {
			return String.format("Item already not present!");
		} else {
			a[m] = false;
			count--;
			return toString();
		}
	}

	public String toString() {
		String s = "";
		for (int k = 0; k < a.length; k++) {
			if (a[k] == true) {
				s += k + " ";
			}
		}
		// while(k<a.length) {
		// if(a[k]==false) {
		//
		//
		// }
		// }
		return s;
	}
}

//
// public static IntegerSet union(IntegerSet i, IntegerSet i1) {
// IntegerSet c = new IntegerSet();
// for (int k = 0; k < i.a.length; k++) {
// if (i.a[k] == true)
// c.a[k] = true;
// }
// for (int k = 0; k < i1.a.length; k++) {
// if (i1.a.[k] == true || c.a[k] == true)
// c.a.[k] = true;
// }
// return c;
// }

// public static IntegerSet union(IntegerSet i, IntegerSet i1) {
// int[] d = new int[101];
// int x = 0;
// for (int k = 0; k < i.getNumbers().length; k++) {
// d[k] = i.getNumbers()[k];
// x = k;
// }
// for (int k = 0; k < i1.getNumbers().length; k++) {
// // if (i.getNumbers()[k] != i1.getNumbers()[k]) {
// d[++x] = i1.getNumbers()[k];
// // }
// }
// return new IntegerSet(d);
// }

// public static IntegerSet intersection(IntegerSet i, IntegerSet i1) {
// IntegerSet c = new IntegerSet();
// for (int k = 0; k < i.a.length; k++) {
// if (i.a[k] == true)
// c.a[k] = true;
// }
// for (int k = 0; k < i1.a.length; k++) {
// if (i1.a[k] == true && c.a[k] == true)
// c.a[k] = true;
// else
// c.a[k] = false;
// }
// return c;
// }