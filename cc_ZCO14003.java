import java.util.*;

public class cc_ZCO14003 {

	public static void main(String[] args) {
		long n, max;
		int i;
		long[] p = new long[10];
		cc_ZCO14003 o = new cc_ZCO14003();
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			n = in.nextLong();
			for (i = 1; i <= n; i++) {
				p[i] = in.nextLong();
			}
			o.sort(p, n);
			max = p[1];
			for (i = 2; i <= n; i++) {
				if (max < (i * p[i])) {
					max = p[i] * i;
				}
			}
			System.out.println(max);
			// TODO Auto-generated method stub
		}
	}

	public void sort(long[] p, long n) {
		int i, j;
		long key;
		for (i = 2; i <= n; i++) {
			key = p[i];
			j = i - 1;
			while (j > 0 && p[j] < key) {
				p[j + 1] = p[j];
				j--;
			}
			p[j + 1] = key;
		}
	}
}