import java.util.*;

public class cc_CHEFRES {

	public static void main(String[] args) {
		cc_CHEFRES cr = new cc_CHEFRES();
		try (Scanner in = new Scanner(System.in);) {
			int t;
			int[][] lr = new int[10][2];
			t = in.nextInt();
			while (t > 0) {
				int i, j, flag = 0;
				int[] p = new int[10];
				int[] o = new int[10];
				int n = in.nextInt();
				int m = in.nextInt();
				for (i = 0; i < n; i++) {
					for (j = 0; j < 2; j++) {
						lr[i][j] = in.nextInt();
					}
				}
				cr.sortbyColumn(lr, 0);
				for (i = 0; i < n - 1; i++) {
					j = 1;
					if (lr[i][1] < lr[i + 1][0])
						;
					else {
						flag++;
					}
				}
				int max = lr[n - 1][2];
				for (i = 0; i < m; i++) {
					p[i] = in.nextInt();
					if(p[i]>=max) {
						System.out.println(-1);
					}
					for (i = 0; i < n; i++) {
						if(p>=lr[i][0] && p<lr[i][1]) {
							System.out.println(0);
						}
						else if(p<lr[i][0] && p>=lr[i][1] && (!(p>=max))) {
							
						}
						}
				}
				while(flag==0) {
					for(i=0;i<m;i++) {
						if(p[i]>=max) {
							System.out.println(-1);
						}
						else if()
					}
				}
				t--;
			}
		}
	}

	// TODO Auto-generated method stub

	public void sortbyColumn(int arr[][], int col) {
		// Using built-in sort function Arrays.sort
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1, final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				if (entry1[col] > entry2[col])
					return 1;
				else
					return -1;
			}
		}); // End of function call sort().
	}
}