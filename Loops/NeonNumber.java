package Loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sq = n * n;
        int sqSum = 0;
        
        while (sq > 0) {
            int d = sq % 10;
            sqSum += d;
            sq /= 10;
        }
        
        if (sqSum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }

}
