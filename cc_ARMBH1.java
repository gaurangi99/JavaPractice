import java.util.*;

public class cc_ARMBH1 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			int x = in.nextInt();
			int n = in.nextInt();
			int s = 0;
			if (n % x == 0) {
				while (n != 0) {
					s += n;
					n = n - x;
				}
			} else {
				n = n - (n % x);
				while (n != 0) {
					s += n;
					n = n - x;
				}
			}
			System.out.println(s);
		}
		// TODO Auto-generated method stub
	}
}
