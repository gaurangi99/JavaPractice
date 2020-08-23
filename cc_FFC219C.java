import java.util.Scanner;

public class cc_FFC219C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n, q, ch = 0, i, flag = 0;
		String largest = null;
		String smallest = null;
		n = in.nextInt();
		String[] poem = new String[100];
		for (i = 0; i < n; i++) {
			poem[i] = in.next();
		}
		q = in.nextInt();
		String[] pre = new String[50];
		for (i = 0; i < q; i++) {
			pre[i] = in.next();
		}
		for (i = 0; i < q; i++) {
			largest = poem[0];
			for (int j = 0; j < n; j++) {
				if (poem[j].startsWith(pre[i])) {
					ch += poem[j].length() - pre[i].length();
					if (largest.compareTo(poem[j]) < 0) {
						largest = poem[i];
					}
					if (smallest.compareTo(poem[j]) > 0) {
						smallest = poem[i];
					}
					flag = 1;
				} else {
					flag = 0;
				}
			}
			if (flag == 0) {
				System.out.println("-1");
			}
			System.out.printf("%d %s %s", ch, largest, smallest);
		}
		// TODO Auto-generated method stub
	}
}
