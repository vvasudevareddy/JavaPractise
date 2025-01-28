package collections_sample;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class UserInterface_roomBooking {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the bookingId:");
		String bookingId=sc.nextLine();
		
		System.out.println("Enter the Stay Date");
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String stayDate=sc.nextLine();
		LocalDate l=LocalDate.parse(stayDate,dtf);
		
		System.out.println("Enter the roomType");
		String roomType=sc.nextLine();
		
		System.out.println("Enter the number of participants");
		int numberOfPersons=Integer.parseInt(sc.nextLine());
		
		RoomBookingInfo rbi=new RoomBookingInfo(bookingId,l,roomType,numberOfPersons);
		
		if(rbi.calculateroomCost()==-1)
		{
			System.out.println("Invalid Booking Details");
			return;
		}
		else
		{
			System.out.println("Booking Id:"+bookingId);
			System.out.println("Safari Date:"+stayDate);
			System.out.println("Room Type:"+roomType);
			System.out.println("Number of Persons:"+numberOfPersons);
			System.out.println("Room Booking Cost:"+rbi.calculateroomCost());
		}
	}

}
