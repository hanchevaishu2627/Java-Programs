package Encapsulation;

public class BankAccount {

	private String accountHolderName;
	private int accountNumber;
	private long balance;
	
	public BankAccount(String accountHolderName, int accountNumber, long balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposite(long amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Balance after deposite: "+balance);
		} else {
			System.out.println("Invalid Balance");
		}
	}
	
	public void withdraw(long amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Balance after withdraw: "+balance);
		} else {
			System.out.println("Insufficient balance for withdraw");
		}
	}
	
	public String getAccountDetails() {
		return "Account Holder Name: "+accountHolderName+"Account Number: "+accountNumber;
	}
	
}
