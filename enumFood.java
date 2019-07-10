import java.util.EnumSet;

public class enumFood {
	public static void main(String[] args) {
		System.out.println("Given Food:");
		for (Food food : Food.values())
			System.out.printf("%-10s%-10s%-5s\n", food, food.getType(), food.getCalories());
		// TODO Auto-generated method stub
	}
}
