package Abstraction;

public class BankingAbstraction {

	public static void main(String[] args) {

		Bank b = new SBI();
		b.deposite(10000);
		b.withdraw(1000);
		b.checkBalance();
	}

}
