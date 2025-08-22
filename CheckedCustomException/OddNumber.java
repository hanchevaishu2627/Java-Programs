package CheckedCustomException;

class OddNumberException extends Exception {
	public OddNumberException(String msg) {
		super(msg);
	}
}
public class OddNumber {

	public static void checkNum(int num) throws OddNumberException {
		System.out.println(num);
		if(num%2 != 0) {
			throw new OddNumberException("Number is odd");
		}
	}
	public static void main(String[] args) {

		try {
			checkNum(91);
		} catch(OddNumberException e) {
			System.out.println(e);
		}
	}

}
