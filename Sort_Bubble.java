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

/**
 * public class Sort_bubble { static void bubbleSort(int[] arr) { int n =
 * arr.length; int temp = 0; for(int i=0; i < n; i++){ for(int j=1; j < (n-i);
 * j++){ if(arr[j-1] > arr[j]){ //swap elements temp = arr[j-1]; arr[j-1] =
 * arr[j]; arr[j] = temp; }
 * 
 * } }
 * 
 * } public static void main(String[] args) { int arr[] ={3,60,35,2,45,320,5};
 * 
 * System.out.println("Array Before Bubble Sort"); for(int i=0; i < arr.length;
 * i++){ System.out.print(arr[i] + " "); } System.out.println();
 * 
 * bubbleSort(arr);//sorting array elements using bubble sort
 * 
 * System.out.println("Array After Bubble Sort"); for(int i=0; i < arr.length;
 * i++){ System.out.print(arr[i] + " "); }
 * 
 * } }
 */
