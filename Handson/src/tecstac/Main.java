package tecstac;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product details");
		String productDetails = sc.nextLine();

		Product p = new Product();
		try {
			p.verifyProductDetails(productDetails);
			System.out.println("Product details");
			System.out.println("Item Details: " + p.getCategory());
			System.out.println("Package type: " + p.getPackageType());
			System.out.println("Display type: " + p.getDisplayType());
			System.out.println("Is valid: " + p.getIsValid());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
