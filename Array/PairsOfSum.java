//Pair of array elements whose sum is equal to the given number
package Array;

public class PairsOfSum {

	public static void main(String[] args) {

		int arr[] = {1,11,5,7,4,6};
		int sum = 12;
		System.out.println("Pairs of elements: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i]+arr[j]) == sum) {
					System.out.println(arr[i]+"+"+arr[j]+"="+sum);
				}
			}
		}
	}

}
