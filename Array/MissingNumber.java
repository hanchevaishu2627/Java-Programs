//Missing number from array
package Array;

public class MissingNumber {

	public static void main(String[] args) {

		int arr[] = {1,2,4,5};
		for(int i=1; i<arr.length; i++) {
			boolean found = false;
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] == i) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("Missing element: "+i);
			}
		}
	}

}
