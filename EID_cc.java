import java.util.Scanner;
import static java.lang.Math.abs;

public class EID_cc {
	int[] a;
	int b;

	public static void main(String[] args) {
		int t, n, i;
		int[] v = new int[10];
		int[] d = new int[10];
		try (Scanner in = new Scanner(System.in);) {
			EID_cc s = new EID_cc();
			t = in.nextInt();
			while (t >= 0) {
				n = in.nextInt();
				for (i = 0; i < n; i++) {
					v[i] = in.nextInt();
				}
				s.sort(v, n);
				for (i = 0; i < n - 1; i++) {
					d[i] = abs(v[i] - v[i + 1]);
				}
				s.sort(d, n - 1);
				System.out.printf("\n%d", d[0]);
				t--;
			}
		}
	}

	public void sort(int[] a, int b) {
		int l, m, tmp;
		for (l = 1; l <= b; l++) {
			for (m = 0; m < l; m++) {
				if (a[m] > a[l]) {
					tmp = a[l];
					a[l] = a[m];
					a[m] = tmp;
				}
			}
		}
	}
	// TODO Auto-generated method stub
}
