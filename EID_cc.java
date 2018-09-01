import java.util.Scanner;
import static java.lang.Math.abs;

public class EID_cc {

	public static void main(String[] args) {
		int t, n, i;
		int[] v, d;
		Scanner in = new Scanner();
		t = in.nextInt();
		while (t >= 0) {
			n = in.nextInt();
			for (i = 0; i < n; i++) {
				v[i] = in.nextInt();
			}
			sort(v, n);
			for (i = 0; i < n - 1; i++) {
				d[i] = abs(v[i] - v[i + 1]);
			}
			sort(d, n - 1);
			System.out.printf("\n%d", d[0]);
			t--;
		}
		
	public void sort(int[] v, int n) {
		int l,m;
		
		
	}
		// TODO Auto-generated method stub

	}

}
