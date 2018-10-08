import java.util.*;

public class cc_BITOBYT {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int n = in.nextInt();
				double b = 0, nb = 0, by = 0;
				int q = n / 16;
				int r = n % 16;
				if (n != 0) {
					if (r == 1 || r == 2) {
						b = Math.pow(2, q);
					} else if (r >= 3 && r <= 8) {
						nb = Math.pow(2, q);
					} else if (r >= 9 && r <= 15) {
						by = Math.pow(2, q);
					} else if (r == 0 && q > 0) {
						by = Math.pow(2, q - 1);
					}
				} else {
					b = 1;
				}
				System.out.printf("%d %d %d\n", ((int) (b)), ((int) (nb)), ((int) (by)));
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
