public enum preIdentifiedCountries {
	Cuba("Cuba", "2005", "Heroine"), Mexico("Mexico", "2000", "Hash"), Canada("Canada", "2010", "Pesticides"), Brazil(
			"Brazil", "2006", "Marijuana"), NewZealand("New Zealand", "2014", "Cocaine"), Pakistan("Pakistan", "2002",
					"Weapons & Arms"), Singapore("Singapore", "2015", "Diamonds");

	private final String name;
	private final String yearOfEntry;
	private final String cause;

	private preIdentifiedCountries(String name, String year, String cause) {
		this.name = name;
		this.yearOfEntry = year;
		this.cause = cause;
	}

	public String getName() {
		return name;
	}

	public String getYear() {
		return yearOfEntry;
	}

	public String getCause() {
		return cause;
	}
}
