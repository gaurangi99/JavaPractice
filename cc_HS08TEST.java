import java.util.*;

public class cc_HS08TEST {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			double w = in.nextDouble();
			// double bc = 0.50;
			double ab = in.nextDouble();
			if (w + 0.50 <= ab) {
				if (w % 5 == 0) {
					ab = ab - w - 0.50;
				}
			}
			System.out.printf("%.2f", ab);
		}
	}// TODO Auto-generated method stub
}
