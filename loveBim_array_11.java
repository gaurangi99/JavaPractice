/* https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
 * Love Babbar Documentation
 * Arrays Intermediate 11- Order was maintained in the elements
 * 
 * Time Complexity: O(n^2) bcoz of cyclic rotation inside the loop on array, this can be done for every element on the whole length of array
 * Space Complexity: O(1)
 */
import java.util.*;

public class loveBim_array_11 {

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

			int outOfPlace = -1;
			int tmp;
			for (int i = 0; i < size; i++) {
				if (outOfPlace >= 0) { // once we find an OutOfPlace element we look for the next opposite sign element
										// (as it is the right element for this place)
										// as that element should be at this place
					if ((a[i] < 0 && a[outOfPlace] >= 0) || (a[i] >= 0 && a[outOfPlace] < 0)) { // check for opposite signs
						for (int j = outOfPlace; j <= i; j++) { // applying cyclic rotation (right rotation) including
																// the indices outOfPlace & i, in order to place elements right on
																// their position & also to maintain the order of
																// elements
							tmp = a[i];
							a[i] = a[j];
							a[j] = tmp;
						}

						if (i - outOfPlace > 2) { // here OutOfPlace is incremented only 2 places bcoz only the
													// a[OutPlace] & a[i] got their right places after rotation, as now
													// the order in terms of values is a[i],a[OutOfPlace], (remaining
													// array)...therefore excluding these two elements, the remaining
													// elements can still be wrong in their order & that is why
													// OutOfPlace is incremented by 2
							outOfPlace += 2;
						} else { // if <=2 i.e. the next element to OutOfPlace element was only of opp. sign so
									// they were rotated & both got their right places, so now the same story starts
									// with OutOfPlace=-1 & from index i, as till i-1 the array is correctly
									// arranged with +ve & -ve elements
							outOfPlace = -1;
						}
					}
				}

				if (outOfPlace == -1) {
					if ((a[i] < 0 && (i % 2) != 0) || (a[i] >= 0 && (i % 2) != 1)) // checking if the elements are at
																					// their right place or not, as in a
																					// -ve element should be at even
																					// index & +ve element at odd index,
																					// if not then it is an OutOfPlace
																					// element
						outOfPlace = i;
				}
			}

			for (int i = 0; i < size; i++) {
				System.out.printf("%d ", a[i]);
			}
			System.out.println();
		}
	}

}