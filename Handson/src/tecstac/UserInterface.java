package tecstac;

import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of bus records to be added");
		int n = Integer.parseInt(sc.nextLine());

		BusDetails bd = new BusDetails();

		System.out.println("Enter the bus records (Bus Number:Owner Name)");
		for (int i = 0; i < n; i++) {
			String details[] = sc.nextLine().split(":");
			bd.addBusDetails(details[0], details[1]);
		}

		System.out.println("Enter the Owner name to find Bus number");
		String ownerName = sc.nextLine();

		HashSet<String> b = bd.searchBusNumbersByOwnersName(ownerName);
		if (b.isEmpty()) {
			System.out.println("No Buses were found for " + ownerName);
			return;
		}
		System.out.println("Bus Numbers of " + ownerName);
		for (Object item : b) {
			System.out.println(item);
		}

	}

}
