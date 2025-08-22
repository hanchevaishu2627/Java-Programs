package ConditionalStatements;

public class ATMSwitch {

	public static void main(String[] args) {
		int ch = 3;
		long balance = 500000;
		long withdraw = 200000;
		long deposite = 300000;
		long wAmount;
		long dAmount;
		
		System.out.println("1.Check balance \n2.Withdraw \n3.Deposite");
		
		switch(ch) {
		case 1:
			System.out.println("Your current balance is: "+balance);
			break;
			
		case 2:
			wAmount = balance - withdraw;
			System.out.println("Your balance after withdrawal: "+wAmount);
			break;
			
		case 3:
			dAmount = balance + deposite;
			System.out.println("Your balance after deposite: "+dAmount);
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

}
