package Operators;

public class PrePostIncrement {

	public static void main(String[] args) {
		int a = 5;
		int b = ++a + a++ + a++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
