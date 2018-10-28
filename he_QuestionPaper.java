import java.util.*;

public class he_QuestionPaper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while (t > 0) {
			long n = in.nextLong();
			int a = in.nextInt();
			int b = in.nextInt();
			long r;
			if (a == b) {
				r = (n * n) + 1;
			} else {
				r = ((n + 2) * (n + 1)) / 2;
			}
			System.out.println(r);
			t--;
		}
		// TODO Auto-generated method stub
	}
}
