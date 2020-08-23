import java.util.Arrays;
import java.util.Scanner;

public class OddEven_Infogain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n, tmp, i, j = 0, k = 0, oddlen, evenlen;
		n = in.nextInt();
		int[] arr = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int[] odd = new int[n];
		int[] even = new int[n];
		for (i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even[k] = arr[i];
				k++;
			} else {
				odd[j] = arr[i];
				j++;
			}
		}
		evenlen = k;
		oddlen = j;
		// Arrays.sort(odd, 0, oddlen);
		// Arrays.sort(even, 0, evenlen);

		for (i = 0; i < oddlen - 1; i++) {
			for (j = i + 1; j < oddlen; j++) {
				if (odd[i] > odd[j]) {
					tmp = odd[i];
					odd[i] = odd[j];
					odd[j] = tmp;
				}
			}
		}
		for (i = 0; i < evenlen - 1; i++) {
			for (j = i + 1; j < evenlen; j++) {
				if (even[i] > even[j]) {
					tmp = even[i];
					even[i] = even[j];
					even[j] = tmp;
				}
			}
		}
		i = 0;
		while (i < n) {
			for (j = oddlen - 1; j >= 0; j--) {
				arr[i] = odd[j];
				i++;
			}
			for (k = 0; k < evenlen; k++) {
				arr[i] = even[k];
				i++;
			}
		}
		for (i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		}
		// TODO Auto-generated method stub
	}
}
