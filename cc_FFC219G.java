import java.util.Arrays;
import java.util.Scanner;

public class cc_FFC219G {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, n, i;
		t = in.nextInt();
		while (t-- > 0) {
			int S = 0, flag = 0;
			n = in.nextInt();
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if (a[i] < 0) {
					flag++;
				}
			}
			Arrays.sort(a);
			if (flag == 0) {
				for (i = 0; i < n; i++) {
					S += a[i];
				}
			} else if (flag % 2 == 0 && flag > 0) {
				for (i = 0; i < n; i++) {
					if (a[i] > 0) {
						S += a[i];
					}
				}
			} else {
				for (i = n - 1; i >= 0; i--) {
					if (a[i] >= 0) {
						S += a[i];
					} else {
						S -= a[i + 1];
					}
				}
			}
			System.out.println(S);
		}
		// TODO Auto-generated method stub
	}
}
