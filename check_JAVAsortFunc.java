import java.util.*;

public class check_JAVAsortFunc {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int i, n;
			int[] a = new int[10];
			n = in.nextInt();
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a, 0, n);
			System.out.println();
			for (i = 0; i < n; i++) {
				System.out.printf("%d ", a[i]);
			}
			// TODO Auto-generated method stub
		}
	}
}
