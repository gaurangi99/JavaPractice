/* Love Babbar Documentation
* Arrays Intermediate 10
*/

import java.util.*;

public class loveBim_array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
			int max3 = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				if (max1 < a[i]) {
					max3 = max2;
					max2 = max1;
					max1 = a[i];
				} else if (max2 < a[i]) {		// && a[i] < max1
					max3 = max2;
					max2 = a[i];
				} else if (max3 < a[i]) {		// && max2 > a[i]
					max3 = a[i];
				}
			}

			System.out.printf("%d, %d, %d\n", max1, max2, max3);
		}
	}

}
