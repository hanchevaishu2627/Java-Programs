//First way to declare an array
package Array;

import java.util.Scanner;

public class ArraysDemo1 {

	public static void main(String[] args) {

		String name[] = new String[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names to store: ");
		for(int i=0; i<6; i++) {
			name[i] = sc.nextLine();
		}
		System.out.println("names are: ");
		for(int i=0; i<6; i++) {
			System.out.print( name[i]+" ");
		}
	}

}
