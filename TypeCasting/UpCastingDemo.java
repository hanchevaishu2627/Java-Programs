package TypeCasting;

class Sport {
	void displayName() {
		System.out.println("Sport class");
	}
}

class Cricket extends Sport {
	void displayName() {
		System.out.println("Cricket is sport");
	}
}

class Football extends Sport {
	void displayName() {
		System.out.println("Football is sport");
	}
}

public class UpCastingDemo {

	public static void main(String[] args) {

		Sport c = new Cricket();
		c.displayName();
		
		Sport f = new Football();
		f.displayName();
	}

}
