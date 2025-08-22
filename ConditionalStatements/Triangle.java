package ConditionalStatements;

public class Triangle {

	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		int c = 10;
		if(a==b && b==c && a==c) {
			System.out.println("Triangle is Equilateral");
		} else if (a!=b && b!=c && a!=c) {
			System.out.println("Triangle is Scaler");
		} else {
			System.out.println("Triangle is Isoscaler");
		}
	}

}
