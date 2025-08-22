package SingleInheritance;

public class BankAccount {

	protected String accountHolderName;
	protected double balance;
	
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		balance += amount;
		System.out.println("Balance after deposite: "+balance);
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Balance after withdraw: "+balance);
		} else {
			System.out.println("Insufficient amount.");
		}
	}
	
	public void display() {
		System.out.println(balance);
	}
}
