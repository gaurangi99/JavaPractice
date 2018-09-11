import java.util.*;

public class cc_MAGICHF {

	public static void main(String[] args) {
		int t, n, x, s, i, flag = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		// cc_MAGICHF mc = new cc_MAGICHF();
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0 && t <= 100) {
				n = in.nextInt();
				x = in.nextInt();
				s = in.nextInt();
				flag += s;
				for (i = s; i > 0; i--) {
					a[i] = in.nextInt();
					b[i] = in.nextInt();
				}
				if (flag <= 200000) {
					if (n >= 2 && n <= 100000 && x <= n) {
						for (i = s; i > 0; i--) {
							if ((a[i] <= n && b[i] <= n) && (a[i] != b[i])) {
								if (a[i] == x) {
									x = b[i];
								} else if (b[i] == x) {
									x = a[i];
								}
							}
						}
					}
				}
				System.out.printf("%d", x);
				t--;
			}
		}
	}
}// TODO Auto-generated method stub
