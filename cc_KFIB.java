import java.util.*;

public class cc_KFIB {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int n = in.nextInt();
			int k = in.nextInt();
			int[] s = new int[n + 1];
			if (n <= k) {
				System.out.println(1);
			} else {
				for (int i = 1; i <= k; i++) {
					s[i] = 1;
				}
				s[k + 1] = k;
				for (int i = k + 2; i <= n; i++) {
					s[i] = 2 * s[i - 1] - s[i - k - 1];
				}
				System.out.println(s[n]);
			}
		}
	}
}
