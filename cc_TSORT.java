import java.util.*;

public class cc_TSORT {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int k;
			int t = in.nextInt();
			int a[] = new int[t];
			for (k = 0; k < t; k++)
				a[k] = in.nextInt();
			Arrays.sort(a);
			for (k = 0; k < t; k++) {
				System.out.println(a[k]);
			}
			// TODO Auto-generated method stub
		}
	}
}