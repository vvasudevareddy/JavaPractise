package collections_sample;

public abstract class Trainer {
	
	private String trainerId;
	private String trainerName;
	private String trainerType;
	private double attendanceScore;
	
	public Trainer(String trainerId, String trainerName, String trainerType, double attendanceScore) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerType = trainerType;
		this.attendanceScore = attendanceScore;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerType() {
		return trainerType;
	}
	public void setTrainerType(String trainerType) {
		this.trainerType = trainerType;
	}
	public double getAttendanceScore() {
		return attendanceScore;
	}
	public void setAttendanceScore(double attendanceScore) {
		this.attendanceScore = attendanceScore;
	}
	
	abstract public double calculateTrainerPayment();
	

}
