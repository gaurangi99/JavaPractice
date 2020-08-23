import java.util.*;

public class cc_DEADEND {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if (max < a[i]) {
					max = a[i];
				}
			}
			boolean[] b = new boolean[max + 1];
			Arrays.sort(a);
			for (int i = 0; i < n; i++) {
				b[a[i] - 1] = true;
			}
			int trees = 0;
			for (int i = 0; i < n; i++) {
				if (i == 0 && a[1] == a[i] + 2) {
					b[a[i]] = true;
					trees++;
				} else if (i == n - 1 && a[n - 2] == a[n - 1] - 2) {
					b[a[i] - 2] = true;
					trees++;
				} else if (a[i + 1] == a[i] + 2 && b[a[i]] == false) {
					b[a[i]] = true;
					trees++;
				} else if (a[i - 1] == a[i] - 2 && b[a[i] - 2] == false) {
					b[a[i] - 2] = true;
					trees++;
				} else {
					if (i == 0) {
						b[a[i]] = true;
					} else {
						b[a[i] - 2] = true;
						trees++;
					}
				}
			}
			System.out.println(trees);
		}
		// TODO Auto-generated method stub
	}
}
