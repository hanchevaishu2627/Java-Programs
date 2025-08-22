package SingleInheritance;

public class BankingSystem {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount("Ajay", 50000, 5);
		sa.display();
		sa.deposite(10000);
		sa.withdraw(9000);
		sa.addInterest();
	}

}
