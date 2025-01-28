package demothreads;

public class EmployeeDetails {
	private int eId;
	private String eName;
	private String dname;
	
	
	public EmployeeDetails(int eId, String eName, String dname) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.dname = dname;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	

}
