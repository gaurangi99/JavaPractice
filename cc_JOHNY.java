import java.util.*;

public class cc_JOHNY {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int i, valueOfJohny;
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int k = in.nextInt();
			valueOfJohny = a[k - 1];
			Arrays.sort(a);
			for (i = 0; i < n; i++) {
				if (a[i] == valueOfJohny) {
					System.out.println(i + 1);
					break;
				}
			}
		}
		// TODO Auto-generated method stub
	}
}
