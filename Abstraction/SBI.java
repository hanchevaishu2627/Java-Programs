package Abstraction;

public class SBI extends Bank {

	private long balance = 0;
	
	@Override
	void deposite(long amount) {

		balance = balance + amount;
		System.out.println("Balance after withdraw: "+balance);
	}

	@Override
	void withdraw(long amount) {

		if(balance >= amount) {
			balance = balance - amount;
			System.out.println("Balance after withdraw: "+balance);
		} else {
			System.out.println("Insufficient balance for withdraw");
		}
	}

	@Override
	void checkBalance() {

		System.out.println("Balance: "+balance);
	}
	
}
