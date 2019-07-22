public enum preIdentifiedCountries {
	Cuba("2005", "Heroine"), Mexico("2000", "Hash"), Canada("2010", "Pesticides"), Brazil("2006",
			"Marijuana"), NewZealand("2014",
					"Cocaine"), Pakistan("2002", "Weapons & Arms"), Singapore("2015", "Diamonds");

	private final String yearOfEntry;
	private final String cause;

	private preIdentifiedCountries(String year, String cause) {
		this.yearOfEntry = year;
		this.cause = cause;
	}

	public String getYear() {
		return yearOfEntry;
	}

	public String getCause() {
		return cause;
	}

}
