import java.util.*;

public class cc_SINS {

	public static void main(String[] args) {
		int t, x, y, s = 0, r, a = 0, b = 0;
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				x = in.nextInt();
				y = in.nextInt();
				if (x != 0 && y != 0) {
					if (x > y) {
						a = x;
						b = y;
					} else if (x < y) {
						a = y;
						b = x;
					} else if (x == y) {
						a = b = x;
					}
					while (a % b != 0) {
						r = a % b;
						a = b;
						b = r;
					}
					s = 2 * b;
				} else {
					s = x + y;
				}
				System.out.println(s);
				t--;
			}
		}
	}
}
