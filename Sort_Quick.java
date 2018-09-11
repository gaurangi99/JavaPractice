import java.util.*;

public class Sort_Quick {

	public static void main(String[] args) {
		int n, p, r;
		int a[] = new int[10];
		p = 0;
		Sort_Quick q = new Sort_Quick();
		System.out.println("Enter size:");
		try (Scanner in = new Scanner(System.in);) {
			n = in.nextInt();
			r = n - 1;
			System.out.println("Enter " + n + " integers:");
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			q.quickSort(a, p, r);
			q.sorted_Arr(n, a);
			// TODO Auto-generated method stub
		}
	}

	public void quickSort(int[] a, int p, int r) {
		if (p < r) {
			int q;
			q = partition(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}

	public int partition(int[] a, int p, int r) {
		int i, j, x, tmp;
		x = a[r];
		i = p;
		for (j = p; j < r; j++) {
			if (a[j] < x) {
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
			}
		}
		tmp = a[i];
		a[i] = a[r];
		a[r] = tmp;
		return i;
	}

	public void sorted_Arr(int n, int[] a) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}
