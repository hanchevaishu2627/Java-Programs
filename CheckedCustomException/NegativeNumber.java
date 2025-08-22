package CheckedCustomException;

class NegativeNumberException extends Exception {
	public NegativeNumberException(String msg) {
		super(msg);
	}
}

public class NegativeNumber {

	public static void checkNumber(int num) throws NegativeNumberException {
		System.out.println(num);
		if(num < 0) {
			throw new NegativeNumberException("Number cannot be negative");
		}
	}
	
	public static void main(String[] args) {

		try {
			checkNumber(-5);
		} catch(NegativeNumberException e) {
			System.out.println(e);
		}
	}
}
