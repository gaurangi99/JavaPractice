import java.util.Arrays;
import java.util.Scanner;

public class cc_FFC219F {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t, n, p, i;
		t = in.nextInt();
		while (t-- > 0) {
			int enemies = 0;
			n = in.nextInt();
			p = in.nextInt();
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for (i = 0; i < n; i++) {
				if (a[i] < p) {
					p = p - a[i];
					enemies++;
				} else if (a[i] == p) {
					enemies++;
				} else {
					break;
				}
			}
			System.out.println(enemies);
		}
		// TODO Auto-generated method stub
	}
}
