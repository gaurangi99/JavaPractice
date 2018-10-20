import java.util.*;
import java.math.*;

public class cc_FCTRL2 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				BigInteger fac = new BigInteger("1");
				int n = in.nextInt();
				for (int i = 2; i <= n; i++) {
					fac = fac.multiply(BigInteger.valueOf(i));
				}
				System.out.println(fac);
				t--;
			}
			// TODO Auto-generated method stub
		}
	}
}