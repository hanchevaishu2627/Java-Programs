//Multiplication of two 2D array
package Two_D_Array;

public class Multiplication2DArray {

	public static void main(String[] args) {

		int [][]A = {{1,2},{3,4}};
		int [][]B = {{5,6},{7,8}};
		int [][]C = new int[2][2];
		
		System.out.println("Multiplication is:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				C[i][j] = C[i][j] + A[i][j] * B[i][j];
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}

}
