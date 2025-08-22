package Operators;

public class IncrementDecrement3 {

	public static void main(String[] args) {
		int y = 8;
		y+= ++y + y-- + --y;
		System.out.println(y);
	}

}
