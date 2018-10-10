import java.util.*;

public class cc_EID {

	public static void main(String[] args) {
		int t, i, n;
		int[] v = new int[10];
		int[] d = new int[10];
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				n = in.nextInt();
				for (i = 0; i < n; i++) {
					v[i] = in.nextInt();
				}
				Arrays.sort(v, 0, n);
				for (i = 0; i < n - 1; i++) {
					d[i] = Math.abs(v[i + 1] - v[i]);
				}
				Arrays.sort(d, 0, n - 1);
				System.out.println(d[0]);
				t--;
			}
		}
	}
}
