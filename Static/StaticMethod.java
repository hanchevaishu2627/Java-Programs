package Static;

public class StaticMethod {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {

		StaticMethod sm =new StaticMethod();
		sm.add(10, 20);
		sub(10, 20);
	}

}
