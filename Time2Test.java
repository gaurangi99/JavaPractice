public class Time2Test {
	public static void main(String[] args) {
		// Time2Test y =new Time2Test();
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(12, 25, 42);
		Time2 t5 = new Time2(23, 59, 59);
		Time2 t6 = new Time2(t4);
		System.out.println("Constructed with:");
		displayTime("t1: all arguments defaulted", t1);
		displayTime("t2: hour specified; minute and second defaulted", t2);
		displayTime("t3: hour and minute specified; second defaulted", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Check condition for incrementation functions", t5);
		displayTime("t6: Time2 object t4 specified", t6);
		/*
		 * System.out.println("t1: all arguments defaulted"); System.out.printf(" %s\n",
		 * t1.toUniversalString()); System.out.printf(" %s\n", t1.toString());
		 * System.out.println("t2: hour specified; minute and second defaulted");
		 * System.out.printf(" %s\n", t2.toUniversalString());
		 * System.out.printf(" %s\n", t2.toString());
		 * System.out.println("t3: hour and minute specified; second defaulted");
		 * System.out.printf(" %s\n", t3.toUniversalString());
		 * System.out.printf(" %s\n", t3.toString());
		 * 
		 * System.out.println("t4: hour, minute and second specified");
		 * System.out.printf(" %s\n", t4.toUniversalString());
		 * System.out.printf(" %s\n", t4.toString());
		 * 
		 * System.out.println("t5: Time2 object t4 specified");
		 * System.out.printf(" %s\n", t5.toUniversalString());
		 * System.out.printf(" %s\n", t5.toString());
		 */

		try {
			Time2 t7 = new Time2(27, 74, 99);
		}

		catch (IllegalArgumentException e) {
			System.out.printf("\nException while initializing t7: %s\n", e.getMessage());
		}

		// Q8.8
		Date d1 = new Date(2, 28, 2000);
		Date d2 = new Date(3, 31, 2000);
		Date d3 = new Date(12, 31, 2000);
		Date d4 = new Date(2, 28, 2001);
		displayDate("d1: New date: ", d1);
		displayDate("d2: New date: ", d2);
		displayDate("d3: New date: ", d3);
		displayDate("d4: New date: ", d4);
	}

	public static void displayTime(String header, Time2 t) {
		System.out.printf("%s\n %s\n %s\n %s\n", header, t.toUniversalString(), t.toString(),
				t.toSecondSinceMidnight());
		System.out.printf("%s\n%s\n%s\n", t.tick(), t.incrementMinute(), t.incrementHour());
	}

	// Q8.8
	public static void displayDate(String header, Date d) {
		System.out.printf("%s %s\n", header, d.nextDay());
	}
}
