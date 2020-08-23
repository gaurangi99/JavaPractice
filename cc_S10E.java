import java.util.Scanner;

public class cc_S10E {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int count = 1;
			int n = in.nextInt();
			int i;
			int[] p = new int[n];
			for (i = 0; i < n; i++) {
				p[i] = in.nextInt();
			}
			for (i = 1; i < 5; i++) {
				int c = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (p[i] < p[j]) {
						c++;
					}
				}
				if (c == i) {
					count++;
				}
			}
			for (i = 5; i < n; i++) {
				int c = 0;
				for (int j = i - 1; j >= i - 5; j--) {
					if (p[i] < p[j]) {
						c++;
					}
				}
				if (c == 5) {
					count++;
				}
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub
	}
}