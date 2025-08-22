//Count even and odd numbers from array
package Array;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {

		int number[] = new int[20];
		int eCount = 0, oCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		for(int i=0; i<number.length; i++) {
			number[i] =sc.nextInt();
		}
		for(int i=0; i<number.length; i++) {
			if(number[i]%2==0) {
				eCount++;
			} else {
				oCount++;
			}
		}
		System.out.println("Count of Even numbers: "+eCount);
		System.out.println("Count of Odd numbers: "+oCount);
	}

}
