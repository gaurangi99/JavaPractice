import java.util.Arrays;
import java.util.Scanner;

public class cc_RAINBOWA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int i, j, flag = 0, sum = 0;
			int[] a = new int[n];
			int[] count = { 0, 0, 0, 0, 0, 0, 0 };
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
				switch (a[i]) {
				case 1:
					count[0]++;
					sum++;
					break;
				case 2:
					count[1]++;
					sum++;
					break;
				case 3:
					count[2]++;
					sum++;
					break;
				case 4:
					count[3]++;
					sum++;
					break;
				case 5:
					count[4]++;
					sum++;
					break;
				case 6:
					count[5]++;
					sum++;
					break;
				case 7:
					count[6]++;
					sum++;
					break;
				}
			}
			if (n < 13) {
				System.out.println("no");
				System.exit(0);
			}
			if (sum != n) {
				System.out.println("no");
				System.exit(0);
			} else {
				for (i = 0; i < 7; i++) {
					if (count[i] == 0) {
						System.out.println("no");
						System.exit(0);
					}
				}
			}
			if (n % 2 == 0) {
				for (i = 0, j = n - 1; i < n / 2 && j >= n / 2; i++, j--) {
					if (a[0] == 1) {
						;
					}
					if ((a[i] == a[i - 1] || a[i] == a[i - 1] + 1) && i != 0) {
						;
					}
					if (a[i] != a[j]) {
						System.out.println("no");
						System.exit(0);
					} else {
						flag++;
					}
				}
				if (flag == n / 2) {
					System.out.println("yes");
					System.exit(0);
				}
			} else {
				for (i = 0, j = n - 1; i < n / 2 && j > n / 2; i++, j--) {
					if (a[0] == 1) {
						;
					}
					if ((a[i] == a[i - 1] || a[i] == a[i - 1] + 1) && i != 0) {
						;
					}
					if (a[n / 2] == 7) {
						;
					}
					if (a[i] != a[j]) {
						System.out.println("no");
						System.exit(0);
					} else {
						flag++;
					}
				}
				if (flag == n / 2 && a[n / 2] == 7) {
					System.out.println("yes");
					System.exit(0);
				}
			}
		}
	}
}

//			if (n % 2 == 0 && count[i] % 2 != 0) {
//				System.out.println("no");
//				System.exit(0);
//			} else if (n % 2 != 0 && i != 6 && count[i] % 2 != 0) {
//				System.out.println("no");
//				System.exit(0);
//			} else if (n % 2 != 0 && i == 6 && count[i] % 2 == 0) {
//				System.out.println("no");
//				System.exit(0);
//			}
//			for (i = 0; i < n / 2; i++) {
//				if (i == 0 && a[i] != 1) {
//					System.out.println("no");
//					System.exit(0);
//				} else if (i > 0 && (a[i] == a[i - 1] || a[i] == a[i - 1] + 1)) {
//				} else {
//					System.out.println("no");
//					System.exit(0);
//				}
//			}
//			if (n % 2 == 0) {
//				for (i = 0, j = n - 1; i < n / 2 && j >= n / 2; i++, j--) {
//					if (a[i] != a[j]) {
//						System.out.println("no");
//						System.exit(0);
//					}
//					if (i == n / 2 - 1 && j == n / 2 && a[i] == a[j]) {
//						System.out.println("yes");
//					}
//				}
//			} else {
//				for (i = 0, j = n - 1; i <= n / 2 && j >= n / 2; i++, j--) {
//					System.out.printf("%d %d", i, j);
//					System.out.println();
//					if (a[i] != a[j]) {
//						System.out.println("no");
//						System.exit(0);
//					}
//					if (i == n / 2 && j == n / 2 && a[i] == a[j]) {
//						System.out.println("yes");
//					}
//				}
//			}
//		}
//		// TODO Auto-generated method stub
//	}
//}

//int[] a_sorted = new int[n];
//for (i = 0; i < n; i++) {
//	a_sorted[i] = a[i];
//}
//Arrays.sort(a_sorted);
//System.out.println();

//	int[] sort_a = new int[n / 2];
//	if (n % 2 == 0) {
//		for (i = 0; i < n / 2; i++) {
//			sort_a[i] = a[i];
//		}
//	} else {
//		for (i = 0; i <= n / 2; i++) {
//			sort_a[i] = a[i];
//		}
//	}
//	Arrays.sort(sort_a);
//	if (n % 2 == 0) {
//		for (i = 0; i < n / 2; i++) {
//			if (sort_a[i] != a[i]) {
//				System.out.println("no");
//				System.exit(0);
//			}
//		}
//	} else {
//		for (i = 0; i <= n / 2; i++) {
//			if (sort_a[i] != a[i]) {
//				System.out.println("no");
//				System.exit(0);
//			}
//		}
//	}
//	if (extra != 0) {
//		System.out.println("no");
//		System.exit(0);
//	}
