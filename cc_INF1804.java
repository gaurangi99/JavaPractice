import java.util.*;

public class cc_INF1804 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				long n = in.nextInt();
				long s;
				s = ((n * n * n) + n) / 2;
				System.out.println(s);
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
