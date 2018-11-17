import java.util.*;

public class cc_ELEVSTRS {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			int t = in.nextInt();
			while (t > 0) {
				int n = in.nextInt();
				int v1 = in.nextInt();
				int v2 = in.nextInt();
				double e = 0, s = 0;
				e = (2 * (double) n) / v2;
				s = (Math.sqrt(2) * (double) n) / v1;
				if (s > e) {
					System.out.println("Elevator");
				} else {
					System.out.println("Stairs");
				}
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
