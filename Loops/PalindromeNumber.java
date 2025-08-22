package Loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int no;
		int no1;
		int rem;
		int rev = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		no = sc.nextInt();
		no1 = no;
		
		while(no > 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		
		if(no1 == rev) {
			System.out.println(no1+" is a Palindrome number");
		} else {
			System.out.println(no1+" is not a Palindrome number");
		}
	}

}
