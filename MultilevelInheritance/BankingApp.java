package MultilevelInheritance;

public class BankingApp {

	public static void main(String[] args) {

		PremiumSavingAccount p = new PremiumSavingAccount("Reena", 50000, 5,2);
		p.display();
		p.deposite(100000);
		p.withdraw(200000);
		p.addInterest();
		p.getCashBackRate(20000);
	}

}
