public enum Food {
	APPLE("Fruit", "50 cal"), BANANA("Fruit", "200 cal"), CARROT("Vegetable", "50 cal");

	private final String type;
	private final String calories;

	Food(String type, String calories) {
		this.type = type;
		this.calories = calories;
	}

	public String getType() {
		return type;
	}

	public String getCalories() {
		return calories;
	}
}
