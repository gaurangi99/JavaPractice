import java.util.*;

public class cc_SINS {

	public static void main(String[] args) {
		int t, x, y, s = 0;
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				x = in.nextInt();
				y = in.nextInt();
				while (x != y && (x != 0 || y != 0)) {
					if (x < y) {
						y = y - x;
					} else if (x > y) {
						x = x - y;
					}
				}
				s = x + y;
				System.out.println(s);
				t--;
			}
			// TODO Auto-generated method stub
		}
	}
}
