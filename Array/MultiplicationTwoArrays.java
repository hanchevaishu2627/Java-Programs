//Multiplication of two 1D arrays
package Array;

public class MultiplicationTwoArrays {

	public static void main(String[] args) {

		int arr1[] = {10,9,3,6,20,12,15};
		int arr2[] = {9,6,7,3,25,17,23};
		int mul[] = new int[7];
		
		for(int i=0; i<arr1.length; i++) {
				mul[i] = arr1[i] * arr2[i];
				System.out.print(mul[i]+" ");
		}
		
	}

}
