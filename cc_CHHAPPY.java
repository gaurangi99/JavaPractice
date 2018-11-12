import java.util.*;

public class cc_CHHAPPY {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			int i, j;
			int n = in.nextInt();
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for (i = 0; i < n - 1; i++) {
				for (j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {

					}
				}
				t--; // TODO Auto-generated method stub
			}

		}

	}
}
