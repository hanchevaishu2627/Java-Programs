package Operators;

public class IncrementDecrement2 {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z = 1;
		int v = x + --z + y++ + y;
		System.out.println(v);
	}

}
