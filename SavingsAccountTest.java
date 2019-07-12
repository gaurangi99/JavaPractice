public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("%s %10s%20s%30s%17s\n", "Account Holder", "Rate", "Interest", "Initial Balance",
				"New Balance");
		System.out.printf("Saver1");
		saver1.displaySavingsAccount();
		System.out.printf("Saver2");
		saver2.displaySavingsAccount();
		SavingsAccount.modifyInterestRate(5);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Saver1");
		saver1.displaySavingsAccount();
		System.out.printf("Saver2");
		saver2.displaySavingsAccount();
		// TODO Auto-generated method stub
	}
}
