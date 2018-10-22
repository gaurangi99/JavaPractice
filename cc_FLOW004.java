import java.util.*;

public class cc_FLOW004 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int n = in.nextInt();
				int s = 0, r;
				r = n % 10;
				s += r;
				while (n != 0) {
					r = n % 10;
					n = n / 10;
					if (n == 0) {
						s += r;
					}
				}
				System.out.println(s);
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
