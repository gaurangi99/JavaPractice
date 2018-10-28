import java.util.*;

public class he_TotalCost {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int s = in.nextInt();
		int t = in.nextInt();
		int h = in.nextInt();
		int x = in.nextInt();
		int tc = 0;
		if (x <= s) {
			if (s > t) {
				tc = (s - t) * p + (x - s + t) * h;
			}
		}
		System.out.println(tc);
		// TODO Auto-generated method stub
	}
}
