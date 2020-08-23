import java.util.Scanner;

public class cc_KW6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n = in.nextInt();
		int i, odd = 0, even = 0;
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		if (n % 2 == 0) {
			if ((even % 2 == 0 && odd % 2 == 0 && even == odd) || (even % 2 != 0 && odd % 2 != 0 && even == odd)) {
				System.out.println("DL");
			} else {
				System.out.println("DETAIN");
			}
		} else {
			if ((even % 2 != 0 && odd % 2 == 0 && Math.abs(even - odd) == 1)
					|| (even % 2 == 0 && odd % 2 != 0 && Math.abs(odd - even) == 1)) {
				System.out.println("DL");
			} else {
				System.out.println("DETAIN");
			}
		}
		// TODO Auto-generated method stub
	}
}
