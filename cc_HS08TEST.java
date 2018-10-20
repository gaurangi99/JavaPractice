import java.util.*;

public class cc_HS08TEST {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int x = in.nextInt();
			double bc = 0.50;
			System.out.println(bc);
			double ab = in.nextDouble();
			if (x % 5 == 0) {
				ab = ab - x - bc;
				System.out.printf("%.2d", ab);
			} else {
				System.out.printf("%.2d", ab);
			}
			// TODO Auto-generated method stub
		}
	}
}
