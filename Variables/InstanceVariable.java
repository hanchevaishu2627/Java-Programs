package Variables;

public class InstanceVariable {
	int num = 10;
	
	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		iv.add();
	}
	void add() {
		int a = 10;
		int b =a + num;
		System.out.println(b);
	}

}
