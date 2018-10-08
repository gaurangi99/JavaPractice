import java.util.*;

public class cc_CHSERVE {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int p1 = in.nextInt();
				int p2 = in.nextInt();
				int k = in.nextInt();
				int s = p1 + p2;
				int q;
				q = s / k;
				if (q % 2 == 0) {
					System.out.println("CHEF");
				} else if (q % 2 != 0) {
					System.out.println("COOK");
				}
				t--;
			}
			// TODO Auto-generated method stub
		}
	}
}
