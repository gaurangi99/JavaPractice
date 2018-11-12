import java.util.*;

public class cc_PRDRG {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		int t = in.nextInt();
		int[] n = new int[25];
		double[] fr = new double[50];
		for (i = 1; i <= t; i++) {
			n[i] = in.nextInt();
		}
		for (i = 1; i <= 2 * t; i++) {
			if (i % 2 != 0) {
				fr[i] = 1;
			} else {
				int q = i / 2;
				fr[i] = Math.pow(2, q);
			}
		}
		for (i = 1; i <= 2 * t; i++) {
			System.out.printf("%d ", fr[i]);
		}
		// TODO Auto-generated method stub
	}
}
