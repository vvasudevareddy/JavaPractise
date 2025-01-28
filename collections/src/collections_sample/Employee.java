package collections_sample;

import java.time.LocalDate;

public class Employee {

	private String eno;
	private LocalDate doj;

	public Employee(String eno, LocalDate doj) {
		super();
		this.eno = eno;
		this.doj = doj;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

}