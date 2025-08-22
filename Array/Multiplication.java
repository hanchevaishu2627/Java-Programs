//Multiplication of 1D array
package Array;

public class Multiplication {

	public static void main(String[] args) {

		int arr[] = {10,3,8,5,15,87,90};
		int mul = 1;
		for(int i=0; i<arr.length;i++) {
			mul = mul*arr[i];
		}
		System.out.println("Multiplication of array: "+mul);
	}

}
