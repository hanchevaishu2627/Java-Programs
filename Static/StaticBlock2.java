package Static;

public class StaticBlock2 {

	public StaticBlock2() {
		System.out.println("Constructor called");
	}
	
	static {
		System.out.println("1st static block");
	}
	
	public void calculator() {
		System.out.println("This is a method");
	}
	
	static {
		System.out.println("2nd ststic block");
	}
	
	static {
		System.out.println("3rd static block");
	}

	public static void main(String[] args) {

		StaticBlock2 sb = new StaticBlock2();
		sb.calculator();
	}

}
