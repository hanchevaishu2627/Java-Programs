package Two_D_Array;

public class NineElements {

	public static void main(String[] args) {

		int numbers[][] = {{32,45,87},{98,65,12},{47,90,21}};
		System.out.println("Array elements are: ");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}
