package Polymorphism;

class Calculator {
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition: "+c);
	}
	
	public void add(double a, double b) {
		double c = a+b;
		System.out.println("Addition: "+c);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10.5, 20.9);
	}

}
