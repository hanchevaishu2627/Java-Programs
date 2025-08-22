//Find common elements between two 2D array
package Two_D_Array;

public class CommonElements {

	public static void main(String[] args) {

		int arr1[][] = {{23,65},{77,87}};
		int arr2[][] = {{23,90},{77,3}};
		System.out.println("Common elemets of array: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(arr1[i][j] == arr2[i][j]) {
					System.out.print(arr1[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
