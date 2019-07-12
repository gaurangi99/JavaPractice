public class Time2 {
	private int hour;
	private int minute;
	private int second;

	public Time2() {
		this(0, 0, 0);
	}

	public Time2(int hour) {
		this(hour, 0, 0);
	}

	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}

	public Time2(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
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

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}

	// Q8.5
	public String toSecondSinceMidnight() {
		int secondSM = second + 60 * minute + 60 * 60 * hour;
		return String.format("Total %d seconds since midnight.\n", secondSM);
	}

	// Q8.7
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
		}
		return String.format("Minute incremented: %02d:%02d:%02d", hour, minute, second);
	}

	public String incrementHour() {
		if (hour < 23 && minute < 60) {
			hour += 1;
		} else {
			hour = 0;
		}
		return String.format("Hour incremented: %02d:%02d:%02d", hour, minute, second);
	}
}