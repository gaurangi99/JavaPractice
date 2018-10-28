import java.util.*;

public class he_ReversingElements {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 1; i <= n; i++) {
				a[i] = in.nextInt();
			}
			int q = in.nextInt();
			{
				int l = in.nextInt();
				int r = in.nextInt();
				int tmp;
				tmp = a[l];
				a[l] = a[r];
				a[r] = tmp;

			}

		}
		// TODO Auto-generated method stub
	}
}
