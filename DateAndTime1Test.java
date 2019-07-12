public class DateAndTime1Test {

	public static void main(String[] args) {
		DateAndTime1 D = new DateAndTime1(23, 59, 59, 2, 28, 2000);
		DateAndTime1 D1 = new DateAndTime1(23, 59, 59, 2, 28, 2001);
		DateAndTime1 D2 = new DateAndTime1(23, 59, 59, 12, 31, 1999);
		displayDateAndTime1("Initial Date and Time:\n", D);
		System.out.printf("%d\t", D.getDay());
		System.out.printf("%d\t", D.getMonth());
		System.out.printf("%d\t", D.getYear());
		System.out.printf("%d\t", D.getHour());
		System.out.printf("%d\t", D.getMinute());
		System.out.printf("%d\n", D.getSecond());
		D.incrementHour();
		displayDateAndTime1("After incrementation:\n", D);
		displayDateAndTime1("Initial Date and Time:\n", D1);
		D.incrementHour();
		displayDateAndTime1("After incrementation:\n", D1);
		displayDateAndTime1("Initial Date and Time:\n", D2);
		D.incrementHour();
		displayDateAndTime1("After incrementation:\n", D2);
		// TODO Auto-generated method stub
	}

	public static void displayDateAndTime1(String s, DateAndTime1 D) {
		System.out.printf("%sDate and Time: %s\n", s, D.toString());
	}
}
