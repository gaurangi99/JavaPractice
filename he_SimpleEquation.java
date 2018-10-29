import java.util.*;

public class he_SimpleEquation {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				long n = in.nextLong();
				long ans = 0;
				for (long i = 0; i <= n / 2; i++) {
					ans += (fact(n) / (fact(i) * fact(n - i))) - (fact(n - i) / (fact(i) * fact(n - 2 * i)));
				}
				System.out.println(ans % 1000003);
				t--;
			}
			// TODO Auto-generated method stub
		}
	}

	public static long fact(long n) {
		long fac;
		if (n == 0 || n == 1) {
			return 1;
		} else {
			fac = n * fact(n - 1);
		}
		return fac;
	}
}
