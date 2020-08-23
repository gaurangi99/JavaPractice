import java.util.Scanner;

public class cc_HRDSEQ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int i, j, x, l, k, count = 0, flag;
			int n = in.nextInt();
			int[] a = new int[n];
			a[0] = 0;
			for (i = 1; i < n; i++) {
				flag = 0;
				l = i - 1;
				x = a[l];
				j = l - 1;
				while (flag != 1 && j >= 0) {
					if (a[j] == x) {
						k = j;
						a[i] = l - k;
						flag = 1;
					}
					j--;
				}
				if (flag == 0) {
					a[i] = 0;
				}
			}
			for (i = n - 1; i >= 0; i--) {
				if (a[n - 1] == a[i])
					count++;
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub
	}
}
