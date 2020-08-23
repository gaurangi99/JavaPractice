/*Love Babbar Documentation
 * Arrays Easy
 * https://onedrive.live.com/?authkey=%21AEi8Z5FpImxZ4ww&cid=842AECBB531CCEA4&id=842AECBB531CCEA4%218808&parId=842AECBB531CCEA4%218803&o=OneUp
 */
import java.util.*;

public class array_loveBeasy_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println();
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int tmp;
		int p=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				tmp=arr[i];
				arr[i]=arr[p];
				arr[p++]=tmp;
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
