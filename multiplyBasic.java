public class multiplyBasic {

	public static void main(String[] args) {
		long[] a = new long[] { 5, 6, 9, 2, 0, 9 };
		long[] b = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(multiply(a, b));
		// TODO Auto-generated method stub
	}

	public static long multiply(long[] a, long[] b) {
		int i, j, count = 1, ctr = 1;
		long p = 0;
		for (j = b.length - 1; j >= 0; j--) {
			count = 1;
			for (i = a.length - 1; i >= 0; i--) {
				p += a[i] * b[j] * count * ctr;
				count *= 10;
				System.out.println(count);
				System.out.println(p);
			}
			System.out.println();
			System.out.println(p);
			ctr *= 10;
		}
		return p;
	}
}
// 70272019392

// 6924893952