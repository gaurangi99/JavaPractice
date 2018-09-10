import java.util.*;

public class Sort_Insertion {

	public static void main(String[] args) {
		int n;
		int a[] = new int[10];
		Sort_Insertion i = new Sort_Insertion();
		System.out.println("Enter size:");
		try (Scanner in = new Scanner(System.in);) {
			n = in.nextInt();
			System.out.println("Enter " + n + " integers:");
			for (int k = 0; k < n; k++)
				a[k] = in.nextInt();
			i.insertionSort(n, a);
			i.sorted_Arr(n, a);
			// TODO Auto-generated method stub
		}
	}

	public void insertionSort(int n, int[] a) {
		int i, j, tmp;
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++) {
				if (a[j] > a[i]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
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