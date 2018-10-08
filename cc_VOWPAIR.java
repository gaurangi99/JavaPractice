import java.util.*;

public class cc_VOWPAIR {

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in);){
			System.out.println();
			int t=in.nextInt();
			while(t>0) {
				int n=in.nextInt();
				String s=in.nextLine();
				for(int i=0;i<n;i++) {
					System.out.println(s[i]);
				}
				t--;
			}
		}
		// TODO Auto-generated method stub
	}

}
