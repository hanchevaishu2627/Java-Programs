package BasicJavaProject;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String menu = "";
		String choice = "";
		
		do {
			
			System.out.println("***** Taj Hotel *****");
			System.out.println("Menu Card");
			
			System.out.println("1. Starter\n2. Main Course\n3. Dessert\n4. Cold Beverages\n5.Tea");
			System.out.println("Order from above menu:");
			menu = sc.next();
			
			switch(menu) {
			
			case "1":
				System.out.println("Your order for Starter is placed successfully.");
				break;
				
			case "2":
				System.out.println("Your order for Main Course is placed successfully.");
				break;
				
			case "3":
				System.out.println("Your order for Dessert is placed successfully.");
				break;
				
			case "4":
				System.out.println("Your order for Cold Beverages is placed successfully.");
				break;
				
			case "5":
				System.out.println("Your order for Tea is placed successfully.");
				break;
				
			default:
				System.out.println("Invalid choice.");
				break;
			}
			
			System.out.println("Do you want to continue?(Yes/No):");
			choice = sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("Thank You Visit Again!");
	}

}
