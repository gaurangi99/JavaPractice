/*https://www.geeksforgeeks.org/rearrange-array-in-alternating-positive-negative-items-with-o1-extra-space-set-2/
 * Love Babbar Documentation
 * Arrays Intermediate 11_variation- Order is not important in the elements, just rearrange
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.*;

public class loveBim_array_11_variation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int size = in.nextInt();
			int[] a = new int[size];
			for (int i = 0; i < size; i++) {
				a[i] = in.nextInt();
			}

			int i = 0, ptr = 0;
			int tmp;
			for (i = 0; i < size; i++) {
				if ((a[i] < 0 && (i % 2) != 0) || (a[i] >= 0 && (i % 2) != 1)) {
					while (ptr <= i) {
						if ((a[ptr] < 0 && (ptr % 2) == 0) || (a[ptr] >= 0 && (ptr % 2) == 1))
							ptr++;
						else
							break;
					}
					tmp = a[i];
					a[i] = a[ptr];
					a[ptr] = tmp;
				}
			}

			for (i = 0; i < size; i++) {
				System.out.printf("%d ", a[i]);
			}
			System.out.println();
		}
	}

}
