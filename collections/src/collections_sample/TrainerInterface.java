package collections_sample;

import java.util.Scanner;
public class TrainerInterface {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Trainer Id");
		String trainerId=sc.nextLine();
		
		System.out.println("Enter trainer name");
		String trainerName=sc.nextLine();
		
		
		System.out.println("Enter Trainer Type");
		String trainerType=sc.nextLine();
		
		System.out.println("Enter Trainer's attendance score");
		double attendanceScore=Double.parseDouble(sc.nextLine());
		
		if(trainerType.equalsIgnoreCase("External"))
		{
			System.out.println("Enter the distance of the house location");
			int distance=Integer.parseInt(sc.nextLine());
			
			External t=new External(trainerId,trainerName,trainerType,attendanceScore, distance);
			double feesToBePaid=t.calculateTrainerPayment();
			if(feesToBePaid==-1)
			{
				System.out.println("Invalid ");
				return;
			}
			System.out.println(trainerType);
			System.out.println("Total Fee to be paid is "+feesToBePaid);
		}
		else if(trainerType.equalsIgnoreCase("Internal"))
		{
			System.out.println("Enter the Number of Batches");
			int numberOfBatches=Integer.parseInt(sc.nextLine());
			
			Internal i=new Internal(trainerId,trainerName,trainerType,attendanceScore, numberOfBatches);
			double feesToBePaid=i.calculateTrainerPayment();
			if(feesToBePaid==-1)
			{
				System.out.println("Invalid ");
				return;
			}
			System.out.println(trainerType);
			System.out.println("Total Fee to be paid is "+feesToBePaid);
		}
		else
		{
			System.out.println(trainerType+" is an invalid trainer type.");
		}
		
		
	}

}
