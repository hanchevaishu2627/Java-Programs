//Searching of an array element
package Array;

import java.util.Scanner;

public class SearchingArray {

	public static void main(String[] args) {

		int arr[] = {12,9,56,8,23,67};
		int search;
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search: ");
		search = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == search) {
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("Number is present in array");
		} else {
			System.out.println("Number is not present in array");
		}
	}

}
