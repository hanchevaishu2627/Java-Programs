package Loops;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = sc.nextInt();
		int x = no;
		int rem = 0;
		int sum = 0;		
		
		while(x > 0) {
			rem = x % 10;
			sum = sum + rem;
			x = x / 10;
		}
		int r = no % sum;
		
		if(r == 0) {
			System.out.println(no+" is Harshad Number");
		} else {
			System.out.println(no+" is not a Harshad Number");
		}
	}

}
