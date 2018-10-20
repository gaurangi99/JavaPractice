import java.util.*;

public class cc_KFIB {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int n = in.nextInt();
			int k = in.nextInt();
			System.out.println(t(n, k));
			// TODO Auto-generated method stub
		}
	}

	public static int t(int n, int k) {
		int s = 0;
		if (n <= k) {
			s = 1;
		} else {
			for (int i = 1; i < k + 1; i++) {
				s += t(n - i, k);
			}
		}
		return s;
	}
}
