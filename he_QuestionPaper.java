import java.util.*;

public class he_QuestionPaper {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			long t = in.nextLong();
			while (t > 0) {
				long n = in.nextLong();
				int a = in.nextInt();
				int b = in.nextInt();
				long r = 0;
				if (a == b) {
					r = (n * 2) + 1;
				} else {
					r = (n + 2) * (n + 1) / 2;
				}
				System.out.println(r);
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
