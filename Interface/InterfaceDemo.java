package Interface;

public class InterfaceDemo {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.deposite(100000);
		c.withdraw(10000);
		c.applyLoan(200000);
		c.payLoan();
	}

}
