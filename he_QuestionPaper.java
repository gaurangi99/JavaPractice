import java.util.*;

public class he_QuestionPaper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int r;
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
