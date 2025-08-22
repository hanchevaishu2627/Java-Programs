package Loops;

import java.util.Scanner;

public class PrintSeperateDigit {

	public static void main(String[] args) {
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		while (num > 0) {
			rem = num % 10;
			System.out.println(rem);
			num /= 10;
		}
	}

}
