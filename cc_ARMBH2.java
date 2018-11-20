import java.util.*;

public class cc_ARMBH2 {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int n = in.nextInt();
				int m = in.nextInt();
				int k = in.nextInt();
				long[][] a = new long[n][m];
				int i, j, l;
				long max = 0, sh = 0, sv = 0;
				for (i = 0; i < n; i++) {
					for (j = 0; j < m; j++) {
						a[i][j] = in.nextLong();
					}
				}
				for (i = 0; i < n; i++) {
					for (j = 0; j <= m - k; j++) {
						sh = a[i][j];
						for (l = 1; l < k; l++) {
							sh += a[i][j + l];
						}
						if (max < sh) {
							max = sh;
						}
					}
				}
				for (j = 0; j < m; j++) {
					for (i = 0; i <= n - k; i++) {
						sv = a[i][j];
						for (l = 1; l < k; l++) {
							sv += a[i + l][j];
						}
						if (max < sv) {
							max = sv;
						}
					}
				}
				System.out.println(max);
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}