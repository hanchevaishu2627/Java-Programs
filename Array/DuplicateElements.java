//Print duplicate elements
package Array;

public class DuplicateElements {

	public static void main(String[] args) {

		int arr[] = {98,12,45,4,10,7,54,98,12,4,10};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					boolean isDuplicate = true;
					if(isDuplicate) {
						System.out.println(arr[i]);
					}
					break;
				}
			}
		}
		
	}

}
