import java.util.Scanner;

public class cc_INGEN01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int k = in.nextInt();
			in.nextLine();
			String encoded_s = in.nextLine();
			encoded_s = encoded_s.replaceAll("\\s+", "");
			char[] encoded = encoded_s.toCharArray();
			char[] decoded = new char[encoded.length];
			int i, j = 0, K;
			K = k % 26;
			for (i = 0; i < encoded.length; i++) {
				if ((((int) encoded[i]) - K) >= 65 && (((int) encoded[i]) - K) <= 90) {
					decoded[j] = (char) (((int) encoded[i]) - K);
				} else {
					decoded[j] = (char) (((int) encoded[i]) - K + 26);
				}
				j++;
			}
			for (i = 0; i < decoded.length; i++) {
				if (decoded[i] == 'Q' && decoded[i + 1] == 'Q') {
					System.out.printf(" ");
					i = i + 1;
				} else {
					System.out.printf("%c", decoded[i]);
				}
				if (i == decoded.length - 1) {
					System.out.println();
				}
			}
		}
		// TODO Auto-generated method stub
	}
}

/* alternate code for line 11 */
/*
 * String encoded_s = in.next()+ in.nextLine();
 */
/*
 * in.next();
 * String encoded_s = in.nextLine();
 */

/* alternate code for line 13 */
//char[] encoded_new = encoded_s.toCharArray();
//String encoded_spaceless = "";
//			for (int i = 0; i < encoded_new.length; i++) {
//				if (encoded_new[i] != ' ' && encoded_new[i] != '\t') {
//					encoded_spaceless = encoded_spaceless + encoded_new[i];
//				}
//			}

/*
 * XUST FCCM CCRU DQCC FTQK CCOM ZFCC BGFC CAGF
 */