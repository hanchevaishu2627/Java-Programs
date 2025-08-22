//Addition of two 2D array
package Two_D_Array;

public class Addition2DArray {

	public static void main(String[] args) {

		int arr1[][] = {{23,65},{88,78}};
		int arr2[][] = {{45,90},{9,3}};
		int sum=0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; i++) {
				sum = arr1[i][j] + arr2[i][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}
