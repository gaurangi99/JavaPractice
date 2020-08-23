import java.util.Scanner;

public class cc_LECANDY {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int i, s = 0;
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int c = in.nextInt();
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int[] assignCandy = new int[n];
			for (i = 0; i < n; i++) {
				if (a[i] <= c) {
					assignCandy[i] = a[i];
				}
				c -= a[i];
			}
			if (c > -1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}

//line16
//				s += a[i];
//			}
//			if (s <= c) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
// TODO Auto-generated method stub
