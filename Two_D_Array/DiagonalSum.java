package Two_D_Array;

public class DiagonalSum {

	public static void main(String[] args) {

		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int leftDiagonalSum = 0;
		int rightDiagonalSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i == j) {
					leftDiagonalSum = leftDiagonalSum + arr[i][j];
				}
			}
		}
		System.out.println("Left Diagonal Sum: "+leftDiagonalSum);
		
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr.length-1; j>=0; j--) {
				if(i == j) {
					rightDiagonalSum = rightDiagonalSum + arr[i][j];
				}
			}
		}
		System.out.println("Right Diagonal Sum: "+rightDiagonalSum);
	}

}
