package ConditionalStatements;

public class GreatestNumber {

	public static void main(String[] args) {
		int a = 100;
		int b = 39;
		int c = 13;
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest number");
		} else if(b>a && b>c) {
			System.out.println(b+" is greatest number");
		} else {
			System.out.println(c+" is greatest number");
		}
	}

}
