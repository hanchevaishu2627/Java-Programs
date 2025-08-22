package HierarchicalInheritance;

public class SavingAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingAccount(String accountHolderName, double balance, double interestRate) {
		super(accountHolderName, balance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interest = (balance * interestRate) / 100;
		balance += interest;
		System.out.println("Account Balance: "+balance);
	}

}
