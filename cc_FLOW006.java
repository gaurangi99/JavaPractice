import java.util.*;

public class cc_FLOW006 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				int n = in.nextInt();
				int r=0, s = 0;
				while (n != 0 && r != 0) {
					n = n / 10;
					r = n % 10;
					s += r;
				}
				System.out.println(s);
				t--;
			}
			// TODO Auto-generated method stub
		}
	}
}