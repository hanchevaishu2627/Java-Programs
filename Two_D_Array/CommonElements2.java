//Find common elements of two 2D array at different position
package Two_D_Array;

public class CommonElements2 {

	public static boolean isInArray(int arr[][], int num) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {

		int arr1[][] = {{23,90},{77,87}};
		int arr2[][] = {{90,23},{87,77}};
		int temp[] = new int[10];
		int index = 0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				int num = arr1[i][j];
				if(isInArray(arr2, num)) {
					temp[index++] = num;
				}
			}
		}
		
		System.out.println("Common elements: ");
		for(int i=0; i<index; i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}

}
