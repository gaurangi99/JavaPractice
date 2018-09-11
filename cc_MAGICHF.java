import java.util.*;

public class cc_MAGICHF {

	public static void main(String[] args) {
		int t, n, x, s, i;
		int[] a = new int[10];
		int[] b = new int[10];
		// cc_MAGICHF mc = new cc_MAGICHF();
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				n = in.nextInt();
				x = in.nextInt();
				s = in.nextInt();
				System.out.println();
				for (i = s; i > 0; i--) {
					a[i] = in.nextInt();
					b[i] = in.nextInt();
					System.out.print("\n");
				}
				while (x <= n) {
					for (i = s; i > 0; i--) {
						if (a[i] <= n && b[i] <= n)
							;
						else {
							System.exit(0);
						}
					}
				}
				for (i = s; i > 0; i--) {
					do {
						if (a[i] == x) {
							x = b[i];
						} else if (b[i] == x) {
							x = a[i];
						}
					} while (a[i] != b[i]);
				}
				System.out.printf("%d", x);
			}
		}
	}// TODO Auto-generated method stub

}
