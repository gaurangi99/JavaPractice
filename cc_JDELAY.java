import java.util.*;

public class cc_JDELAY {

	public static void main(String[] args) {
		int t, n, s, j, r, i;
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				int count = 0;
				n = in.nextInt();
				for (i = 0; i < n; i++) {
					s = in.nextInt();
					j = in.nextInt();
					r = j - s;
					if (r > 5 && r > 0) {
						count++;
					}
				}
				System.out.println(count);
				t--;
			}
			// TODO Auto-generated method stub
		}
	}
}
