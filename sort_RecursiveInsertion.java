import java.util.*;

public class sort_RecursiveInsertion {

	public static void main(String[] args) {
		int n, i;
		int[] a = new int[10];
		try (Scanner in = new Scanner(System.in);) {
			sort_RecursiveInsertion ri = new sort_RecursiveInsertion();
			System.out.println("Enter size of array:");
			n = in.nextInt();
			System.out.println("Array's elements are:");
			for (i = 1; i <= n; i++) {
				a[i] = in.nextInt();
			}
			ri.recursive_insertion(a, n);
			System.out.println("\nSorted array is:\n");
			for (i = 1; i <= n; i++) {
				System.out.printf("%d ", a[i]);
			}
		}
	}

	public void recursive_insertion(int a[], int n) {
		int key, i;
		if (n != 1) {
			recursive_insertion(a, n - 1);
		}
		key = a[n];
		i = n - 1;
		while (i > 0 && a[i] > key) {
			a[i + 1] = a[i];
			i--;
		}
		a[i + 1] = key;
	}// TODO Auto-generated method stub
}
