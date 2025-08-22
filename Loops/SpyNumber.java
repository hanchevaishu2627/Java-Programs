package Loops;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		int no ;
		int no1;
		int rem;
		int sum = 0;
		int mul = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		no = sc.nextInt();
		no1 = no;
		
		while(no > 0) {
			rem = no % 10;
			sum = rem + rem;
			mul = rem * rem;
			no = no / 10;
		}
		 
		if(sum == mul) {
			System.out.println(no1+" is Spy number");
		} else {
			System.out.println(no1+" is not a Spy number");
		}
	}

}
