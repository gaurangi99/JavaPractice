/* https://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
 * Love Babbar Documentation
 * Arrays Intermediate 
 * 
 * Scanner in = new Scanner(System.in);
		System.out.println();
		int t=in.nextInt();
		while(t-->0){
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
 */
import java.util.*;

public class loveBim_array_2Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int xor = a[0];
		for (int i = 1; i < n; i++) {
			xor ^= a[i];
		}
		for (int i = 1; i <= n - 2; i++) {
			xor ^= i;
		}

		System.out.println(~(xor - 1));
		int setBit = xor & ~(xor - 1);
		System.out.println(setBit);

		int x = 0, y = 0;
		for (int i = 0; i < n; i++) {
			int p = a[i] & setBit;
			if (p != 0)
				x = x ^ a[i]; /* XOR of first set in arr[] */
			else
				y = y ^ a[i]; /* XOR of second set in arr[] */
		}
		for (int i = 1; i <= n - 2; i++) {
			int p = i & setBit;
			if (p != 0)
				x = x ^ i; /* XOR of first set in arr[] and {1, 2, ...n } */
			else
				y = y ^ i; /* XOR of second set in arr[] and {1, 2, ...n } */
		}

		System.out.println("The two reppeated elements are :");
		System.out.println(x + " " + y);

	}

}
