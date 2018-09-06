import java.util.Scanner;

public class probset {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, N, M, i, j;
		String[] n = new String[10];
		int[] m = new int[10];
		t = in.nextInt();
		while (t >= 0) {
			N = in.nextInt();
			M = in.nextInt();
			for (i = 0; i < N; i++) {
				n[i]=in.nextLine();
				for(j=0;j<M;j++) {
					m[j]=in.nextInt();
				}
			}
			
		}
		; // TODO Auto-generated method stub

	}

}
