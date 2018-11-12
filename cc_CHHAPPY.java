import java.util.*;

public class cc_CHHAPPY {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int i, j, flag = 0;
				int n = in.nextInt();
				int[] a = new int[n];
				for (i = 1; i <= n; i++) {
					a[i] = in.nextInt();
				}
				for (i = 1; i <= n - 1; i++) {
					for (j = i + 1; j <= n; j++) {
						if (a[i] != a[j]) {
							if (a[a[i]] == a[a[j]]) {
								flag = 1;
								System.out.println("Truly Happy");
								System.exit(0);
							}
						}
					}
				}
				if (flag == 0) {
					System.out.println("Poor Chef");
				}
				t--; // TODO Auto-generated method stub
			}
		}
	}
}
