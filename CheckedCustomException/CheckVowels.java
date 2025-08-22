package CheckedCustomException;

class CheckVowelsException extends Exception {
	public CheckVowelsException(String msg) {
		super(msg);
	}
}

public class CheckVowels {

	public static void checkVowel(String str) throws CheckVowelsException {
		System.out.println(str);
		if(!str.contains("a") && !str.contains("e") && !str.contains("i") && !str.contains("o") && !str.contains("u")) {
			throw new CheckVowelsException("String does not contain vowel");
		}
	}
	
	public static void main(String[] args) {

		try {
			checkVowel("crypt");
		} catch(CheckVowelsException e) {
			System.out.println(e);
		}
	}

}
