import java.util.Scanner;

public class cc_CNOTE {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t, x, y, k, n, i;
		t = in.nextInt();
		while (t-- > 0) {
			boolean flag = false;
			x = in.nextInt();
			y = in.nextInt();
			k = in.nextInt();
			n = in.nextInt();
			int[] p = new int[n];
			int[] c = new int[n];
			for (i = 0; i < n; i++) {
				p[i] = in.nextInt();
				c[i] = in.nextInt();
			}
			int pagesNeeded = x - y;
			for (i = 0; i < n; i++) {
				if (p[i] >= pagesNeeded && c[i] <= k) {
					flag = true;
					break;
				}
			}
			System.out.println(flag ? "LuckyChef" : "UnluckyChef");
		}
		// TODO Auto-generated method stub
	}
}
