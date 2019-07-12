import java.text.NumberFormat;

public class SavingsAccount {
	private static double annualInterestRate = 4;
	private double savingsBalance;
	private double initialSavingsBalance;
	private double interest;

	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void calculateMonthlyInterest() {
		initialSavingsBalance = savingsBalance;
		interest = (savingsBalance * getAnnualInterestRate()) / 12;
		savingsBalance += interest;
	}

	public static void modifyInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public void displaySavingsAccount() {
		System.out.printf("%23f%%%18f %20s %20s", annualInterestRate, interest,
				NumberFormat.getCurrencyInstance().format(initialSavingsBalance),
				NumberFormat.getCurrencyInstance().format(savingsBalance));
		System.out.println();
	}
}
