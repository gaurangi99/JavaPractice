import java.util.*;

public class cc_FCTRL2 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			BigNumber t = in.nextInt();
			while (t > 0) {
				BigNumber i = 0, fac = 1;
				BigNumber n = in.nextInt();
				if (n == 0) {
					fac = 1;
				} else {
					for (i = n; i >= 1; i--) {
						fac = fac * i;
					}
				}
				System.out.println(fac);
				t--;
			}
			// TODO Auto-generated method stub
		}
	}
}