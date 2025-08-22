package ConditionalStatements;

public class SwitchCase2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		int ch = 8;
		
		switch(ch) {
		case 1:
			c = a+b;
			System.out.println("Addition: "+c);
			break;
			
		case 2:
			c= a-b;
			System.out.println("Substraction: "+c);
			break;
			
		case 3:
			c = a*b;
			System.out.println("Multiplication: "+c);
			break;
			
		case 4:
			c = a/b;
			System.out.println("Division: "+c);
			break;
			
		case 5:
			c = a%b;
			System.out.println("Modulus: "+c);
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

}
