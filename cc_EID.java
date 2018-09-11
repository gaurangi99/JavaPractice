import java.util.Scanner;
import static java.lang.Math.abs;

public class cc_EID {
	int[] a = new int[10];
	int b;

	public static void main(String[] args) {
		int t, i;
		long n;
		int[] v = new int[10];
		int[] d = new int[10];
		System.out.println();
		try (Scanner in = new Scanner(System.in);) {
			cc_EID s = new cc_EID();
			t = in.nextInt();
			while (t > 0) {
				n = in.nextInt();
				for (i = 0; i < n; i++) {
					v[i] = in.nextInt();
				}
				s.sort(v, n);
				for (i = 0; i < n - 1; i++) {
					d[i] = abs(v[i + 1] - v[i]);
				}
				s.sort(d, n - 1);
				System.out.printf("%d\n", d[0]);
				t--;
			}
		}
	}

	public void sort(int[] a, long b) {
		int l, m, tmp;
		for (l = 1; l < b; l++) {
			for (m = 0; m < l; m++) {
				if (a[m] > a[l]) {
					tmp = a[l];
					a[l] = a[m];
					a[m] = tmp;
				}
			}
		}
	}
	// TODO Auto-generated method stub
}

/*import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.Math.abs;

//Name of the class has to be "Main" only if the class is public.
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int t, i;
	    long n;
		int[] v = new int[10];
		int[] d = new int[10];
		System.out.println();
		try (Scanner in = new Scanner(System.in);) {
			Codechef s = new Codechef();
			t = in.nextInt();
			while (t > 0) {
				n = in.nextInt();
				for (i = 0; i < n; i++) {
					v[i] = in.nextInt();
				}
				s.sort(v, n);
				for (i = 0; i < n - 1; i++) {
					d[i] = abs(v[i] - v[i + 1]);
				}
				s.sort(d, n - 1);
				System.out.printf("%d\n", d[0]);
				t--;
			}
		}	// your code goes here
	}
	public void sort(int[] a, long b) {
		int l, m, tmp;
		for (l = 1; l < b; l++) {
			for (m = 0; m < l; m++) {
				if (a[m] > a[l]) {
					tmp = a[l];
					a[l] = a[m];
					a[m] = tmp;
				}
			}
		}
	}
}*/
