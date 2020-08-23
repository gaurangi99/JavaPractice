import java.util.*;

public class cc_WATSCORE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] p = new int[n];
			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = in.nextInt();
				s[i] = in.nextInt();
			}
			int maxScore = 0;
			int[] max = new int[12];
			for (int i = 0; i < n; i++) {
				if (p[i] < 9) {
					if (max[p[i]] < s[i]) {
						max[p[i]] = s[i];
					}
				} else {
					max[p[i]] = 0;
				}
			}
			for (int i = 1; i < 9; i++) {
				maxScore += max[i];
			}
			System.out.println(maxScore);
		}
		// TODO Auto-generated method stub
	}
}
