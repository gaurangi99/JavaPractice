import java.util.*;

public class cc_CHNGIT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int count = 0, max = 0, mode = 0, freq = 0;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if (max < a[i]) {
					max = a[i];
				}
			}
			int[] b = new int[max + 1];
			for (int i = 1; i <= max; i++) {
				b[a[i]]++;
			}
			for (int i = 1; i <= max; i++) {
				if (freq < b[i]) {
					mode = i;
				}
			}
			Arrays.sort(a);
			for (int i = 0; i < n; i++) {
				if (a[i] != mode) {
					count++;
				}
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub
	}
}
