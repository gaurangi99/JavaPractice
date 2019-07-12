public class DateAndTime1 {

	Time2 t;
	Date d;

	public DateAndTime1(int hour, int minute, int second, int month, int day, int year) {
		this.t = new Time2(hour, minute, second);
		this.d = new Date(month, day, year);
	}

	public int getHour() {
		return t.getHour();
	}

	public int getMinute() {
		return t.getMinute();
	}

	public int getSecond() {
		return t.getSecond();
	}

	public int getDay() {
		return d.getDay();
	}

	public int getMonth() {
		return d.getMonth();
	}

	public int getYear() {
		return d.getYear();
	}

	public void incrementHour() {
		if (t.getHour() < 23 && t.getMinute() < 60) {
			t.setHour(t.getHour() + 1);
		} else {
			t.setHour(0);
			d.nextDay();
		}
	}

	public String toString() {
		return String.format("%s, %s", d.toString(), t.toString());
	}
}
