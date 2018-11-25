import java.util.*;

public class cc_EVENT {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println();
			int t = in.nextInt();
			while (t > 0) {
				String s = in.nextLine();
				String e = in.nextLine();
				int l = in.nextInt();
				int r = in.nextInt();
				int si = 0, ei = 0, durn;
				switch (s) {
				case "monday":
					si = 1;
					break;
				case "tuesday":
					si = 2;
					break;
				case "wednesday":
					si = 3;
					break;
				case "thursday":
					si = 4;
					break;
				case "friday":
					si = 5;
					break;
				case "saturday":
					si = 6;
					break;
				case "sunday":
					si = 7;
					break;
				}
				switch (e) {
				case "monday":
					ei = 1;
					break;
				case "tuesday":
					ei = 2;
					break;
				case "wednesday":
					ei = 3;
					break;
				case "thursday":
					ei = 4;
					break;
				case "friday":
					ei = 5;
					break;
				case "saturday":
					ei = 6;
					break;
				case "sunday":
					ei = 7;
					break;
				}
				System.out.println(si);
				System.out.println(ei);
				if (si > ei) {
					durn = 8 - si + ei;
				} else {
					durn = ei - si + 1;
				}
				if (l < durn && r > durn) {
					System.out.println("many");
				} else if (l == durn || r == durn) {
					System.out.println(durn);
				} else if (l > durn || r < durn) {
					System.out.println("impossible");
				}
				t--;
			}
			// TODO Auto-generated method stub
		}
	}
}