package Interface;

public class Customer implements AccountOperations, LoanOperations {

	long balance = 0;
	
	@Override
	public void deposite(long amount) {

		balance = balance + amount;
		System.out.println("Balance after deposite: "+balance);
	}

	@Override
	public void withdraw(long amount) {

		if(balance >= amount) {
			balance = balance - amount;
			System.out.println("Balance after withdraw: "+balance);
		} else {
			System.out.println("Insufficient amount for withdraw");
		}
	}

	@Override
	public void applyLoan(long amount) {

		System.out.println("You applied for loan of Rs."+amount);
	}

	@Override
	public void payLoan() {

		System.out.println("You have to pay loan amount with interest");
	}
	
}
