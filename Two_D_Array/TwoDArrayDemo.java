//Take input from user and print array elements
package Two_D_Array;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int numbers[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array elemets: ");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}
