public class DateAndTimeTest {

	public static void main(String[] args) {
		DateAndTime d = new DateAndTime(23, 59, 59, 2, 28, 2000);
		DateAndTime d1 = new DateAndTime(23, 59, 59, 2, 28, 2001);
		DateAndTime d2 = new DateAndTime(23, 59, 59, 12, 31, 1999);
		displayDateAndTime("Initial Date and Time:", d);
		d.incrementHour();
		displayDateAndTime("After incrementation:", d);
		displayDateAndTime("Initial Date and Time:", d1);
		d1.incrementHour();
		displayDateAndTime("After incrementation:", d1);
		displayDateAndTime("Initial Date and Time:", d2);
		d2.incrementHour();
		displayDateAndTime("After incrementation:", d2);
		// TODO Auto-generated method stub
	}

	public static void displayDateAndTime(String s, DateAndTime d) {
		System.out.printf("%s\nUniversal Date and Time: %s\nDate and Time: %s\n", s, d.toUniversalString(), d);
	}
}
