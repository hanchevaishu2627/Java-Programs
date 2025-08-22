package Polymorphism;

class PaymentMethod {
	
	public void processPayment() {
		System.out.println("Payment Processed");
	}
}

class CreditCard extends PaymentMethod {
	
	public void processPayment() {
		int cvv = 366;
		long expiryDate = 2026;
		long amount = 60000;
		System.out.println("Credit card payment done of Rs."+amount);
	}
}

class UPIPayment extends PaymentMethod {
	
	public void processPayment() {
		String upiId = "BUPI98765";
		long amount = 10000;
		int pin = 1234;
		System.out.println("UPI payment done of Rs."+amount);
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

		CreditCard c = new CreditCard();
		c.processPayment();
		
		UPIPayment p = new UPIPayment();
		p.processPayment();
	}

}
