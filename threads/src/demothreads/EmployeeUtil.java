package demothreads;
import java.util.*;
public class EmployeeUtil {
	private List employeeList=new ArrayList<>();

	public List getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List employeeList) {
		this.employeeList = employeeList;
	}
	
	public void addDetails(EmployeeDetails e)
	{
		employeeList.add(e);
	}
	

}
