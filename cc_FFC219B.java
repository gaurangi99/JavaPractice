import java.util.Scanner;

public class cc_FFC219B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		while (t-- > 0) {
			long l = in.nextLong();
			long r = in.nextLong();
			long S = 0;
			for (long i = l; i <= r; i++) {
				S = (S + (i * (i + 1) * (i + 2) * (i + 3))) % 1000000007;
			}
			System.out.println(S);
		}
		// TODO Auto-generated method stub
	}
}
