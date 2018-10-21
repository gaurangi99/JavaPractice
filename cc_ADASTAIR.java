import java.util.*;

public class cc_ADASTAIR {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			long t = in.nextLong();
			while (t > 0) {
				int n = in.nextInt();
				long k = in.nextLong();
				int i = 1, s = 0;
				long x;
				long[] h = new long[n];
				for (i = 0; i < n; i++) {
					h[i] = in.nextLong();
				}
				x = h[0];
				for (i = 1; i < n; i++) {
					if ((h[i] - x) <= k && (h[i] - x) != 0) {
						x = h[i];
					} else if ((h[i] - x) != 0) {
						x = x + k;
						s++;
						i--;
					}
				}
				System.out.println(s);
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
