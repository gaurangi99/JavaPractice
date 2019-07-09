public enum Book {
	JHTP("Java How to Program", "2015"), CHTP("C How to Program", "2013"), IW3HTP(
			"Internet & World Wide Web How to Program", "2012"), CPPHTP("C++ How to Program", "2011"), VBHTP(
					"Visual Basic How to Program", "2014"), CSHARPHTP("Visual C# How To Program", "2014");

	private final String title;
	private final String copyrightYear;

	Book(String title, String year) {
		this.title = title;
		this.copyrightYear = year;
	}

	public String getTitle() {
		return title;
	}

	public String getYear() {
		return copyrightYear;
	}
}
