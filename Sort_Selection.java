import java.util.*;

public class Sort_Selection {

	public static void main(String[] args) {
		int n;
		int a[] = new int[10];
		Sort_Selection s = new Sort_Selection();
		System.out.println("Enter size:");
		try (Scanner in = new Scanner(System.in);) {
			n = in.nextInt();
			System.out.println("Enter " + n + " integers:");
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			s.selectionSort(n, a);
			s.sorted_Arr(n, a);
			// TODO Auto-generated method stub
		}
	}

	public void selectionSort(int n, int[] a) {
		int i, j, tmp;
		for (i = 0; i < n - 1; i++)
			for (j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
	}

	public void sorted_Arr(int n, int[] a) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}