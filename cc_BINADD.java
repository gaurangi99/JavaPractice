import java.util.Scanner;

public class cc_BINADD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			String a = in.next();
			String b = in.nextLine();
			char[] a_char = a.toCharArray();
			char[] b_char = b.toCharArray();
			int maxLen=0;
			if(a.length()>b.length()) {
				maxLen=a.length();
			}else if(a.length()<b.length()) {
				maxLen=b.length();
			}else {
				maxLen=a.length();
			}
			int[] a_int=new int[maxLen];
			int[] b_int=new int[maxLen];
			int zeros = 0, flag = 0;
			int count = 0;
			for (int i = 0; i < b_char.length; i++) {
				if (b_char[i] == '0') {
					zeros++;
				}
			}
			if (zeros == b_char.length) {
				flag = 1;
			}
			while (flag != 1) {
				int[] u = new int[];
				int[] v = new int[];
				u = a ^ b;
				v = a & b;
				a = u;
				b = v * 2;
				count++;
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub
	}
}
//3
//100010
//0
//0
//100010
//11100
//1010