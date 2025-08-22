package Encapsulation;

public class BankingSystem {

	public static void main(String[] args) {

		BankAccount b = new BankAccount("Sanjay Sharma", 12345, 150000);
		System.out.println(b.getAccountDetails());
		b.deposite(10000);
		b.withdraw(5000);
		System.out.println("Balance: "+	b.getBalance());
	}

}
