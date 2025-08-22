package Loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int no;
		int no1;
		int rem;
		int arm = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		no = sc.nextInt();
		no1 = no;
		
		while(no > 0) {
			rem = no % 10;
			arm = arm + rem * rem * rem;
			no = no /10;
		}
		
		if(no1 == arm) {
			System.out.println(no1+" is a Armstrong Number");
		} else {
			System.out.println(no1+" is not a Armstrong Number");
		}
	}

}
