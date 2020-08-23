import java.util.Scanner;

public class cc_SC31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int i, res, count = 0;
			int n = in.nextInt();
			int[] S = new int[n]; // coz input is binary number
			int[] decimal_S = new int[n]; // for converting binary number in S to decimal
			for (i = 0; i < n; i++) {
				int j = 0;
				S[i] = in.nextInt(); // binary number input
				while (S[i] != 0) {
					decimal_S[i] += Math.pow(2, j) * (S[i] % 10); // conversion
					S[i] /= 10;
					j++;
				}
			}
			res = decimal_S[0];
			for (i = 1; i < n; i++) {
				res = res ^ decimal_S[i];
			}
			int[] binary_res = new int[10]; // for converting the final xor output decimal no. in res to binary form
			i = 9;
			while (i >= 0) {
				binary_res[i] = res % 2; // conversion
				res /= 2;
				i--;
			}
			for (i = 0; i < 10; i++) {
				if (binary_res[i] == 1)
					count++;
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub
	}
}
