//Find minimum and maximum value from array
package Array;

public class MinMaxDemo {

	public static void main(String[] args) {

		int number[] = {12, 5, 28, 9, 10, 7};
		int min, max;
		max = number[0];
		for(int i=0; i<number.length;i++) {
			if(max<number[i]) {
				max = number[i];
			}
		}
		min = number[0];
		for(int i=0; i<number.length; i++) {
			if(min>number[i]) {
				min = number[i];
			}
		}
		System.out.println("Min value is: "+min+"\nMax value is: "+max);
	}

}
