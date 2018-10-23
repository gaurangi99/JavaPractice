import java.util.*;

public class cc_CHRL4 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int n = in.nextInt();
			int k = in.nextInt();
			int i, x, p;
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			p = a[0] * a[n - 1];
			x = a[0];
			Arrays.sort(a, 1, n - 2);
			for (i = 1; i < n - 1; i++) {
				if ((a[i] - x) <= k) {
					p *= a[i];
					x = a[i];
					if ((a[n - 1] - x) <= k) {
						x = a[n - 1];
						i = n - 1;
					}
				}
			}
			System.out.println(p);
			// TODO Auto-generated method stub
		}
	}
}
