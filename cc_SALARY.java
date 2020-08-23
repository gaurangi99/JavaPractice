import java.util.Scanner;

public class cc_SALARY {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t, n, i;
		t = in.nextInt();
		while (t-- > 0) {
			int sumOfW = 0, minW = 10000;
			n = in.nextInt();
			int[] w = new int[n];
			for (i = 0; i < n; i++) {
				w[i] = in.nextInt();
				sumOfW += w[i];
				if (w[i] < minW) {
					minW = w[i];
				}
			}
			System.out.println(sumOfW - n * minW);
		}
		// TODO Auto-generated method stub
	}
}
