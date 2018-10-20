import java.util.*;

public class cc_TSORT {
	
	public static void main(String[] args) {
		int t;
		int a[] = new int[10];
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			t = in.nextInt();
			for (int k = 0; k < t; k++)
				a[k] = in.nextInt();
			insertionSort(t, a);
			sorted_Arr(t, a);
			// TODO Auto-generated method stub
		}
	}

	public static void insertionSort(int t, int[] a) {
		int i, j, tmp;
		for (i = 1; i < t; i++)
			for (j = 0; j < i; j++) {
				if (a[j] > a[i]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
	}

	public static void sorted_Arr(int t, int[] a) {
		for (int i = 0; i < t; i++) {
			System.out.printf("%d\n", a[i]);
		}
	}
}