import java.util.*;
//import org.apache.commons.lang3.ArrayUtils;

public class cc_ZCO14003 {

	public static void main(String[] args) {
		long n, max;
		int i, t;
		long[] p = new long[10];
		// cc_ZCO14003 o = new cc_ZCO14003();
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				n = in.nextLong();
				if (n == 0) {
					break;
				} else {
					for (i = 1; i <= n; i++) {
						p[i] = in.nextLong();
					}
					Arrays.sort(p);
					
					max = p[1];
					for (i = 2; i <= n; i++) {
						if (max < (i * p[i])) {
							max = p[i] * i;
						}
					}
					System.out.println(max);
				}
				t--;
			}
			// TODO Auto-generated method stub
		}
	}

	/*public static void sort(long[] p, long n) {
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
	}*/
}
