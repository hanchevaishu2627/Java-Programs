package Loops;

import java.util.Scanner;

public class DigitAddition {

	public static void main(String[] args) {
		int rem;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		
		while(num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
