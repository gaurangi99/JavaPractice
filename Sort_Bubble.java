import java.util.Scanner;

public class Sort_Bubble {

	public static void main(String[] args) {
		int n;
		int a[] = new int[10];
		Sort_Bubble b = new Sort_Bubble();
		System.out.println("Enter size:");
		try (Scanner in = new Scanner(System.in);) {
			n = in.nextInt();
			System.out.println("Enter " + n + " integers:");
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			b.bubbleSort(n, a);
			b.sorted_Arr(n, a);
			// TODO Auto-generated method stub
		}
	}

	public void bubbleSort(int n, int[] a) {
		int i, j, tmp;
		for (i = 0; i < n; i++)
			for (j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
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