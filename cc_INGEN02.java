import java.util.Scanner;

public class cc_INGEN02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int i, s = 0;
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
				s += a[i];
			}
			if (s % 2 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		// TODO Auto-generated method stub
	}
}
