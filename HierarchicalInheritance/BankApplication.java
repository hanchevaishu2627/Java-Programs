package HierarchicalInheritance;

public class BankApplication {

	public static void main(String[] args) {

		SavingAccount s = new SavingAccount("Satish", 9000, 5);
		s.withdraw(5000);
		s.deposite(1000);
		s.addInterest();
		s.display();
		
		CurrentAccount c = new CurrentAccount("Reena" , 87000);
		c.withdraw(5000);
		c.deposite(2000);
		c.display();
	}

}
