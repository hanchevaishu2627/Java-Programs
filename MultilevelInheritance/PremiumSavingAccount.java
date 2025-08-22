package MultilevelInheritance;

public class PremiumSavingAccount extends SavingAccount{

	double cashBackRate;
	
	public PremiumSavingAccount(String accountHolderName, double balance, double interestRate, double cashBackRate) {
		super(accountHolderName, balance, interestRate);
		this.cashBackRate = cashBackRate;
	}
	
	public void getCashBackRate(double amount) {
		double cashBack = amount * (cashBackRate / 100);
		balance += cashBack;
		System.out.println("Update Balance: "+balance);
	}

}
