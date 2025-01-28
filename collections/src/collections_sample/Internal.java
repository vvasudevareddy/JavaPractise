package collections_sample;

public class Internal extends Trainer{
	
	private int numberOfBatches;

	public int getNumberOfBatches() {
		return numberOfBatches;
	}

	public void setNumberOfBatches(int numberOfBatches) {
		this.numberOfBatches = numberOfBatches;
	}

	public Internal(String trainerId,String trainerName,String trainerType,double attendanceScore,int numberOfBatches) 
	{
		super(trainerId,trainerName,trainerType,attendanceScore);
		this.numberOfBatches=numberOfBatches;
	}
	
	public double calculateTrainerPayment()
	{
		double actualFee=15000;
		double extraFee=0;
		if(numberOfBatches>0 && numberOfBatches<=4)
		{
			extraFee= numberOfBatches==4?5000:(numberOfBatches==3)?10000:(numberOfBatches==2)?15000:20000;
		}
		else
		{
			return -1;
		}
		return actualFee+extraFee;
	}
	
}
