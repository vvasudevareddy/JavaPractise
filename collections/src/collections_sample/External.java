package collections_sample;

public class External extends Trainer {
	
	private int distance;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public External(String trainerId,String trainerName,String trainerType,double attendanceScore,int distance) 
	{
		super(trainerId,trainerName,trainerType,attendanceScore);
		this.distance=distance;
	}
	
	public double calculateTrainerPayment()
	{
		if(distance>0&&distance<=100)
		{
			double busFee=0;
			if(distance>50&&distance<=100)
			{
				busFee=40000;
			}
			if(distance>25&&distance<=50)
			{
				busFee=35000;
			}
			if(distance>10&&distance<=25)
			{
				busFee=30000;
			}
			if(distance>0&&distance<=10)
			{
				busFee=25000;
			}
			return 15000+busFee;
		}
		return -1;
	}

}
