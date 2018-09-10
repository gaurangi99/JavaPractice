import java.util.*;

public class Sort_Merge {

	public static void main(String[] args) {
		int n, p, r;
		int a[] = new int[10];
		Sort_Merge m = new Sort_Merge();
		System.out.println("Enter size:");
		try (Scanner in = new Scanner(System.in);) {
			n = in.nextInt();
			System.out.println("\nEnter starting index:");
			p = in.nextInt();
			System.out.println("\nEnter ending index:");
			r = in.nextInt();
			System.out.println("Enter " + n + " integers:");
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			m.mergeSort(a, p, r);
			m.sorted_Arr(a, p, r);
			// TODO Auto-generated method stub
		}
	}

	public void mergeSort(int[] a, int p, int r) {
		int q = (p + r) / 2;
		mergeSort(a, p, q);
		mergeSort(a, q + 1, r);
		merge(a, p, q, r);
	}

	public void merge(int[] a, int p, int q, int r) {
		int[] L = new int[10];
		int[] R = new int[10];
		int i, j, k, n1, n2;

	}

	public void sorted_Arr(int[] a, int p, int r) {
		System.out.println();
		for (int i = p; i < r; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}