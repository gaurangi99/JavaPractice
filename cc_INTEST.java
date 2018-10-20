import java.util.*;

public class cc_INTEST {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int n = in.nextInt();
			int k = in.nextInt();
			int[] t = new int[n];
			int i, count = 0;
			for (i = 0; i < n; i++) {
				t[i] = in.nextInt();
			}
			for (i = 0; i < n; i++) {
				if (t[i] % k == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub
	}

}
