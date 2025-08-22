package ConditionalStatements;

public class IfElseLadder {

	public static void main(String[] args) {
		int no = -20;
		if(no > 0) {
			System.out.println(no+" is positive number");
		} else if(no < 0) {
			System.out.println(no+" is negavtive number");
		} else {
			System.out.println(no+" is unsigned number");
		}
	}

}
