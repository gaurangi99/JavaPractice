import java.util.*;

public class cc_KFIB {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int n = in.nextInt();
			int k = in.nextInt();
			System.out.println(t(n, k));
			// TODO Auto-generated method stub
		}
	}

	public static int t(int n, int k) {
		int[] s = new int[n];
		int i = 0;
		for (i = 1; i <= n; i++) {
			if (i <= k) {
				s[i] = 1;
			}
			s[k + 1] = k;
			if (i > k + 1) {
				s[i] = 2 * s[i - 1] - s[i - k - 1];
			}
		}
		return s[n];
	}
}
