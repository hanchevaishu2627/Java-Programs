//Print alternate numbers of array
package Array;

public class AlternateNumbers {

	public static void main(String[] args) {

		int number[] = {1,2,3,4,5,6,7};
		for(int i=0; i<number.length; i=i+2) {
			System.out.println(number[i]+" ");
		}
	}

}
