public class fancyTimeTest {

	public static void main(String[] args) {
		fancyTime f1 = new fancyTime(23, 59, 59, "p.m.");
		fancyTime f2 = new fancyTime(11, 59, 59, "a.m.");
		fancyTime f3 = new fancyTime(12, 0, 0);
		fancyTime f4 = new fancyTime(0, 1);
		displayTime(1, f1);
		displayTime(2, f1);
		displayTime(3, f1);
		displayTime(1, f2);
		displayTime(2, f2);
		displayTime(3, f2);
		displayTime(1, f3);
		displayTime(2, f3);
		displayTime(3, f3);
		displayTime(1, f4);
		displayTime(2, f4);
		displayTime(3, f4);
		// TODO Auto-generated method stub
	}

	public static void displayTime(int flag, fancyTime f) {
		if (flag == 1)
			System.out.printf("Time: %s\n", f._12HourFormat());
		else if (flag == 2)
			System.out.printf("Time: %s\n", f._24HourFormat());
		else
			System.out.printf("Time: %s\n", f._24HourWoutSecFormat());
	}
}
