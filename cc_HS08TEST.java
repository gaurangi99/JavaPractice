import java.util.*;

public class cc_HS08TEST {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			int x = in.nextInt();
			float bc = (1 / 2);
			float ab = in.nextFloat();
			if (x % 5 == 0) {
				ab = ab - x - bc;
				System.out.printf("%.2f", ab);
			} else {
				System.out.printf("%.2f", ab);
			}
			// TODO Auto-generated method stub
		}
	}
}
