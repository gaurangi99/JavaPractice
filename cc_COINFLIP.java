import java.util.*;

public class cc_COINFLIP {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int g = in.nextInt();
				while (g > 0) {
					int i = in.nextInt();
					long n = in.nextLong();
					int q = in.nextInt();
					if (n % 2 != 0) {
						if (i == 1) {
							if (q == 1) {
								System.out.println(n / 2);
							} else {
								System.out.println(n / 2 + 1);
							}
						} else {
							if (q == 1) {
								System.out.println(n / 2 + 1);
							} else {
								System.out.println(n / 2);
							}
						}
					} else {
						System.out.println(n / 2);
					}
				}
				g--;
			}
			t--;
		}
	}
	// TODO Auto-generated method stub
}
