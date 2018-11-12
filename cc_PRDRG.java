import java.util.*;

public class cc_PRDRG {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int i;
			int t = in.nextInt();
			int[] n = new int[t];
			double[] fr = new double[2 * t];
			for (i = 0; i < t; i++) {
				n[i] = in.nextInt();
			}
			System.out.println();
			for (i = 0; i < 2 * t; i++) {
				if (i % 2 == 0) {
					fr[i] = 1;
				} else {
					int q = i / 2;
					fr[i] = Math.pow(2, q + 1);
				}
			}
			for (i = 0; i < 2 * t; i++) {
				System.out.printf("%f ", fr[i]);
			}
			// TODO Auto-generated method stub
		}
	}
}
