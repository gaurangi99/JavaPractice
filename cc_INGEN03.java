import java.util.Scanner;
import java.math.BigInteger;

public class cc_INGEN03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			BigInteger numberOfPaths, noP_Des, noP_Pothole, noP_PotholeToDes;
			noP_Des = fact(x + y).divide(fact(x).multiply(fact(y)));
			// System.out.println(noP_Des);
			noP_Pothole = fact(a + b).divide(fact(a).multiply(fact(b)));
			// System.out.println(noP_Pothole);
			noP_PotholeToDes = fact(x + y - a - b).divide(fact(x - a).multiply(fact(y - b)));
			// System.out.println(noP_PotholeToDes);
			numberOfPaths = noP_Des.subtract(noP_PotholeToDes.multiply(noP_Pothole));
			// System.out.println(numberOfPaths);
		}
		// TODO Auto-generated method stub
	}

	private static BigInteger fact(int n) {
		BigInteger fac;
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		} else {
			fac = fact(n - 1).multiply(BigInteger.valueOf(n));
		}
		return fac;
	}
}
