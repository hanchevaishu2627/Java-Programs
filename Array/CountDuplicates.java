//Count duplicate elements in array
package Array;

public class CountDuplicates {

	public static void main(String[] args) {

		int arr[] = {98,12,45,4,10,7,54,98,12,4};
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println("Count of duplicate elements: "+count);
	}

}
