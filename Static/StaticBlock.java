package Static;

public class StaticBlock {

	static String collegeName;
	
	static {
		String collegeName = "IIT";
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {

		System.out.println("Main Method");
	}

}
