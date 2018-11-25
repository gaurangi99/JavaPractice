import java.util.*;

public class he_additionErrors {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				long a = in.nextLong();
				long b = in.nextLong();
				long er = 0, r1, r2;
				double p = 0;
				while ((a % 10 != 0 || a / 10 != 0) && (b % 10 != 0 || b / 10 != 0)) {
					r1 = a % 10;
					r2 = b % 10;
					p++;
					if (r2 > 9 - r1) {
						er += Math.pow(10, p);
					}
					a = a / 10;
					b = b / 10;
				}
				System.out.println(er);
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
