//Print array elements
package Two_D_Array;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {

		int numbers[][] = {{23,65},{87,77}};
		System.out.println("Array elements: ");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}
