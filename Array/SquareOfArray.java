//Square of 10 array numbers
package Array;
import java.util.Scanner;

public class SquareOfArray {

	public static void main(String[] args) {

		int numbers[] = new int[10];
		int sq;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers for square: ");
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();		
		}
		for(int j=0; j<numbers.length; j++) {
			sq = numbers[j] * numbers[j];
			System.out.println("Square of "+numbers[j]+" is: "+sq);
		}
	}

}
