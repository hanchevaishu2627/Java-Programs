package HierarchicalInheritance;

public class CurrentAccount extends BankAccount{

	private double overDraftLimit = 1000;
	
	public CurrentAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
	}
	
	public void withdraw(double amount) {
		if((balance + overDraftLimit) >= amount) {
			balance -= amount;
			System.out.println("New BAlalnce: "+balance);
		} else {
			System.out.println("Withdraw failed! Exceeds overdraft limit.");
		}
	}

}
