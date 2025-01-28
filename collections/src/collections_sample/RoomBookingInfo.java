package collections_sample;
import java.time.LocalDate;

public class RoomBookingInfo {
	private String bookingId;
	private LocalDate stayDate;
	private String roomType;
	private int numberOfPersons;
	
	public RoomBookingInfo(String bookingId, LocalDate stayDate, String roomType, int numberOfPersons) {
		super();
		this.bookingId = bookingId;
		this.stayDate = stayDate;
		this.roomType = roomType;
		this.numberOfPersons = numberOfPersons;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getStayDate() {
		return stayDate;
	}
	public void setStayDate(LocalDate stayDate) {
		this.stayDate = stayDate;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getNumberOfPersons() {
		return numberOfPersons;
	}
	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}
	public double calculateroomCost()
	{
		double roomCost=0;
		double cost=0,extraCost=0;
		if((roomType.equals("AC")||roomType.equals("Non AC"))&&(numberOfPersons>=1&&numberOfPersons<=3))
		{
			if(roomType.equals("AC"))
			{
				cost=1800;
				extraCost=250;
			}
			if(roomType.equals("Non AC"))
			{
				cost=1500;
				extraCost=150;
			}
		}
		else
		{
			return -1;
		}
		roomCost=cost+((numberOfPersons-1)*extraCost);
		
		return roomCost;
	}

}
