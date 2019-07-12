public class Date {
	private int month;
	private int day;
	private int year;
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Date(int month, int day, int year) {
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException("Month " + month + " is an invalid value!");
		}
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			throw new IllegalArgumentException("Days (" + day + ") for month " + month + " are wrong!");
		}
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			throw new IllegalArgumentException("Year " + year + " is not a leap year!");
		}
		this.month = month;
		this.day = day;
		this.year = year;
		System.out.printf("Date constructor for date %s\n", this);
	}

	// Q8.14
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// Q8.8
	public String nextDay() {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			daysPerMonth[2] = 29;
			if (month < 12) {
				if (day < daysPerMonth[month]) {
					day += 1;
				} else if (day == daysPerMonth[month]) {
					month += 1;
					day = 1;
				}
			} else if (month == 12) {
				if (day < daysPerMonth[month]) {
					day += 1;
				} else if (day == daysPerMonth[month]) {
					year += 1;
					month = 1;
					day = 1;
				}
			}
		} else {
			daysPerMonth[2] = 28;
			if (month < 12) {
				if (day < daysPerMonth[month]) {
					day += 1;
				} else if (day == daysPerMonth[month]) {
					month += 1;
					day = 1;
				}
			} else if (month == 12) {
				if (day < daysPerMonth[month]) {
					day += 1;
				} else if (day == daysPerMonth[month]) {
					year += 1;
					month = 1;
					day = 1;
				}
			}
		}
		// System.out.printf("%d %d %d\n", day, month, year);
		return String.format("New Date: %d/%d/%d", month, day, year);
	}

	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}
