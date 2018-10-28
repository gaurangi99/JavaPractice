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
			while (s > t) {
				tc += p;
				s--;
				x--;
			}
			while (s > 0 && s <= t && x > 0) {
				tc += h;
				s--;
				x--;
			}
		}
		System.out.println(tc);
		// TODO Auto-generated method stub
	}
}
