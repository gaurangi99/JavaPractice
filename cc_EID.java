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
				Arrays.sort(v);
				for (i = 0; i < n - 1; i++) {
					d[i] = v[i + 1] - v[i];
				}
				Arrays.sort(d);
				System.out.println(d[0]);
				t--;
			}
		}
	}
}
