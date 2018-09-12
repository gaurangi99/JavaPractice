import java.util.*;

public class cc_CHEFADV {

	public static void main(String[] args) {
		int t, n, m, x, y, power = 1, knowledge = 1;
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			while (t > 0) {
				n = in.nextInt();
				m = in.nextInt();
				x = in.nextInt();
				y = in.nextInt();
				if (n == 1 && m == 1) {
					System.out.println("Chefirnemo");
				} else if (n == 2 && m == 2) {
					System.out.println("Chefirnemo");
				} else if (n > 2 && m > 2) {
					if (n % x == 0 && m % y == 0) {
						while (power != n) {
							power += x;
						}
						while (knowledge != m) {
							knowledge += y;
						}
					} else if (n % x == 1 && m % y == 1) {
						while (power <= n) {
							power += x;
						}
						while (knowledge <= n) {
							knowledge += y;
						}
						if(power!=n && knowledge!=m) {
							power++;
							knowledge++;
							}
						}
				if (power == n && knowledge == m) {
					System.out.println("Chefirnemo");
				} else {
					System.out.println("Pofik");
				}
				t--;
			}
		}
		// TODO Auto-generated method stub
	}
}
