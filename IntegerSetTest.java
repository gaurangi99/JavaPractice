public class IntegerSetTest {

	public static void main(String[] args) {
		IntegerSet i = new IntegerSet(new int[] { 4, 2, 1, 3 });
		IntegerSet i1 = new IntegerSet(new int[] { 3, 2, 4 });
		IntegerSet i2 = new IntegerSet(new int[] { 3, 5, 2, 4 });
		IntegerSet i3 = new IntegerSet(new int[] { 3, 5, 0 });
		IntegerSet i4 = new IntegerSet(new int[] { 0 });
		displaySet("Set 1", i);
		displaySet("Set 2", i1);
		displaySet("Set 3", i2);
		displaySet("Set 4", i3);
		displayNumbers(i.getNumbers());
		displayNumbers(i1.getNumbers());
		displayNumbers(i3.getNumbers());
		// displaySet("Union of set 1 & 2", union(i, i1));
		displayNumbers(union(i3, i2));
		displayNumbers(union(i3, i4));
		displayNumbers(union(i3, i));
		// displaySet("Intersection of set 1 & 2", IntegerSet.intersection(i, i1));
		displayNumbers(intersection(i2, i3));
		displayNumbers(intersection(i3, i4));
		displayNumbers(intersection(i2, i1));
		displayNumbers(intersection(i4, i));
		IntegerSet.isEqualTo(i, i1);
		IntegerSet.isEqualTo(i1, i2);
		IntegerSet.isEqualTo(i2, i3);
		i.insertElement(5);
		displaySet("Set 1 after insertion 5", i);
		i2.deleteElement(5);
		displaySet("Set 2 after deletion of 5", i1);
		displayNumbers(union(i2, i1));
		// TODO Auto-generated method stub
	}

	public static void displaySet(String header, IntegerSet i) {
		System.out.printf("%s: { %s}\n", header, i);
		// System.out.printf("The length of array is: %d\n", i.getNumbers().length);
	}

	public static void displayNumbers(int[] s) {
		int k;
		for (k = 0; k < s.length; k++) {
			// if (s[k] == 0 && s[k + 1] == 0) {
			// System.out.println(s[k + 1]);
			// break;
			// }
			System.out.printf("%d ", s[k]);
		}
		System.out.println();
	}

	public static int[] union(IntegerSet i1, IntegerSet i2) {
		int[] d = new int[i1.getNumbers().length + i2.getNumbers().length];
		int k = 0, m = 0, l, count = 0;
		for (l = 0; l < d.length; l++) {
			if (i1.getNumbers()[k] < i2.getNumbers()[m]) {
				d[l] = i1.getNumbers()[k];
				count++;
				if ((k + 1) < i1.getNumbers().length)
					k++;
				else {
					for (l = l + 1; l < d.length && m < i2.getNumbers().length; l++, m++) {
						d[l] = i2.getNumbers()[m];
						count++;
					}
				}
			} else if (i1.getNumbers()[k] > i2.getNumbers()[m]) {
				d[l] = i2.getNumbers()[m];
				count++;
				if ((m + 1) < i2.getNumbers().length)
					m++;
				else {
					for (l = l + 1; l < d.length && k < i1.getNumbers().length; l++, k++) {
						d[l] = i1.getNumbers()[k];
						count++;
					}
				}
			} else {
				d[l] = i1.getNumbers()[k];
				count++;
				if ((k + 1) < i1.getNumbers().length && (m + 1) < i2.getNumbers().length) {
					k++;
					m++;
				} else if ((k + 1) >= i1.getNumbers().length && (m + 1) < i2.getNumbers().length) {
					m++;
					for (l = l + 1; l < d.length && m < i2.getNumbers().length; l++, m++) {
						d[l] = i2.getNumbers()[m];
						count++;
					}
				} else if ((k + 1) < i1.getNumbers().length && (m + 1) >= i2.getNumbers().length) {
					k++;
					for (l = l + 1; l < d.length && k < i1.getNumbers().length; l++, k++) {
						d[l] = i1.getNumbers()[k];
						count++;
					}

				} else
					l = d.length;
			}
		}
		System.out.printf("Length of array is: %d\n", count);
		int[] f = new int[count];
		for (int i = 0; i < count; i++) {
			f[i] = d[i];
		}
		return f;
	}

	public static int[] intersection(IntegerSet i1, IntegerSet i2) {
		int[] d = new int[i1.getNumbers().length + i2.getNumbers().length];
		int k, l = 0, m, count = 0;
		while (l < d.length) {
			for (k = 0; k < i1.getNumbers().length; k++) {
				for (m = 0; m < i2.getNumbers().length; m++) {
					if (i1.getNumbers()[k] == i2.getNumbers()[m]) {
						d[l] = i1.getNumbers()[k];
						l++;
						count++;
						if ((k + 1) < i1.getNumbers().length && (m + 1) < i2.getNumbers().length)
							m = i2.getNumbers().length;
						else {
							m = i2.getNumbers().length;
							k = i1.getNumbers().length;
							l = d.length;
						}
					} else {
						if ((k + 1) >= i1.getNumbers().length || (m + 1) >= i2.getNumbers().length) {
							m = i2.getNumbers().length;
							k = i1.getNumbers().length;
							l = d.length;
						}
					}
				}
			}
		}
		int[] f = new int[count];
		if (count == 0) {
			System.out.println("Empty set!!");
		} else {
			for (int i = 0; i < count; i++) {
				f[i] = d[i];
			}
		}
		return f;
	}
}