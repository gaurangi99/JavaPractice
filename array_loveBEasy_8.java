
/*Love Babbar Documentation
 * Arrays Easy
 * https://onedrive.live.com/?authkey=%21AEi8Z5FpImxZ4ww&cid=842AECBB531CCEA4&id=842AECBB531CCEA4%218808&parId=842AECBB531CCEA4%218803&o=OneUp
 */
import java.util.*;

public class array_loveBEasy_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int temp;
		int lo = 0, mid = 0, hi = n - 1;
		while (mid <= hi) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
				break;

				// here mid is not incremented bcoz after swapping, the array from mid to hi(new
				// value after hi--) is unsorted & needs to be checked, if we increment mid,
				// then that one element in the starting is left unsorted
			}
			}
		}

//		int p=0,q=n-1;
//		for (int i = 0; i <= q; i++) {
//			if (arr[i] == 0) {
//				tmp = arr[i];
//				arr[i] = arr[p];
//				arr[p++] = tmp;
//			} else if (arr[i] == 2) {
//				tmp = arr[i];
//				arr[i] = arr[q];
//				arr[q--] = tmp;
//				i--;
//			}
//		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		}
		// TODO Auto-generated method stub
	}
}

//int n = in.nextInt();
//int[] arr = new int[n];
//for (int i = 0; i < n; i++) {
//	arr[i] = in.nextInt();
//}
//
//int p = 0, q = n - 1;
//int[] res = new int[n];
//for (int i = 0; i < n; i++) {
//	if (arr[i] == 0) {
//		res[p++] = arr[i];
//	} else if (arr[i] == 2) {
//		res[q--] = arr[i];
//	}
//}
//for(int i=p;i<=q;i++) {
//	res[i]=1;
//}
//for (int i = 0; i < n; i++) {
//	System.out.printf("%d ", res[i]);
//}