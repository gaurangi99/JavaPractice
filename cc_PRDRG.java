import java.util.*;

public class cc_PRDRG {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int i;
			int t = in.nextInt();
			int[] n = new int[25];
			long[] fr = new long[50];
			for (i = 0; i < t; i++) {
				n[i] = in.nextInt();
			}
			System.out.println();
			fr[0] = fr[2] = 1;
			fr[1] = 2;
			fr[3] = 4;
			for (i = 4; i < 50; i++) {
				if (i % 2 == 0) {
					if ((i / 2) % 2 == 0) {
						fr[i] = fr[i - 2] * 2 + 1;
					} else if ((i / 2) % 2 != 0) {
						fr[i] = fr[i - 2] * 2 - 1;
					}
				} else {
					fr[i] = (long) Math.pow(2, (i / 2 + 1));
				}
			}
			for (i = 0; i < t; i++) {
				System.out.printf("%d ", fr[(2 * n[i]) - 2]);
				System.out.printf("%d ", fr[(2 * n[i]) - 1]);
			}
			// TODO Auto-generated method stub
		}
	}
}
