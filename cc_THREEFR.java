import java.util.*;

public class cc_THREEFR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			int s, half;
			s = x + y + z;
			if (s % 2 == 0) {
				half = s / 2;
				if (half == x && half == y + z) {
					System.out.println("yes");
				} else if (half == y && half == x + z) {
					System.out.println("yes");
				} else if (half == z && half == x + y) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			} else {
				System.out.println("no");
			}
			t--;
		}
		// TODO Auto-generated method stub
	}
}
