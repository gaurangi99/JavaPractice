import java.util.*;

public class cc_HORSES {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int n = in.nextInt();
				long[] s = new long[n];
				int i;
				for (i = 0; i < n; i++) {
					s[i] = in.nextLong();
				}
				Arrays.sort(s);
				long[] d = new long[n - 1];
				for (i = 0; i < n - 1; i++) {
					d[i] = s[i + 1] - s[i];
				}
				Arrays.sort(d);
				System.out.println(d[0]);
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
