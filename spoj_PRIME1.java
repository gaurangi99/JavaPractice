import java.util.Scanner;

public class spoj_PRIME1 {

	public static void main(String[] args) {
		int t, m, n, x, flag, k;
		Scanner in = new Scanner(System.in);
		System.out.println();
		t = in.nextInt();
		while (t-- > 0) {
			k = 0;
			m = in.nextInt();
			n = in.nextInt();
			int[] p = new int[n - m];
			for (int i = m; i <= n; i++) {
				flag = 0;
				if (i == 0 || i == 1) {
					flag = 1;
				} else {
					x = i / 2;
					for (int j = 2; j <= x; j++) {
						if (i % j == 0) {
							flag = 1;
							break;
						}
					}
					if (flag == 0) {
						p[k] = i;
						k++;
					}
				}
			}
			for (int i = 0; i < k; i++) {
				System.out.println(p[i]);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
	}
}
