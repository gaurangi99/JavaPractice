import java.util.Scanner;

public class cc_CYPNOV03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n = in.nextInt();
		int m = in.nextInt();
		int i, j, grps = 0;
		int[][] exchanges = new int[m][2];
		boolean[] ppl = new boolean[n];
		for (i = 0; i < m; i++) {
			for (j = 0; j < 2; j++) {
				exchanges[i][j] = in.nextInt();
			}
		}
		for (i = 0; i < m; i++) {
			int flag = 0, count = 0;
			for (j = 0; j < 2; j++) {
				if (exchanges[i][j] <= n && ppl[exchanges[i][j] - 1] == false) {
					ppl[exchanges[i][j] - 1] = true;
				} else {
					flag = 1;
				}
			}
			if (flag == 0) {
				grps++;
			}
		}
		System.out.println(grps);
		// TODO Auto-generated method stub
	}
}
