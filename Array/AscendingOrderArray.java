//Sort an array element in ascending order
package Array;

public class AscendingOrderArray {

	public static void main(String[] args) {

		int number[] = {12,9,14,5,88,19,20};
		int temp;
		for(int i=0; i<number.length; i++) {
			for(int j=i+1; j<number.length; j++) {
				if(number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]+" ");
		}
	}

}
