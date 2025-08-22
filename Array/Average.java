package Array;

public class Average {

	public static void main(String[] args) {

		int arr[] = {98, 12, 45, 4, 10, 7, 54, 98, 12, 4};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array elements: "+sum);
		int avg = sum/arr.length;
		System.out.println("Avaerage of array elements: "+avg);
		
	}

}
