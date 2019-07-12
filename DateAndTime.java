public class DateAndTime {
	private int hour;
	private int minute;
	private int second;
	private int month;
	private int day;
	private int year;
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public DateAndTime(int hour, int minute, int second, int month, int day, int year) {
		setTime(hour, minute, second);
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24)
			this.hour = hour;
		else
			throw new IllegalArgumentException("hour must be 0-23");
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60)
			this.minute = minute;
		else
			throw new IllegalArgumentException("minute must be 0-59");
	}

	public void setSecond(int second) {
		if (second >= 0 && second < 60)
			this.second = ((second >= 0 && second < 60) ? second : 0);
		else
			throw new IllegalArgumentException("second must be 0-59");
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String tick() {
		if (second < 59) {
			second += 1;
		} else if (minute < 59 && second == 59) {
			second = 0;
			minute += 1;
		} else if (hour < 23 && minute == 59) {
			minute = 0;
			hour += 1;
		} else {
			hour = minute = second = 0;
			nextDay();
		}
		return String.format("Second incremented: %02d:%02d:%02d", hour, minute, second);
	}

	public String incrementMinute() {
		if (minute < 59 && second < 60) {
			minute += 1;
		} else if (hour < 23 && minute == 59) {
			minute = 0;
			hour += 1;
		} else {
			hour = minute = 0;
			nextDay();
		}
		return String.format("Minute incremented: %02d:%02d:%02d", hour, minute, second);
	}

	public String incrementHour() {
		if (hour < 23 && minute < 60 && second < 60) {
			hour += 1;
		} else {
			hour = 0;
			nextDay();
		}
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

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
		return String.format("%d/%d/%d", month, day, year);
	}

	public String toUniversalString() {
		return String.format("%d/%d/%d, %02d:%02d:%02d", month, day, year, getHour(), getMinute(), getSecond());
	}

	public String toString() {
		return String.format("%d/%d/%d, %d:%02d:%02d %s", month, day, year,
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(),
				(getHour() < 12 ? "AM" : "PM"));
	}
}
