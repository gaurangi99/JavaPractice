import java.util.*;

public class Sort_Merge {

	public static void main(String[] args) {
		int n, p = 0, r;
		int a[] = new int[10];
		Sort_Merge m = new Sort_Merge();
		System.out.println("Enter size:");
		try (Scanner in = new Scanner(System.in);) {
			n = in.nextInt();
			/*
			 * System.out.println("\nEnter starting index:"); p = in.nextInt();
			 * System.out.println("\nEnter ending index:"); r = in.nextInt();
			 */
			System.out.println("Enter " + n + " integers:");
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			r = n - 1;
			m.mergeSort(a, p, r);
			m.sorted_Arr(a, p, r);
			// TODO Auto-generated method stub
		}
	}

	public void mergeSort(int[] a, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(a, p, q);
			mergeSort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}

	public void merge(int[] a, int p, int q, int r) {
		int[] L = new int[10];
		int[] R = new int[10];
		int i, j, k, n1, n2;
		n1 = q - p + 1;
		n2 = r - q;
		for (i = 0; i < n1; i++) {
			L[i] = a[p + i];
		}
		for (j = 0; j < n2; j++) {
			R[j] = a[q + j + 1];
		}
		i = j = 0;
		k = p;
		do {
			if (L[i] < R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		} while (i < n1 && j < n2);
		System.out.printf("%d %d ",i,j);
		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}
	}

	public void sorted_Arr(int[] a, int p, int r) {
		System.out.println();
		for (int i = p; i <= r; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}