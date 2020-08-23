import java.util.Scanner;

public class cc_DIET {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int i, flag = 0;
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for (i = 0; i < n - 1; i++) {
				if (a[i] >= k) {
					a[i + 1] += a[i] - k;
				} else {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				if (a[n - 1] >= k) {
					System.out.println("YES");
				} else {
					System.out.printf("NO %d\n", n);
				}
			}
			if (flag == 1) {
				System.out.printf("NO %d\n", i + 1);
			}
		}
		// TODO Auto-generated method stub
	}
}