import java.util.*;

public class cc_MAGICHF {

	public static void main(String[] args) {
		int t, n, x, s;
		int a, b;
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				n = in.nextInt();
				x = in.nextInt();
				s = in.nextInt();
				while (s > 0) {
					a = in.nextInt();
					b = in.nextInt();
					if (x <= n) {
						if ((a <= n && b <= n) && (a != b)) {
							if (a == x) {
								x = b;
							} else if (b == x) {
								x = a;
							}
						}
					}
					s--;
				}
				System.out.println(x);
				t--;
			}
		}
	}
}// TODO Auto-generated method stub
