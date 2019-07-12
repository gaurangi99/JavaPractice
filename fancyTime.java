public class fancyTime {
	private int second;
	private int minute;
	private int hour;
	private String meridian;

	public fancyTime(int hour, int minute, int second, String s) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.meridian = s;
	}

	public fancyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		if (hour < 12)
			meridian = "a.m.";
		else
			meridian = "p.m.";
	}

	public fancyTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		second = 0;
		if (hour < 12)
			meridian = "a.m.";
		else
			meridian = "p.m.";
	}

	public int getSecond() {
		return second;
	}

	public int getMinute() {
		return minute;
	}

	public int getHour() {
		return hour;
	}

	public String getMeridian() {
		return meridian;
		/*
		 * if (getHour() < 12) meridian = "a.m."; else meridian = "p.m.";
		 */
	}

	public String _24HourFormat() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	public String _12HourFormat() {
		return String.format("%02d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), getMeridian());
	}

	public String _24HourWoutSecFormat() {
		return String.format("%02d:%02d", getHour(), getMinute());
	}

	/*
	 * public String toString() { return String.format("%d:%02d:%02d %s",
	 * ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(),
	 * getSecond(), (getHour() < 12 ? "AM" : "PM")); }
	 */

}
